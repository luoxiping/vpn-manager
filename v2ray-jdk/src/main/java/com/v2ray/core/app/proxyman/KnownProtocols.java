// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

/**
 * Protobuf enum {@code v2ray.core.app.proxyman.KnownProtocols}
 */
public enum KnownProtocols
        implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HTTP = 0;</code>
     */
    HTTP(0),
    /**
     * <code>TLS = 1;</code>
     */
    TLS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HTTP = 0;</code>
     */
    public static final int HTTP_VALUE = 0;
    /**
     * <code>TLS = 1;</code>
     */
    public static final int TLS_VALUE = 1;


    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException(
                    "Can't get the number of an unknown enum value.");
        }
        return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static KnownProtocols valueOf(int value) {
        return forNumber(value);
    }

    public static KnownProtocols forNumber(int value) {
        switch (value) {
            case 0:
                return HTTP;
            case 1:
                return TLS;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KnownProtocols>
    internalGetValueMap() {
        return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<
            KnownProtocols> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<KnownProtocols>() {
                public KnownProtocols findValueByNumber(int number) {
                    return KnownProtocols.forNumber(number);
                }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
    getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptorForType() {
        return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptor() {
        return Config.getDescriptor().getEnumTypes().get(0);
    }

    private static final KnownProtocols[] VALUES = values();

    public static KnownProtocols valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException(
                    "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
    }

    private final int value;

    private KnownProtocols(int value) {
        this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:v2ray.core.app.proxyman.KnownProtocols)
}

