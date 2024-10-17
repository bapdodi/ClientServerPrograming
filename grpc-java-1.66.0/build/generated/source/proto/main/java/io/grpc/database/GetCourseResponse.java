// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: database.proto

// Protobuf Java Version: 3.25.3
package io.grpc.database;

/**
 * Protobuf type {@code database.GetCourseResponse}
 */
public final class GetCourseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:database.GetCourseResponse)
    GetCourseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCourseResponse.newBuilder() to construct.
  private GetCourseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCourseResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCourseResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.database.DatabaseProto.internal_static_database_GetCourseResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.database.DatabaseProto.internal_static_database_GetCourseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.database.GetCourseResponse.class, io.grpc.database.GetCourseResponse.Builder.class);
  }

  private int bitField0_;
  public static final int COURSE_FIELD_NUMBER = 1;
  private io.grpc.database.DataCourse course_;
  /**
   * <code>optional .database.DataCourse course = 1;</code>
   * @return Whether the course field is set.
   */
  @java.lang.Override
  public boolean hasCourse() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .database.DataCourse course = 1;</code>
   * @return The course.
   */
  @java.lang.Override
  public io.grpc.database.DataCourse getCourse() {
    return course_ == null ? io.grpc.database.DataCourse.getDefaultInstance() : course_;
  }
  /**
   * <code>optional .database.DataCourse course = 1;</code>
   */
  @java.lang.Override
  public io.grpc.database.DataCourseOrBuilder getCourseOrBuilder() {
    return course_ == null ? io.grpc.database.DataCourse.getDefaultInstance() : course_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCourse());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCourse());
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
    if (!(obj instanceof io.grpc.database.GetCourseResponse)) {
      return super.equals(obj);
    }
    io.grpc.database.GetCourseResponse other = (io.grpc.database.GetCourseResponse) obj;

    if (hasCourse() != other.hasCourse()) return false;
    if (hasCourse()) {
      if (!getCourse()
          .equals(other.getCourse())) return false;
    }
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
    if (hasCourse()) {
      hash = (37 * hash) + COURSE_FIELD_NUMBER;
      hash = (53 * hash) + getCourse().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.database.GetCourseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.grpc.database.GetCourseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grpc.database.GetCourseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.database.GetCourseResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.database.GetCourseResponse prototype) {
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
   * Protobuf type {@code database.GetCourseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:database.GetCourseResponse)
      io.grpc.database.GetCourseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.database.DatabaseProto.internal_static_database_GetCourseResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.database.DatabaseProto.internal_static_database_GetCourseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.database.GetCourseResponse.class, io.grpc.database.GetCourseResponse.Builder.class);
    }

    // Construct using io.grpc.database.GetCourseResponse.newBuilder()
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
        getCourseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      course_ = null;
      if (courseBuilder_ != null) {
        courseBuilder_.dispose();
        courseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.database.DatabaseProto.internal_static_database_GetCourseResponse_descriptor;
    }

    @java.lang.Override
    public io.grpc.database.GetCourseResponse getDefaultInstanceForType() {
      return io.grpc.database.GetCourseResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.database.GetCourseResponse build() {
      io.grpc.database.GetCourseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.database.GetCourseResponse buildPartial() {
      io.grpc.database.GetCourseResponse result = new io.grpc.database.GetCourseResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grpc.database.GetCourseResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.course_ = courseBuilder_ == null
            ? course_
            : courseBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof io.grpc.database.GetCourseResponse) {
        return mergeFrom((io.grpc.database.GetCourseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.database.GetCourseResponse other) {
      if (other == io.grpc.database.GetCourseResponse.getDefaultInstance()) return this;
      if (other.hasCourse()) {
        mergeCourse(other.getCourse());
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
            case 10: {
              input.readMessage(
                  getCourseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private io.grpc.database.DataCourse course_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.database.DataCourse, io.grpc.database.DataCourse.Builder, io.grpc.database.DataCourseOrBuilder> courseBuilder_;
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     * @return Whether the course field is set.
     */
    public boolean hasCourse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     * @return The course.
     */
    public io.grpc.database.DataCourse getCourse() {
      if (courseBuilder_ == null) {
        return course_ == null ? io.grpc.database.DataCourse.getDefaultInstance() : course_;
      } else {
        return courseBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     */
    public Builder setCourse(io.grpc.database.DataCourse value) {
      if (courseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        course_ = value;
      } else {
        courseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     */
    public Builder setCourse(
        io.grpc.database.DataCourse.Builder builderForValue) {
      if (courseBuilder_ == null) {
        course_ = builderForValue.build();
      } else {
        courseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     */
    public Builder mergeCourse(io.grpc.database.DataCourse value) {
      if (courseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          course_ != null &&
          course_ != io.grpc.database.DataCourse.getDefaultInstance()) {
          getCourseBuilder().mergeFrom(value);
        } else {
          course_ = value;
        }
      } else {
        courseBuilder_.mergeFrom(value);
      }
      if (course_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     */
    public Builder clearCourse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      course_ = null;
      if (courseBuilder_ != null) {
        courseBuilder_.dispose();
        courseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     */
    public io.grpc.database.DataCourse.Builder getCourseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCourseFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     */
    public io.grpc.database.DataCourseOrBuilder getCourseOrBuilder() {
      if (courseBuilder_ != null) {
        return courseBuilder_.getMessageOrBuilder();
      } else {
        return course_ == null ?
            io.grpc.database.DataCourse.getDefaultInstance() : course_;
      }
    }
    /**
     * <code>optional .database.DataCourse course = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.database.DataCourse, io.grpc.database.DataCourse.Builder, io.grpc.database.DataCourseOrBuilder> 
        getCourseFieldBuilder() {
      if (courseBuilder_ == null) {
        courseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.database.DataCourse, io.grpc.database.DataCourse.Builder, io.grpc.database.DataCourseOrBuilder>(
                getCourse(),
                getParentForChildren(),
                isClean());
        course_ = null;
      }
      return courseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:database.GetCourseResponse)
  }

  // @@protoc_insertion_point(class_scope:database.GetCourseResponse)
  private static final io.grpc.database.GetCourseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.database.GetCourseResponse();
  }

  public static io.grpc.database.GetCourseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCourseResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCourseResponse>() {
    @java.lang.Override
    public GetCourseResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCourseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCourseResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.database.GetCourseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

