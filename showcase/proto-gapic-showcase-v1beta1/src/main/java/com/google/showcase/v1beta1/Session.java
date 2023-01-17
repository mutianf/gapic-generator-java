// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

package com.google.showcase.v1beta1;

/**
 * <pre>
 * A session is a suite of tests, generally being made in the context
 * of testing code generation.
 * A session defines tests it may expect, based on which version of the
 * code generation spec is in use.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.Session}
 */
public final class Session extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.Session)
    SessionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Session.newBuilder() to construct.
  private Session(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Session() {
    name_ = "";
    version_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Session();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Session(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            version_ = rawValue;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_Session_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_Session_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.Session.class, com.google.showcase.v1beta1.Session.Builder.class);
  }

  /**
   * <pre>
   * The specification versions understood by Showcase.
   * </pre>
   *
   * Protobuf enum {@code google.showcase.v1beta1.Session.Version}
   */
  public enum Version
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified version. If passed on creation, the session will default
     * to using the latest stable release.
     * </pre>
     *
     * <code>VERSION_UNSPECIFIED = 0;</code>
     */
    VERSION_UNSPECIFIED(0),
    /**
     * <pre>
     * The latest v1. Currently, this is v1.0.
     * </pre>
     *
     * <code>V1_LATEST = 1;</code>
     */
    V1_LATEST(1),
    /**
     * <pre>
     * v1.0. (Until the spec is "GA", this will be a moving target.)
     * </pre>
     *
     * <code>V1_0 = 2;</code>
     */
    V1_0(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified version. If passed on creation, the session will default
     * to using the latest stable release.
     * </pre>
     *
     * <code>VERSION_UNSPECIFIED = 0;</code>
     */
    public static final int VERSION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The latest v1. Currently, this is v1.0.
     * </pre>
     *
     * <code>V1_LATEST = 1;</code>
     */
    public static final int V1_LATEST_VALUE = 1;
    /**
     * <pre>
     * v1.0. (Until the spec is "GA", this will be a moving target.)
     * </pre>
     *
     * <code>V1_0 = 2;</code>
     */
    public static final int V1_0_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Version valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Version forNumber(int value) {
      switch (value) {
        case 0: return VERSION_UNSPECIFIED;
        case 1: return V1_LATEST;
        case 2: return V1_0;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Version>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Version> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Version>() {
            public Version findValueByNumber(int number) {
              return Version.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.Session.getDescriptor().getEnumTypes().get(0);
    }

    private static final Version[] VALUES = values();

    public static Version valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Version(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.showcase.v1beta1.Session.Version)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the session. The ID must conform to ^[a-z]+$
   * If this is not provided, Showcase chooses one at random.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the session. The ID must conform to ^[a-z]+$
   * If this is not provided, Showcase chooses one at random.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <pre>
   * Required. The version this session is using.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Session.Version version = 2;</code>
   * @return The enum numeric value on the wire for version.
   */
  @java.lang.Override public int getVersionValue() {
    return version_;
  }
  /**
   * <pre>
   * Required. The version this session is using.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Session.Version version = 2;</code>
   * @return The version.
   */
  @java.lang.Override public com.google.showcase.v1beta1.Session.Version getVersion() {
    @SuppressWarnings("deprecation")
    com.google.showcase.v1beta1.Session.Version result = com.google.showcase.v1beta1.Session.Version.valueOf(version_);
    return result == null ? com.google.showcase.v1beta1.Session.Version.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (version_ != com.google.showcase.v1beta1.Session.Version.VERSION_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, version_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (version_ != com.google.showcase.v1beta1.Session.Version.VERSION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, version_);
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
    if (!(obj instanceof com.google.showcase.v1beta1.Session)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.Session other = (com.google.showcase.v1beta1.Session) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (version_ != other.version_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + version_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.Session parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.Session parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.Session parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.Session parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.Session prototype) {
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
   * A session is a suite of tests, generally being made in the context
   * of testing code generation.
   * A session defines tests it may expect, based on which version of the
   * code generation spec is in use.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.Session}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.Session)
      com.google.showcase.v1beta1.SessionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_Session_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_Session_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.Session.class, com.google.showcase.v1beta1.Session.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.Session.newBuilder()
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
      name_ = "";

      version_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_Session_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.Session getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.Session.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.Session build() {
      com.google.showcase.v1beta1.Session result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.Session buildPartial() {
      com.google.showcase.v1beta1.Session result = new com.google.showcase.v1beta1.Session(this);
      result.name_ = name_;
      result.version_ = version_;
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
      if (other instanceof com.google.showcase.v1beta1.Session) {
        return mergeFrom((com.google.showcase.v1beta1.Session)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.Session other) {
      if (other == com.google.showcase.v1beta1.Session.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.version_ != 0) {
        setVersionValue(other.getVersionValue());
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
      com.google.showcase.v1beta1.Session parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.showcase.v1beta1.Session) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the session. The ID must conform to ^[a-z]+$
     * If this is not provided, Showcase chooses one at random.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the session. The ID must conform to ^[a-z]+$
     * If this is not provided, Showcase chooses one at random.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the session. The ID must conform to ^[a-z]+$
     * If this is not provided, Showcase chooses one at random.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the session. The ID must conform to ^[a-z]+$
     * If this is not provided, Showcase chooses one at random.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the session. The ID must conform to ^[a-z]+$
     * If this is not provided, Showcase chooses one at random.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int version_ = 0;
    /**
     * <pre>
     * Required. The version this session is using.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session.Version version = 2;</code>
     * @return The enum numeric value on the wire for version.
     */
    @java.lang.Override public int getVersionValue() {
      return version_;
    }
    /**
     * <pre>
     * Required. The version this session is using.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session.Version version = 2;</code>
     * @param value The enum numeric value on the wire for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionValue(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The version this session is using.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session.Version version = 2;</code>
     * @return The version.
     */
    @java.lang.Override
    public com.google.showcase.v1beta1.Session.Version getVersion() {
      @SuppressWarnings("deprecation")
      com.google.showcase.v1beta1.Session.Version result = com.google.showcase.v1beta1.Session.Version.valueOf(version_);
      return result == null ? com.google.showcase.v1beta1.Session.Version.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The version this session is using.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session.Version version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(com.google.showcase.v1beta1.Session.Version value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      version_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The version this session is using.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session.Version version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.Session)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.Session)
  private static final com.google.showcase.v1beta1.Session DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.Session();
  }

  public static com.google.showcase.v1beta1.Session getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Session>
      PARSER = new com.google.protobuf.AbstractParser<Session>() {
    @java.lang.Override
    public Session parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Session(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Session> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Session> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.Session getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
