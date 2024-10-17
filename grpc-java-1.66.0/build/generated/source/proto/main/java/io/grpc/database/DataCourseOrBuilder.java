// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: database.proto

// Protobuf Java Version: 3.25.3
package io.grpc.database;

public interface DataCourseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:database.DataCourse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 과목 ID
   * </pre>
   *
   * <code>int32 course_id = 1;</code>
   * @return The courseId.
   */
  int getCourseId();

  /**
   * <pre>
   * 과목 이름
   * </pre>
   *
   * <code>string course_name = 2;</code>
   * @return The courseName.
   */
  java.lang.String getCourseName();
  /**
   * <pre>
   * 과목 이름
   * </pre>
   *
   * <code>string course_name = 2;</code>
   * @return The bytes for courseName.
   */
  com.google.protobuf.ByteString
      getCourseNameBytes();

  /**
   * <pre>
   * 교수 이름
   * </pre>
   *
   * <code>string course_professor = 3;</code>
   * @return The courseProfessor.
   */
  java.lang.String getCourseProfessor();
  /**
   * <pre>
   * 교수 이름
   * </pre>
   *
   * <code>string course_professor = 3;</code>
   * @return The bytes for courseProfessor.
   */
  com.google.protobuf.ByteString
      getCourseProfessorBytes();

  /**
   * <code>repeated int32 course_limited = 4;</code>
   * @return A list containing the courseLimited.
   */
  java.util.List<java.lang.Integer> getCourseLimitedList();
  /**
   * <code>repeated int32 course_limited = 4;</code>
   * @return The count of courseLimited.
   */
  int getCourseLimitedCount();
  /**
   * <code>repeated int32 course_limited = 4;</code>
   * @param index The index of the element to return.
   * @return The courseLimited at the given index.
   */
  int getCourseLimited(int index);
}
