// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/command/command.proto

package com.v2ray.core.app.proxyman.command;

public final class Command {
    private Command() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AddUserOperation_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AddUserOperation_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_RemoveUserOperation_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_RemoveUserOperation_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AddInboundRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AddInboundRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AddInboundResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AddInboundResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_RemoveInboundRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_RemoveInboundRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_RemoveInboundResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_RemoveInboundResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AlterInboundRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AlterInboundRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AlterInboundResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AlterInboundResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AddOutboundRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AddOutboundRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AddOutboundResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AddOutboundResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_RemoveOutboundRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_RemoveOutboundRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_RemoveOutboundResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_RemoveOutboundResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AlterOutboundRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AlterOutboundRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_AlterOutboundResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_AlterOutboundResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_app_proxyman_command_Config_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_app_proxyman_command_Config_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n1v2ray.com/core/app/proxyman/command/co" +
                        "mmand.proto\022\037v2ray.core.app.proxyman.com" +
                        "mand\032)v2ray.com/core/common/protocol/use" +
                        "r.proto\0320v2ray.com/core/common/serial/ty" +
                        "ped_message.proto\032\033v2ray.com/core/config" +
                        ".proto\"B\n\020AddUserOperation\022.\n\004user\030\001 \001(\013" +
                        "2 .v2ray.core.common.protocol.User\"$\n\023Re" +
                        "moveUserOperation\022\r\n\005email\030\001 \001(\t\"F\n\021AddI" +
                        "nboundRequest\0221\n\007inbound\030\001 \001(\0132 .v2ray.c" +
                        "ore.InboundHandlerConfig\"\024\n\022AddInboundRe" +
                        "sponse\"#\n\024RemoveInboundRequest\022\013\n\003tag\030\001 " +
                        "\001(\t\"\027\n\025RemoveInboundResponse\"]\n\023AlterInb" +
                        "oundRequest\022\013\n\003tag\030\001 \001(\t\0229\n\toperation\030\002 " +
                        "\001(\0132&.v2ray.core.common.serial.TypedMess" +
                        "age\"\026\n\024AlterInboundResponse\"I\n\022AddOutbou" +
                        "ndRequest\0223\n\010outbound\030\001 \001(\0132!.v2ray.core" +
                        ".OutboundHandlerConfig\"\025\n\023AddOutboundRes" +
                        "ponse\"$\n\025RemoveOutboundRequest\022\013\n\003tag\030\001 " +
                        "\001(\t\"\030\n\026RemoveOutboundResponse\"^\n\024AlterOu" +
                        "tboundRequest\022\013\n\003tag\030\001 \001(\t\0229\n\toperation\030" +
                        "\002 \001(\0132&.v2ray.core.common.serial.TypedMe" +
                        "ssage\"\027\n\025AlterOutboundResponse\"\010\n\006Config" +
                        "2\220\006\n\016HandlerService\022w\n\nAddInbound\0222.v2ra" +
                        "y.core.app.proxyman.command.AddInboundRe" +
                        "quest\0323.v2ray.core.app.proxyman.command." +
                        "AddInboundResponse\"\000\022\200\001\n\rRemoveInbound\0225" +
                        ".v2ray.core.app.proxyman.command.RemoveI" +
                        "nboundRequest\0326.v2ray.core.app.proxyman." +
                        "command.RemoveInboundResponse\"\000\022}\n\014Alter" +
                        "Inbound\0224.v2ray.core.app.proxyman.comman" +
                        "d.AlterInboundRequest\0325.v2ray.core.app.p" +
                        "roxyman.command.AlterInboundResponse\"\000\022z" +
                        "\n\013AddOutbound\0223.v2ray.core.app.proxyman." +
                        "command.AddOutboundRequest\0324.v2ray.core." +
                        "app.proxyman.command.AddOutboundResponse" +
                        "\"\000\022\203\001\n\016RemoveOutbound\0226.v2ray.core.app.p" +
                        "roxyman.command.RemoveOutboundRequest\0327." +
                        "v2ray.core.app.proxyman.command.RemoveOu" +
                        "tboundResponse\"\000\022\200\001\n\rAlterOutbound\0225.v2r" +
                        "ay.core.app.proxyman.command.AlterOutbou" +
                        "ndRequest\0326.v2ray.core.app.proxyman.comm" +
                        "and.AlterOutboundResponse\"\000BR\n#com.v2ray" +
                        ".core.app.proxyman.commandP\001Z\007command\252\002\037" +
                        "V2Ray.Core.App.Proxyman.Commandb\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.v2ray.core.common.protocol.UserOuterClass.getDescriptor(),
                                com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor(),
                                com.v2ray.core.ConfigOuterClass.getDescriptor(),
                        }, assigner);
        internal_static_v2ray_core_app_proxyman_command_AddUserOperation_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_v2ray_core_app_proxyman_command_AddUserOperation_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AddUserOperation_descriptor,
                new String[]{"User",});
        internal_static_v2ray_core_app_proxyman_command_RemoveUserOperation_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_v2ray_core_app_proxyman_command_RemoveUserOperation_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_RemoveUserOperation_descriptor,
                new String[]{"Email",});
        internal_static_v2ray_core_app_proxyman_command_AddInboundRequest_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_v2ray_core_app_proxyman_command_AddInboundRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AddInboundRequest_descriptor,
                new String[]{"Inbound",});
        internal_static_v2ray_core_app_proxyman_command_AddInboundResponse_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_v2ray_core_app_proxyman_command_AddInboundResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AddInboundResponse_descriptor,
                new String[]{});
        internal_static_v2ray_core_app_proxyman_command_RemoveInboundRequest_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_v2ray_core_app_proxyman_command_RemoveInboundRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_RemoveInboundRequest_descriptor,
                new String[]{"Tag",});
        internal_static_v2ray_core_app_proxyman_command_RemoveInboundResponse_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_v2ray_core_app_proxyman_command_RemoveInboundResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_RemoveInboundResponse_descriptor,
                new String[]{});
        internal_static_v2ray_core_app_proxyman_command_AlterInboundRequest_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_v2ray_core_app_proxyman_command_AlterInboundRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AlterInboundRequest_descriptor,
                new String[]{"Tag", "Operation",});
        internal_static_v2ray_core_app_proxyman_command_AlterInboundResponse_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_v2ray_core_app_proxyman_command_AlterInboundResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AlterInboundResponse_descriptor,
                new String[]{});
        internal_static_v2ray_core_app_proxyman_command_AddOutboundRequest_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_v2ray_core_app_proxyman_command_AddOutboundRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AddOutboundRequest_descriptor,
                new String[]{"Outbound",});
        internal_static_v2ray_core_app_proxyman_command_AddOutboundResponse_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_v2ray_core_app_proxyman_command_AddOutboundResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AddOutboundResponse_descriptor,
                new String[]{});
        internal_static_v2ray_core_app_proxyman_command_RemoveOutboundRequest_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_v2ray_core_app_proxyman_command_RemoveOutboundRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_RemoveOutboundRequest_descriptor,
                new String[]{"Tag",});
        internal_static_v2ray_core_app_proxyman_command_RemoveOutboundResponse_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_v2ray_core_app_proxyman_command_RemoveOutboundResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_RemoveOutboundResponse_descriptor,
                new String[]{});
        internal_static_v2ray_core_app_proxyman_command_AlterOutboundRequest_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_v2ray_core_app_proxyman_command_AlterOutboundRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AlterOutboundRequest_descriptor,
                new String[]{"Tag", "Operation",});
        internal_static_v2ray_core_app_proxyman_command_AlterOutboundResponse_descriptor =
                getDescriptor().getMessageTypes().get(13);
        internal_static_v2ray_core_app_proxyman_command_AlterOutboundResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_AlterOutboundResponse_descriptor,
                new String[]{});
        internal_static_v2ray_core_app_proxyman_command_Config_descriptor =
                getDescriptor().getMessageTypes().get(14);
        internal_static_v2ray_core_app_proxyman_command_Config_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_app_proxyman_command_Config_descriptor,
                new String[]{});
        com.v2ray.core.common.protocol.UserOuterClass.getDescriptor();
        com.v2ray.core.common.serial.TypedMessageOuterClass.getDescriptor();
        com.v2ray.core.ConfigOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}