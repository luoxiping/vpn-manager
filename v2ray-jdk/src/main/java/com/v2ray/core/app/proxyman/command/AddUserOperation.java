// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/command/command.proto

package com.v2ray.core.app.proxyman.command;

/**
 * Protobuf type {@code v2ray.core.app.proxyman.command.AddUserOperation}
 */
public final class AddUserOperation extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:v2ray.core.app.proxyman.command.AddUserOperation)
        AddUserOperationOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use AddUserOperation.newBuilder() to construct.
    private AddUserOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private AddUserOperation() {
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private AddUserOperation(
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
                    case 10: {
                        com.v2ray.core.common.protocol.User.Builder subBuilder = null;
                        if (user_ != null) {
                            subBuilder = user_.toBuilder();
                        }
                        user_ = input.readMessage(com.v2ray.core.common.protocol.User.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(user_);
                            user_ = subBuilder.buildPartial();
                        }

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
        return Command.internal_static_v2ray_core_app_proxyman_command_AddUserOperation_descriptor;
    }

    @Override
    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Command.internal_static_v2ray_core_app_proxyman_command_AddUserOperation_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        AddUserOperation.class, Builder.class);
    }

    public static final int USER_FIELD_NUMBER = 1;
    private com.v2ray.core.common.protocol.User user_;

    /**
     * <code>.v2ray.core.common.protocol.User user = 1;</code>
     */
    public boolean hasUser() {
        return user_ != null;
    }

    /**
     * <code>.v2ray.core.common.protocol.User user = 1;</code>
     */
    public com.v2ray.core.common.protocol.User getUser() {
        return user_ == null ? com.v2ray.core.common.protocol.User.getDefaultInstance() : user_;
    }

    /**
     * <code>.v2ray.core.common.protocol.User user = 1;</code>
     */
    public com.v2ray.core.common.protocol.UserOrBuilder getUserOrBuilder() {
        return getUser();
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
        if (user_ != null) {
            output.writeMessage(1, getUser());
        }
        unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (user_ != null) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, getUser());
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
        if (!(obj instanceof AddUserOperation)) {
            return super.equals(obj);
        }
        AddUserOperation other = (AddUserOperation) obj;

        if (hasUser() != other.hasUser()) return false;
        if (hasUser()) {
            if (!getUser()
                    .equals(other.getUser())) return false;
        }
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
        if (hasUser()) {
            hash = (37 * hash) + USER_FIELD_NUMBER;
            hash = (53 * hash) + getUser().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static AddUserOperation parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static AddUserOperation parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static AddUserOperation parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static AddUserOperation parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static AddUserOperation parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static AddUserOperation parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static AddUserOperation parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static AddUserOperation parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static AddUserOperation parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static AddUserOperation parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static AddUserOperation parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static AddUserOperation parseFrom(
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

    public static Builder newBuilder(AddUserOperation prototype) {
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
     * Protobuf type {@code v2ray.core.app.proxyman.command.AddUserOperation}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:v2ray.core.app.proxyman.command.AddUserOperation)
            com.v2ray.core.app.proxyman.command.AddUserOperationOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Command.internal_static_v2ray_core_app_proxyman_command_AddUserOperation_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Command.internal_static_v2ray_core_app_proxyman_command_AddUserOperation_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            AddUserOperation.class, Builder.class);
        }

        // Construct using com.v2ray.core.app.proxyman.command.AddUserOperation.newBuilder()
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
            if (userBuilder_ == null) {
                user_ = null;
            } else {
                user_ = null;
                userBuilder_ = null;
            }
            return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Command.internal_static_v2ray_core_app_proxyman_command_AddUserOperation_descriptor;
        }

        @Override
        public AddUserOperation getDefaultInstanceForType() {
            return AddUserOperation.getDefaultInstance();
        }

        @Override
        public AddUserOperation build() {
            AddUserOperation result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @Override
        public AddUserOperation buildPartial() {
            AddUserOperation result = new AddUserOperation(this);
            if (userBuilder_ == null) {
                result.user_ = user_;
            } else {
                result.user_ = userBuilder_.build();
            }
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
            if (other instanceof AddUserOperation) {
                return mergeFrom((AddUserOperation) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(AddUserOperation other) {
            if (other == AddUserOperation.getDefaultInstance()) return this;
            if (other.hasUser()) {
                mergeUser(other.getUser());
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
            AddUserOperation parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (AddUserOperation) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private com.v2ray.core.common.protocol.User user_;
        private com.google.protobuf.SingleFieldBuilderV3<
                com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder> userBuilder_;

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public boolean hasUser() {
            return userBuilder_ != null || user_ != null;
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public com.v2ray.core.common.protocol.User getUser() {
            if (userBuilder_ == null) {
                return user_ == null ? com.v2ray.core.common.protocol.User.getDefaultInstance() : user_;
            } else {
                return userBuilder_.getMessage();
            }
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public Builder setUser(com.v2ray.core.common.protocol.User value) {
            if (userBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                user_ = value;
                onChanged();
            } else {
                userBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public Builder setUser(
                com.v2ray.core.common.protocol.User.Builder builderForValue) {
            if (userBuilder_ == null) {
                user_ = builderForValue.build();
                onChanged();
            } else {
                userBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public Builder mergeUser(com.v2ray.core.common.protocol.User value) {
            if (userBuilder_ == null) {
                if (user_ != null) {
                    user_ =
                            com.v2ray.core.common.protocol.User.newBuilder(user_).mergeFrom(value).buildPartial();
                } else {
                    user_ = value;
                }
                onChanged();
            } else {
                userBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public Builder clearUser() {
            if (userBuilder_ == null) {
                user_ = null;
                onChanged();
            } else {
                user_ = null;
                userBuilder_ = null;
            }

            return this;
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public com.v2ray.core.common.protocol.User.Builder getUserBuilder() {

            onChanged();
            return getUserFieldBuilder().getBuilder();
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        public com.v2ray.core.common.protocol.UserOrBuilder getUserOrBuilder() {
            if (userBuilder_ != null) {
                return userBuilder_.getMessageOrBuilder();
            } else {
                return user_ == null ?
                        com.v2ray.core.common.protocol.User.getDefaultInstance() : user_;
            }
        }

        /**
         * <code>.v2ray.core.common.protocol.User user = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder>
        getUserFieldBuilder() {
            if (userBuilder_ == null) {
                userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder>(
                        getUser(),
                        getParentForChildren(),
                        isClean());
                user_ = null;
            }
            return userBuilder_;
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


        // @@protoc_insertion_point(builder_scope:v2ray.core.app.proxyman.command.AddUserOperation)
    }

    // @@protoc_insertion_point(class_scope:v2ray.core.app.proxyman.command.AddUserOperation)
    private static final AddUserOperation DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new AddUserOperation();
    }

    public static AddUserOperation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddUserOperation>
            PARSER = new com.google.protobuf.AbstractParser<AddUserOperation>() {
        @Override
        public AddUserOperation parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new AddUserOperation(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<AddUserOperation> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AddUserOperation> getParserForType() {
        return PARSER;
    }

    @Override
    public AddUserOperation getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

