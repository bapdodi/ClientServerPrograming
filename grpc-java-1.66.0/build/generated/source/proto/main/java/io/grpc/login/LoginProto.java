// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login.proto

// Protobuf Java Version: 3.25.3
package io.grpc.login;

public final class LoginProto {
  private LoginProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_LoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_JoinRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_JoinRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_JoinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_JoinResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013login.proto\022\005login\",\n\014LoginRequest\022\n\n\002" +
      "id\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"\037\n\rLoginRespo" +
      "nse\022\016\n\006result\030\001 \001(\t\"9\n\013JoinRequest\022\n\n\002id" +
      "\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\"\036" +
      "\n\014JoinResponse\022\016\n\006result\030\001 \001(\t2l\n\005Login\022" +
      "2\n\005login\022\023.login.LoginRequest\032\024.login.Lo" +
      "ginResponse\022/\n\004join\022\022.login.JoinRequest\032" +
      "\023.login.JoinResponseB#\n\rio.grpc.loginB\nL" +
      "oginProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_login_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_login_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_LoginRequest_descriptor,
        new java.lang.String[] { "Id", "Password", });
    internal_static_login_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_login_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_LoginResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_JoinRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_login_JoinRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_JoinRequest_descriptor,
        new java.lang.String[] { "Id", "Password", "Name", });
    internal_static_login_JoinResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_login_JoinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_JoinResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
