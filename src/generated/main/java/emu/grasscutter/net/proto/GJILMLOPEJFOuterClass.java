// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GJILMLOPEJF.proto

package emu.grasscutter.net.proto;

public final class GJILMLOPEJFOuterClass {
  private GJILMLOPEJFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GJILMLOPEJFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GJILMLOPEJF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
     * @return Whether the eLIOJBDGIMJ field is set.
     */
    boolean hasELIOJBDGIMJ();
    /**
     * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
     * @return The eLIOJBDGIMJ.
     */
    emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN getELIOJBDGIMJ();
    /**
     * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
     */
    emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBNOrBuilder getELIOJBDGIMJOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 26477
   * </pre>
   *
   * Protobuf type {@code GJILMLOPEJF}
   */
  public static final class GJILMLOPEJF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GJILMLOPEJF)
      GJILMLOPEJFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GJILMLOPEJF.newBuilder() to construct.
    private GJILMLOPEJF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GJILMLOPEJF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GJILMLOPEJF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GJILMLOPEJF(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 26: {
              emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder subBuilder = null;
              if (eLIOJBDGIMJ_ != null) {
                subBuilder = eLIOJBDGIMJ_.toBuilder();
              }
              eLIOJBDGIMJ_ = input.readMessage(emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(eLIOJBDGIMJ_);
                eLIOJBDGIMJ_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.internal_static_GJILMLOPEJF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.internal_static_GJILMLOPEJF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF.class, emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF.Builder.class);
    }

    public static final int ELIOJBDGIMJ_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN eLIOJBDGIMJ_;
    /**
     * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
     * @return Whether the eLIOJBDGIMJ field is set.
     */
    @java.lang.Override
    public boolean hasELIOJBDGIMJ() {
      return eLIOJBDGIMJ_ != null;
    }
    /**
     * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
     * @return The eLIOJBDGIMJ.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN getELIOJBDGIMJ() {
      return eLIOJBDGIMJ_ == null ? emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.getDefaultInstance() : eLIOJBDGIMJ_;
    }
    /**
     * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBNOrBuilder getELIOJBDGIMJOrBuilder() {
      return getELIOJBDGIMJ();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (eLIOJBDGIMJ_ != null) {
        output.writeMessage(3, getELIOJBDGIMJ());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eLIOJBDGIMJ_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getELIOJBDGIMJ());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF other = (emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF) obj;

      if (hasELIOJBDGIMJ() != other.hasELIOJBDGIMJ()) return false;
      if (hasELIOJBDGIMJ()) {
        if (!getELIOJBDGIMJ()
            .equals(other.getELIOJBDGIMJ())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasELIOJBDGIMJ()) {
        hash = (37 * hash) + ELIOJBDGIMJ_FIELD_NUMBER;
        hash = (53 * hash) + getELIOJBDGIMJ().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 26477
     * </pre>
     *
     * Protobuf type {@code GJILMLOPEJF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GJILMLOPEJF)
        emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.internal_static_GJILMLOPEJF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.internal_static_GJILMLOPEJF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF.class, emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (eLIOJBDGIMJBuilder_ == null) {
          eLIOJBDGIMJ_ = null;
        } else {
          eLIOJBDGIMJ_ = null;
          eLIOJBDGIMJBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.internal_static_GJILMLOPEJF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF build() {
        emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF buildPartial() {
        emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF result = new emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF(this);
        if (eLIOJBDGIMJBuilder_ == null) {
          result.eLIOJBDGIMJ_ = eLIOJBDGIMJ_;
        } else {
          result.eLIOJBDGIMJ_ = eLIOJBDGIMJBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF) {
          return mergeFrom((emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF other) {
        if (other == emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF.getDefaultInstance()) return this;
        if (other.hasELIOJBDGIMJ()) {
          mergeELIOJBDGIMJ(other.getELIOJBDGIMJ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN eLIOJBDGIMJ_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBNOrBuilder> eLIOJBDGIMJBuilder_;
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       * @return Whether the eLIOJBDGIMJ field is set.
       */
      public boolean hasELIOJBDGIMJ() {
        return eLIOJBDGIMJBuilder_ != null || eLIOJBDGIMJ_ != null;
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       * @return The eLIOJBDGIMJ.
       */
      public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN getELIOJBDGIMJ() {
        if (eLIOJBDGIMJBuilder_ == null) {
          return eLIOJBDGIMJ_ == null ? emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.getDefaultInstance() : eLIOJBDGIMJ_;
        } else {
          return eLIOJBDGIMJBuilder_.getMessage();
        }
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       */
      public Builder setELIOJBDGIMJ(emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN value) {
        if (eLIOJBDGIMJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          eLIOJBDGIMJ_ = value;
          onChanged();
        } else {
          eLIOJBDGIMJBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       */
      public Builder setELIOJBDGIMJ(
          emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder builderForValue) {
        if (eLIOJBDGIMJBuilder_ == null) {
          eLIOJBDGIMJ_ = builderForValue.build();
          onChanged();
        } else {
          eLIOJBDGIMJBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       */
      public Builder mergeELIOJBDGIMJ(emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN value) {
        if (eLIOJBDGIMJBuilder_ == null) {
          if (eLIOJBDGIMJ_ != null) {
            eLIOJBDGIMJ_ =
              emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.newBuilder(eLIOJBDGIMJ_).mergeFrom(value).buildPartial();
          } else {
            eLIOJBDGIMJ_ = value;
          }
          onChanged();
        } else {
          eLIOJBDGIMJBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       */
      public Builder clearELIOJBDGIMJ() {
        if (eLIOJBDGIMJBuilder_ == null) {
          eLIOJBDGIMJ_ = null;
          onChanged();
        } else {
          eLIOJBDGIMJ_ = null;
          eLIOJBDGIMJBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       */
      public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder getELIOJBDGIMJBuilder() {
        
        onChanged();
        return getELIOJBDGIMJFieldBuilder().getBuilder();
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       */
      public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBNOrBuilder getELIOJBDGIMJOrBuilder() {
        if (eLIOJBDGIMJBuilder_ != null) {
          return eLIOJBDGIMJBuilder_.getMessageOrBuilder();
        } else {
          return eLIOJBDGIMJ_ == null ?
              emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.getDefaultInstance() : eLIOJBDGIMJ_;
        }
      }
      /**
       * <code>.LANPHFCMEBN ELIOJBDGIMJ = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBNOrBuilder> 
          getELIOJBDGIMJFieldBuilder() {
        if (eLIOJBDGIMJBuilder_ == null) {
          eLIOJBDGIMJBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBNOrBuilder>(
                  getELIOJBDGIMJ(),
                  getParentForChildren(),
                  isClean());
          eLIOJBDGIMJ_ = null;
        }
        return eLIOJBDGIMJBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GJILMLOPEJF)
    }

    // @@protoc_insertion_point(class_scope:GJILMLOPEJF)
    private static final emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF();
    }

    public static emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GJILMLOPEJF>
        PARSER = new com.google.protobuf.AbstractParser<GJILMLOPEJF>() {
      @java.lang.Override
      public GJILMLOPEJF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GJILMLOPEJF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GJILMLOPEJF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GJILMLOPEJF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GJILMLOPEJFOuterClass.GJILMLOPEJF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GJILMLOPEJF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GJILMLOPEJF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GJILMLOPEJF.proto\032\021LANPHFCMEBN.proto\"0" +
      "\n\013GJILMLOPEJF\022!\n\013ELIOJBDGIMJ\030\003 \001(\0132\014.LAN" +
      "PHFCMEBNB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.getDescriptor(),
        });
    internal_static_GJILMLOPEJF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GJILMLOPEJF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GJILMLOPEJF_descriptor,
        new java.lang.String[] { "ELIOJBDGIMJ", });
    emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}