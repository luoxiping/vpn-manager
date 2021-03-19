// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/router/config.proto

package com.v2ray.core.app.router;

/**
 * <pre>
 * Domain for routing decision.
 * </pre>
 * <p>
 * Protobuf type {@code v2ray.core.app.router.Domain}
 */
public final class Domain extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:v2ray.core.app.router.Domain)
        DomainOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use Domain.newBuilder() to construct.
    private Domain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Domain() {
        type_ = 0;
        value_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private Domain(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 8: {
                        int rawValue = input.readEnum();

                        type_ = rawValue;
                        break;
                    }
                    case 18: {
                        String s = input.readStringRequireUtf8();

                        value_ = s;
                        break;
                    }
                    default: {
                        if (!parseUnknownField(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_Domain_descriptor;
    }

    @Override
    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_Domain_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Domain.class, Builder.class);
    }

    /**
     * <pre>
     * Type of domain value.
     * </pre>
     * <p>
     * Protobuf enum {@code v2ray.core.app.router.Domain.Type}
     */
    public enum Type
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * The value is used as is.
         * </pre>
         *
         * <code>Plain = 0;</code>
         */
        Plain(0),
        /**
         * <pre>
         * The value is used as a regular expression.
         * </pre>
         *
         * <code>Regex = 1;</code>
         */
        Regex(1),
        /**
         * <pre>
         * The value is a domain.
         * </pre>
         *
         * <code>Domain = 2;</code>
         */
        Domain(2),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * The value is used as is.
         * </pre>
         *
         * <code>Plain = 0;</code>
         */
        public static final int Plain_VALUE = 0;
        /**
         * <pre>
         * The value is used as a regular expression.
         * </pre>
         *
         * <code>Regex = 1;</code>
         */
        public static final int Regex_VALUE = 1;
        /**
         * <pre>
         * The value is a domain.
         * </pre>
         *
         * <code>Domain = 2;</code>
         */
        public static final int Domain_VALUE = 2;


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
        public static Type valueOf(int value) {
            return forNumber(value);
        }

        public static Type forNumber(int value) {
            switch (value) {
                case 0:
                    return Plain;
                case 1:
                    return Regex;
                case 2:
                    return Domain;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                Type> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                    public Type findValueByNumber(int number) {
                        return Type.forNumber(number);
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
            return com.v2ray.core.app.router.Domain.getDescriptor().getEnumTypes().get(0);
        }

        private static final Type[] VALUES = values();

        public static Type valueOf(
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

        private Type(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:v2ray.core.app.router.Domain.Type)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    /**
     * <pre>
     * Domain matching type.
     * </pre>
     *
     * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
     */
    public int getTypeValue() {
        return type_;
    }

    /**
     * <pre>
     * Domain matching type.
     * </pre>
     *
     * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
     */
    public Type getType() {
        @SuppressWarnings("deprecation")
        Type result = Type.valueOf(type_);
        return result == null ? Type.UNRECOGNIZED : result;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private volatile Object value_;

    /**
     * <pre>
     * Domain value.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public String getValue() {
        Object ref = value_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            value_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * Domain value.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public com.google.protobuf.ByteString
    getValueBytes() {
        Object ref = value_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            value_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (type_ != Type.Plain.getNumber()) {
            output.writeEnum(1, type_);
        }
        if (!getValueBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
        }
        unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (type_ != Type.Plain.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(1, type_);
        }
        if (!getValueBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Domain)) {
            return super.equals(obj);
        }
        Domain other = (Domain) obj;

        if (type_ != other.type_) return false;
        if (!getValue()
                .equals(other.getValue())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static Domain parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Domain parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Domain parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Domain parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Domain parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Domain parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Domain parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Domain parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Domain parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static Domain parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Domain parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Domain parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Domain prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
            BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * <pre>
     * Domain for routing decision.
     * </pre>
     * <p>
     * Protobuf type {@code v2ray.core.app.router.Domain}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:v2ray.core.app.router.Domain)
            com.v2ray.core.app.router.DomainOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_Domain_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_Domain_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Domain.class, Builder.class);
        }

        // Construct using com.v2ray.core.app.router.Domain.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        @Override
        public Builder clear() {
            super.clear();
            type_ = 0;

            value_ = "";

            return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_Domain_descriptor;
        }

        @Override
        public Domain getDefaultInstanceForType() {
            return Domain.getDefaultInstance();
        }

        @Override
        public Domain build() {
            Domain result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @Override
        public Domain buildPartial() {
            Domain result = new Domain(this);
            result.type_ = type_;
            result.value_ = value_;
            onBuilt();
            return result;
        }

        @Override
        public Builder clone() {
            return super.clone();
        }

        @Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.setField(field, value);
        }

        @Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.addRepeatedField(field, value);
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Domain) {
                return mergeFrom((Domain) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Domain other) {
            if (other == Domain.getDefaultInstance()) return this;
            if (other.type_ != 0) {
                setTypeValue(other.getTypeValue());
            }
            if (!other.getValue().isEmpty()) {
                value_ = other.value_;
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @Override
        public final boolean isInitialized() {
            return true;
        }

        @Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Domain parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Domain) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int type_ = 0;

        /**
         * <pre>
         * Domain matching type.
         * </pre>
         *
         * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
         */
        public int getTypeValue() {
            return type_;
        }

        /**
         * <pre>
         * Domain matching type.
         * </pre>
         *
         * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
         */
        public Builder setTypeValue(int value) {
            type_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Domain matching type.
         * </pre>
         *
         * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
         */
        public Type getType() {
            @SuppressWarnings("deprecation")
            Type result = Type.valueOf(type_);
            return result == null ? Type.UNRECOGNIZED : result;
        }

        /**
         * <pre>
         * Domain matching type.
         * </pre>
         *
         * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
         */
        public Builder setType(Type value) {
            if (value == null) {
                throw new NullPointerException();
            }

            type_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Domain matching type.
         * </pre>
         *
         * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
         */
        public Builder clearType() {

            type_ = 0;
            onChanged();
            return this;
        }

        private Object value_ = "";

        /**
         * <pre>
         * Domain value.
         * </pre>
         *
         * <code>string value = 2;</code>
         */
        public String getValue() {
            Object ref = value_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                value_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <pre>
         * Domain value.
         * </pre>
         *
         * <code>string value = 2;</code>
         */
        public com.google.protobuf.ByteString
        getValueBytes() {
            Object ref = value_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                value_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * Domain value.
         * </pre>
         *
         * <code>string value = 2;</code>
         */
        public Builder setValue(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            value_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Domain value.
         * </pre>
         *
         * <code>string value = 2;</code>
         */
        public Builder clearValue() {

            value_ = getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Domain value.
         * </pre>
         *
         * <code>string value = 2;</code>
         */
        public Builder setValueBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            value_ = value;
            onChanged();
            return this;
        }

        @Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:v2ray.core.app.router.Domain)
    }

    // @@protoc_insertion_point(class_scope:v2ray.core.app.router.Domain)
    private static final Domain DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new Domain();
    }

    public static Domain getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Domain>
            PARSER = new com.google.protobuf.AbstractParser<Domain>() {
        @Override
        public Domain parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Domain(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Domain> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Domain> getParserForType() {
        return PARSER;
    }

    @Override
    public Domain getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
