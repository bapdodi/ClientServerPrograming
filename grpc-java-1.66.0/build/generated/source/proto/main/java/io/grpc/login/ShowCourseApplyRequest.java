// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login.proto

// Protobuf Java Version: 3.25.3
package io.grpc.login;

/**
 * Protobuf type {@code login.ShowCourseApplyRequest}
 */
public final class ShowCourseApplyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:login.ShowCourseApplyRequest)
    ShowCourseApplyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShowCourseApplyRequest.newBuilder() to construct.
  private ShowCourseApplyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShowCourseApplyRequest() {
    courseId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShowCourseApplyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.login.LoginProto.internal_static_login_ShowCourseApplyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.login.LoginProto.internal_static_login_ShowCourseApplyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.login.ShowCourseApplyRequest.class, io.grpc.login.ShowCourseApplyRequest.Builder.class);
  }

  public static final int STUDENTID_FIELD_NUMBER = 1;
  private int studentId_ = 0;
  /**
   * <code>int32 studentId = 1;</code>
   * @return The studentId.
   */
  @java.lang.Override
  public int getStudentId() {
    return studentId_;
  }

  public static final int COURSEID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object courseId_ = "";
  /**
   * <code>string courseId = 2;</code>
   * @return The courseId.
   */
  @java.lang.Override
  public java.lang.String getCourseId() {
    java.lang.Object ref = courseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      courseId_ = s;
      return s;
    }
  }
  /**
   * <code>string courseId = 2;</code>
   * @return The bytes for courseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCourseIdBytes() {
    java.lang.Object ref = courseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      courseId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (studentId_ != 0) {
      output.writeInt32(1, studentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, courseId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (studentId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, studentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, courseId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.login.ShowCourseApplyRequest)) {
      return super.equals(obj);
    }
    io.grpc.login.ShowCourseApplyRequest other = (io.grpc.login.ShowCourseApplyRequest) obj;

    if (getStudentId()
        != other.getStudentId()) return false;
    if (!getCourseId()
        .equals(other.getCourseId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STUDENTID_FIELD_NUMBER;
    hash = (53 * hash) + getStudentId();
    hash = (37 * hash) + COURSEID_FIELD_NUMBER;
    hash = (53 * hash) + getCourseId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.grpc.login.ShowCourseApplyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grpc.login.ShowCourseApplyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.login.ShowCourseApplyRequest parseFrom(
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
  public static Builder newBuilder(io.grpc.login.ShowCourseApplyRequest prototype) {
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
   * Protobuf type {@code login.ShowCourseApplyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:login.ShowCourseApplyRequest)
      io.grpc.login.ShowCourseApplyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.login.LoginProto.internal_static_login_ShowCourseApplyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.login.LoginProto.internal_static_login_ShowCourseApplyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.login.ShowCourseApplyRequest.class, io.grpc.login.ShowCourseApplyRequest.Builder.class);
    }

    // Construct using io.grpc.login.ShowCourseApplyRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      studentId_ = 0;
      courseId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.login.LoginProto.internal_static_login_ShowCourseApplyRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.login.ShowCourseApplyRequest getDefaultInstanceForType() {
      return io.grpc.login.ShowCourseApplyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.login.ShowCourseApplyRequest build() {
      io.grpc.login.ShowCourseApplyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.login.ShowCourseApplyRequest buildPartial() {
      io.grpc.login.ShowCourseApplyRequest result = new io.grpc.login.ShowCourseApplyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grpc.login.ShowCourseApplyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.studentId_ = studentId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.courseId_ = courseId_;
      }
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
      if (other instanceof io.grpc.login.ShowCourseApplyRequest) {
        return mergeFrom((io.grpc.login.ShowCourseApplyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.login.ShowCourseApplyRequest other) {
      if (other == io.grpc.login.ShowCourseApplyRequest.getDefaultInstance()) return this;
      if (other.getStudentId() != 0) {
        setStudentId(other.getStudentId());
      }
      if (!other.getCourseId().isEmpty()) {
        courseId_ = other.courseId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              studentId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              courseId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int studentId_ ;
    /**
     * <code>int32 studentId = 1;</code>
     * @return The studentId.
     */
    @java.lang.Override
    public int getStudentId() {
      return studentId_;
    }
    /**
     * <code>int32 studentId = 1;</code>
     * @param value The studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentId(int value) {

      studentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 studentId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStudentId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      studentId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object courseId_ = "";
    /**
     * <code>string courseId = 2;</code>
     * @return The courseId.
     */
    public java.lang.String getCourseId() {
      java.lang.Object ref = courseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        courseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string courseId = 2;</code>
     * @return The bytes for courseId.
     */
    public com.google.protobuf.ByteString
        getCourseIdBytes() {
      java.lang.Object ref = courseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        courseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string courseId = 2;</code>
     * @param value The courseId to set.
     * @return This builder for chaining.
     */
    public Builder setCourseId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      courseId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string courseId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCourseId() {
      courseId_ = getDefaultInstance().getCourseId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string courseId = 2;</code>
     * @param value The bytes for courseId to set.
     * @return This builder for chaining.
     */
    public Builder setCourseIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      courseId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:login.ShowCourseApplyRequest)
  }

  // @@protoc_insertion_point(class_scope:login.ShowCourseApplyRequest)
  private static final io.grpc.login.ShowCourseApplyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.login.ShowCourseApplyRequest();
  }

  public static io.grpc.login.ShowCourseApplyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShowCourseApplyRequest>
      PARSER = new com.google.protobuf.AbstractParser<ShowCourseApplyRequest>() {
    @java.lang.Override
    public ShowCourseApplyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ShowCourseApplyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShowCourseApplyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.login.ShowCourseApplyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

