// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: database.proto

// Protobuf Java Version: 3.25.3
package io.grpc.database;

public interface GetCourseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:database.GetCourseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .database.DataCourse course = 1;</code>
   * @return Whether the course field is set.
   */
  boolean hasCourse();
  /**
   * <code>optional .database.DataCourse course = 1;</code>
   * @return The course.
   */
  io.grpc.database.DataCourse getCourse();
  /**
   * <code>optional .database.DataCourse course = 1;</code>
   */
  io.grpc.database.DataCourseOrBuilder getCourseOrBuilder();
}
