package com.jhl.admin.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.jhl.admin.Interceptor.PreAuth;
import com.jhl.admin.VO.ChangePasswordVO;
import com.jhl.admin.VO.UserVO;
import com.jhl.admin.cache.UserCache;
import com.jhl.admin.constant.enumObject.WebsiteConfigEnum;
import com.jhl.admin.model.Account;
import com.jhl.admin.model.InvitationCode;
import com.jhl.admin.model.User;
import com.jhl.admin.repository.AccountRepository;
import com.jhl.admin.repository.InvitationCodeRepository;
import com.jhl.admin.repository.UserRepository;
import com.jhl.admin.service.EmailService;
import com.jhl.admin.service.ServerConfigService;
import com.jhl.admin.service.UserService;
import com.jhl.admin.service.v2ray.ProxyEvent;
import com.jhl.admin.service.v2ray.ProxyEventService;
import com.jhl.admin.util.Utils;
import com.jhl.admin.util.Validator;
import com.ljh.common.model.Result;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;
    @Autowired
    EmailService emailService;
    @Autowired
    UserCache userCache;
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    ServerConfigService serverConfigService;
    @Autowired
    InvitationCodeRepository invitationCodeRepository;
    public static final String COOKIE_NAME = "auth";

    @Autowired
    ProxyEventService proxyEventService;

    @PostMapping("/login")
    public Result login(@RequestBody UserVO user, HttpServletRequest request, HttpServletResponse response) {
        user.setPassword(DigestUtils.md5Hex(StringUtils.trim(user.getPassword())));
        User loginUser = userService.login(user);
        UserVO userVO = loginUser.toVO(UserVO.class);
        String cKey = Utils.getCharAndNum(10);
        Cookie cookie = new Cookie(COOKIE_NAME, cKey);
        // cookie.setDomain(domain);
        //12?????????
        cookie.setMaxAge(60 * 60 * 12);
        cookie.setPath("/");
        // xss
     //   cookie.setHttpOnly(true);
        response.addCookie(cookie);
        userCache.setCache(cKey, userVO);

        return Result.buildSuccess(userVO, null);
    }


    @GetMapping("/logout")
    public Result logout(@CookieValue(value = COOKIE_NAME, defaultValue = "") String auth, HttpServletResponse response) {
        if (auth != null) {
            Cookie cookie = new Cookie(COOKIE_NAME, "");
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        userCache.rmCache(auth);
        return Result.doSuccess();
    }

    /**
     * @param email
     * @param type  reg,forgot
     * @return
     */
    @GetMapping("/send-email")
    public Result getVCode(String email, String type, String inviteCode) {
        if (type == null) throw new NullPointerException("??????????????????????????????");
        boolean isNeedInviteCode = checkIsNeedInviteCode();
        //?????????
        if (isNeedInviteCode && type.equals("reg")) {
            if (StringUtils.isBlank(inviteCode)) throw new NullPointerException("?????????????????????");
            InvitationCode invitationCode = invitationCodeRepository.findOne(Example.of(InvitationCode.builder().inviteCode(inviteCode.trim()).status(0).build())).orElse(null);
            if (invitationCode == null) throw new NullPointerException("??????????????????/?????????");
            //??????????????????
            if (invitationCode.getEffectiveTime() != null && invitationCode.getEffectiveTime().before(new Date())){
                throw  new IllegalArgumentException("?????????????????????");
            }
        }
        UserVO userVO = userService.getOne(User.builder().email(email).build());
        if (type.equals("reg")) {
            if (userVO != null) throw new NullPointerException("??????????????????");
        } else if (type.equals("forgot")) {
            if (userVO == null) throw new RuntimeException("???????????????");
        } else {
            throw new UnsupportedOperationException("??????????????????");

        }
        emailService.sendVCode(email);
        return Result.doSuccess();
    }

    @PostMapping("/reg")
    public Result reg(@RequestBody UserVO userVO, String vCode) {

        InvitationCode invitationCode = null;
        boolean isNeedInviteCode = checkIsNeedInviteCode();
        if (isNeedInviteCode) {
            String inviteCode = userVO.getInviteCode();
            if (StringUtils.isBlank(inviteCode)) throw new NullPointerException("?????????????????????");
            invitationCode = invitationCodeRepository.findOne(Example.of(InvitationCode.builder().inviteCode(inviteCode.trim()).status(0).build())).orElse(null);
            if (invitationCode == null) throw new NullPointerException("??????????????????/?????????");
            final Date effectiveTime = invitationCode.getEffectiveTime();
            //??????????????????
            if (effectiveTime != null && effectiveTime.before(new Date())){
                throw  new IllegalArgumentException("?????????????????????");
            }
        }

        userVO.setVCode(vCode);
        userVO.setRole("vip");
        final User user = userVO.toModel(User.class);
        userService.reg(user);

        if (isNeedInviteCode) {
            invitationCode.setRegUserId(user.getId());
            invitationCode.setStatus(1);
            invitationCodeRepository.save(invitationCode);
        }
        return Result.doSuccess();
    }

    private boolean checkIsNeedInviteCode() {
        return serverConfigService.checkKey(WebsiteConfigEnum.IS_NEED_INVITE_CODE.getKey());
    }

    @PostMapping("/forgot")
    public Result forgot(@RequestBody UserVO user, String vCode) {
        user.setVCode(vCode);
        userService.changePassword(user.toModel(User.class));
        return Result.doSuccess();
    }

    /**
     * ???????????????????????????
     * @return
     */
    @PreAuth("vip")
    @PostMapping("/change-password")
    public Result changePassword(@RequestBody ChangePasswordVO changePasswordVO ,@CookieValue(value = COOKIE_NAME, defaultValue = "") String auth) {
        Assert.notNull(changePasswordVO, "??????????????????");
        UserVO user = userCache.getCache(auth);
        Integer id = user.getId();
        userService.changePassword(id,changePasswordVO.getOldPassword(),changePasswordVO.getNewPassword());
        return Result.doSuccess();
    }

    /**
     * cache
     *
     * @param auth
     * @return
     */
    // @PreAuth("vip")
    @GetMapping("/info")
    public Result getUserInfo(@CookieValue(value = COOKIE_NAME, defaultValue = "") String auth) {
        if (StringUtils.isBlank(auth)) return Result.builder().code(403).message("?????????").build();
        UserVO cache = userCache.getCache(auth);
        if (cache == null) return Result.builder().code(403).message("????????????????????????????????????").build();
        Map<String, Object> userMap = Maps.newHashMap();
        userMap.put("roles", Lists.newArrayList(cache.getRole()));
        userMap.put("name", cache.getEmail());
        userMap.put("avatar", "https://apic.douyucdn.cn/upload/avanew/face/201705/15/17/109dae304969a8dc9dfd318c34cb71e9_middle.jpg");
        return Result.builder().code(Result.CODE_SUCCESS).obj(userMap).build();
    }

    /**
     * admin
     *
     * @param page
     * @param pageSize
     * @return
     */
    @PreAuth("admin")
    @GetMapping("")
    public Result userList(Integer page, Integer pageSize) {
        Page<User> userPage = userRepository.findAll(PageRequest.of(page - 1, pageSize));
        List<User> content = userPage.getContent();

        ArrayList<UserVO> list = Lists.newArrayListWithCapacity(content.size());
        if (content != null) {

            content.forEach(user -> {
                user.setPassword(null);
                list.add(user.toVO(UserVO.class));
            });
        }
        return Result.buildPageObject(userPage.getTotalElements(), list);
    }

    /**
     * admin
     */
    @PreAuth("admin")
    @PostMapping("/addRemark")
    public Result addRemark(@RequestBody UserVO user) {
        if (user == null || user.getId() == null || user.getRemark() == null) throw new RuntimeException("??????????????????");
        userService.addRemark(user.getId(), user.getRemark());
        return Result.doSuccess();
    }

    /**
     * admin
     *
     * @param id
     * @return
     */
    @PreAuth("vip")
    @GetMapping("/{id}")
    public Result getUser(@PathVariable Integer id) {
        Validator.isNotNull(id);
        return Result.buildSuccess(userRepository.getOne(id).toVO(UserVO.class), null);
    }

    /**
     * admin ??????
     *
     * @param id
     * @return
     */
    @PreAuth("admin")
    @DeleteMapping("/{id}")
    public Result deleteUser(@CookieValue(COOKIE_NAME) String auth, @PathVariable Integer id) {
        Validator.isNotNull(id);
        Validator.isNotNull(auth);
        UserVO cacheUser =  userCache.getCache(auth);
        if (cacheUser.getId().equals(id)) throw new RuntimeException("????????????????????????");

        List<Account> accounts = accountRepository.findAll(Example.of(Account.builder().userId(id).build()));

        for (Account account : accounts) {
            if (account.getServerId() == null) continue;
            proxyEventService.addProxyEvent(
                    proxyEventService.buildV2RayProxyEvent(account, ProxyEvent.RM_EVENT));
        }


        userRepository.deleteById(id);
        if (accounts != null)
            accountRepository.deleteAll(accounts);

        return Result.doSuccess();
    }

    /**
     * admin -????????????
     *
     * @param user
     * @return
     */
    @PreAuth("admin")
    @PostMapping("")
    public Result addUser(@RequestBody UserVO user) {
        Validator.isNotNull(user);
        if (StringUtils.isBlank(user.getRole())) {
            user.setRole("vip");
        }
        //   user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        userService.adminReg(user.toModel(User.class));
        return Result.doSuccess();
    }

    /**
     * admin -????????????
     *
     * @param user
     * @return
     */
    @PreAuth("admin")
    @PutMapping("/status")
    public Result changeUserStatus(@CookieValue(COOKIE_NAME) String auth, @RequestBody UserVO user) {
        Validator.isNotNull(auth);
        Validator.isNotNull(user);
        Validator.isNotNull(user.getId());
        UserVO cacheUser = userCache.getCache(auth);
        if (cacheUser.getId().equals(user.getId())) throw new RuntimeException("????????????????????????");
        User user1 = User.builder().status(user.getStatus()).build();
        user1.setId(user.getId());
        userRepository.save(user1);
        return Result.doSuccess();
    }


}
