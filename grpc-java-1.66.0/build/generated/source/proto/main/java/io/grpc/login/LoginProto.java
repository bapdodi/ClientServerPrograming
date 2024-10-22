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
    internal_static_login_ServerStudent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerStudent_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ShowStudentListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ShowStudentListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ShowStudentListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ShowStudentListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ShowCourseListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ShowCourseListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ShowCourseListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ShowCourseListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerDeleteStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerDeleteStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerDeleteStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerDeleteStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerEnrollCourseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerEnrollCourseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerEnrollCourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerEnrollCourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerDropCourseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerDropCourseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerDropCourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerDropCourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerAddCourseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerAddCourseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerAddCourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerAddCourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerDeleteCourseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerDeleteCourseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_login_ServerDeleteCourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_login_ServerDeleteCourseResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013login.proto\022\005login\"e\n\rServerStudent\022\022\n" +
      "\nstudent_id\030\001 \001(\005\022\020\n\010password\030\002 \001(\t\022\014\n\004n" +
      "ame\030\003 \001(\t\022\r\n\005major\030\004 \001(\t\022\021\n\tcourse_id\030\005 " +
      "\003(\005\"4\n\014LoginRequest\022\022\n\nstudent_id\030\001 \001(\005\022" +
      "\020\n\010password\030\002 \001(\t\"d\n\rLoginResponse\022*\n\007st" +
      "udent\030\001 \001(\0132\024.login.ServerStudentH\000\210\001\001\022\r" +
      "\n\005token\030\002 \001(\t\022\014\n\004role\030\003 \001(\tB\n\n\010_student\"" +
      "4\n\013JoinRequest\022%\n\007student\030\001 \001(\0132\024.login." +
      "ServerStudent\"\036\n\014JoinResponse\022\016\n\006result\030" +
      "\001 \001(\t\"\030\n\026ShowStudentListRequest\")\n\027ShowS" +
      "tudentListResponse\022\016\n\006result\030\001 \001(\t\"\027\n\025Sh" +
      "owCourseListRequest\"(\n\026ShowCourseListRes" +
      "ponse\022\016\n\006result\030\001 \001(\t\"/\n\032ServerDeleteStu" +
      "dentRequest\022\021\n\tstudentId\030\001 \001(\005\"-\n\033Server" +
      "DeleteStudentResponse\022\016\n\006result\030\001 \001(\t\"@\n" +
      "\031ServerEnrollCourseRequest\022\021\n\tstudentId\030" +
      "\001 \001(\005\022\020\n\010courseId\030\002 \001(\005\",\n\032ServerEnrollC" +
      "ourseResponse\022\016\n\006result\030\001 \001(\t\">\n\027ServerD" +
      "ropCourseRequest\022\021\n\tstudentId\030\001 \001(\005\022\020\n\010c" +
      "ourseId\030\002 \001(\005\"*\n\030ServerDropCourseRespons" +
      "e\022\016\n\006result\030\001 \001(\t\"n\n\026ServerAddCourseRequ" +
      "est\022\020\n\010courseId\030\001 \001(\005\022\022\n\ncourseName\030\002 \001(" +
      "\t\022\027\n\017courseProfessor\030\003 \001(\t\022\025\n\rcourseLimi" +
      "ted\030\004 \003(\005\")\n\027ServerAddCourseResponse\022\016\n\006" +
      "result\030\001 \001(\t\"-\n\031ServerDeleteCourseReques" +
      "t\022\020\n\010courseId\030\001 \001(\005\",\n\032ServerDeleteCours" +
      "eResponse\022\016\n\006result\030\001 \001(\t2\332\005\n\005Login\0224\n\005l" +
      "ogin\022\023.login.LoginRequest\032\024.login.LoginR" +
      "esponse\"\000\0221\n\004join\022\022.login.JoinRequest\032\023." +
      "login.JoinResponse\"\000\022R\n\017showStudentList\022" +
      "\035.login.ShowStudentListRequest\032\036.login.S" +
      "howStudentListResponse\"\000\022O\n\016showCourseLi" +
      "st\022\034.login.ShowCourseListRequest\032\035.login" +
      ".ShowCourseListResponse\"\000\022^\n\023serverDelet" +
      "eStudent\022!.login.ServerDeleteStudentRequ" +
      "est\032\".login.ServerDeleteStudentResponse\"" +
      "\000\022[\n\022serverEnrollCourse\022 .login.ServerEn" +
      "rollCourseRequest\032!.login.ServerEnrollCo" +
      "urseResponse\"\000\022U\n\020serverDropCourse\022\036.log" +
      "in.ServerDropCourseRequest\032\037.login.Serve" +
      "rDropCourseResponse\"\000\022R\n\017serverAddCourse" +
      "\022\035.login.ServerAddCourseRequest\032\036.login." +
      "ServerAddCourseResponse\"\000\022[\n\022serverDelet" +
      "eCourse\022 .login.ServerDeleteCourseReques" +
      "t\032!.login.ServerDeleteCourseResponse\"\000B#" +
      "\n\rio.grpc.loginB\nLoginProtoP\001\242\002\003HLWb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_login_ServerStudent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_login_ServerStudent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerStudent_descriptor,
        new java.lang.String[] { "StudentId", "Password", "Name", "Major", "CourseId", });
    internal_static_login_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_login_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_LoginRequest_descriptor,
        new java.lang.String[] { "StudentId", "Password", });
    internal_static_login_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_login_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_LoginResponse_descriptor,
        new java.lang.String[] { "Student", "Token", "Role", });
    internal_static_login_JoinRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_login_JoinRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_JoinRequest_descriptor,
        new java.lang.String[] { "Student", });
    internal_static_login_JoinResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_login_JoinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_JoinResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_ShowStudentListRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_login_ShowStudentListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ShowStudentListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_login_ShowStudentListResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_login_ShowStudentListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ShowStudentListResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_ShowCourseListRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_login_ShowCourseListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ShowCourseListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_login_ShowCourseListResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_login_ShowCourseListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ShowCourseListResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_ServerDeleteStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_login_ServerDeleteStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerDeleteStudentRequest_descriptor,
        new java.lang.String[] { "StudentId", });
    internal_static_login_ServerDeleteStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_login_ServerDeleteStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerDeleteStudentResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_ServerEnrollCourseRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_login_ServerEnrollCourseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerEnrollCourseRequest_descriptor,
        new java.lang.String[] { "StudentId", "CourseId", });
    internal_static_login_ServerEnrollCourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_login_ServerEnrollCourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerEnrollCourseResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_ServerDropCourseRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_login_ServerDropCourseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerDropCourseRequest_descriptor,
        new java.lang.String[] { "StudentId", "CourseId", });
    internal_static_login_ServerDropCourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_login_ServerDropCourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerDropCourseResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_ServerAddCourseRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_login_ServerAddCourseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerAddCourseRequest_descriptor,
        new java.lang.String[] { "CourseId", "CourseName", "CourseProfessor", "CourseLimited", });
    internal_static_login_ServerAddCourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_login_ServerAddCourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerAddCourseResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_login_ServerDeleteCourseRequest_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_login_ServerDeleteCourseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerDeleteCourseRequest_descriptor,
        new java.lang.String[] { "CourseId", });
    internal_static_login_ServerDeleteCourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_login_ServerDeleteCourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_login_ServerDeleteCourseResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
