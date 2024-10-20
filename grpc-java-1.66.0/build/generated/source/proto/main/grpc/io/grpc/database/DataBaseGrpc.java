package io.grpc.database;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: database.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataBaseGrpc {

  private DataBaseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "database.DataBase";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetStudentRequest,
      io.grpc.database.GetStudentResponse> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = io.grpc.database.GetStudentRequest.class,
      responseType = io.grpc.database.GetStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetStudentRequest,
      io.grpc.database.GetStudentResponse> getGetStudentMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetStudentRequest, io.grpc.database.GetStudentResponse> getGetStudentMethod;
    if ((getGetStudentMethod = DataBaseGrpc.getGetStudentMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetStudentMethod = DataBaseGrpc.getGetStudentMethod) == null) {
          DataBaseGrpc.getGetStudentMethod = getGetStudentMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetStudentRequest, io.grpc.database.GetStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetStudent"))
              .build();
        }
      }
    }
    return getGetStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetCourseRequest,
      io.grpc.database.GetCourseResponse> getGetCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCourse",
      requestType = io.grpc.database.GetCourseRequest.class,
      responseType = io.grpc.database.GetCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetCourseRequest,
      io.grpc.database.GetCourseResponse> getGetCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetCourseRequest, io.grpc.database.GetCourseResponse> getGetCourseMethod;
    if ((getGetCourseMethod = DataBaseGrpc.getGetCourseMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetCourseMethod = DataBaseGrpc.getGetCourseMethod) == null) {
          DataBaseGrpc.getGetCourseMethod = getGetCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetCourseRequest, io.grpc.database.GetCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetCourse"))
              .build();
        }
      }
    }
    return getGetCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetJoinRequest,
      io.grpc.database.GetJoinResponse> getGetJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJoin",
      requestType = io.grpc.database.GetJoinRequest.class,
      responseType = io.grpc.database.GetJoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetJoinRequest,
      io.grpc.database.GetJoinResponse> getGetJoinMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetJoinRequest, io.grpc.database.GetJoinResponse> getGetJoinMethod;
    if ((getGetJoinMethod = DataBaseGrpc.getGetJoinMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetJoinMethod = DataBaseGrpc.getGetJoinMethod) == null) {
          DataBaseGrpc.getGetJoinMethod = getGetJoinMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetJoinRequest, io.grpc.database.GetJoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetJoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetJoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetJoin"))
              .build();
        }
      }
    }
    return getGetJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetStudentListRequest,
      io.grpc.database.GetStudentListResponse> getGetStudentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentList",
      requestType = io.grpc.database.GetStudentListRequest.class,
      responseType = io.grpc.database.GetStudentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetStudentListRequest,
      io.grpc.database.GetStudentListResponse> getGetStudentListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetStudentListRequest, io.grpc.database.GetStudentListResponse> getGetStudentListMethod;
    if ((getGetStudentListMethod = DataBaseGrpc.getGetStudentListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetStudentListMethod = DataBaseGrpc.getGetStudentListMethod) == null) {
          DataBaseGrpc.getGetStudentListMethod = getGetStudentListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetStudentListRequest, io.grpc.database.GetStudentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetStudentList"))
              .build();
        }
      }
    }
    return getGetStudentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetCourseListRequest,
      io.grpc.database.GetCourseListResponse> getGetCourseListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCourseList",
      requestType = io.grpc.database.GetCourseListRequest.class,
      responseType = io.grpc.database.GetCourseListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetCourseListRequest,
      io.grpc.database.GetCourseListResponse> getGetCourseListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetCourseListRequest, io.grpc.database.GetCourseListResponse> getGetCourseListMethod;
    if ((getGetCourseListMethod = DataBaseGrpc.getGetCourseListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetCourseListMethod = DataBaseGrpc.getGetCourseListMethod) == null) {
          DataBaseGrpc.getGetCourseListMethod = getGetCourseListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetCourseListRequest, io.grpc.database.GetCourseListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCourseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetCourseList"))
              .build();
        }
      }
    }
    return getGetCourseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.DataDeleteStudentRequest,
      io.grpc.database.DataDeleteStudentResponse> getDataDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataDeleteStudent",
      requestType = io.grpc.database.DataDeleteStudentRequest.class,
      responseType = io.grpc.database.DataDeleteStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.DataDeleteStudentRequest,
      io.grpc.database.DataDeleteStudentResponse> getDataDeleteStudentMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.DataDeleteStudentRequest, io.grpc.database.DataDeleteStudentResponse> getDataDeleteStudentMethod;
    if ((getDataDeleteStudentMethod = DataBaseGrpc.getDataDeleteStudentMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getDataDeleteStudentMethod = DataBaseGrpc.getDataDeleteStudentMethod) == null) {
          DataBaseGrpc.getDataDeleteStudentMethod = getDataDeleteStudentMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.DataDeleteStudentRequest, io.grpc.database.DataDeleteStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataDeleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataDeleteStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataDeleteStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("DataDeleteStudent"))
              .build();
        }
      }
    }
    return getDataDeleteStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.DataEnrollCourseRequest,
      io.grpc.database.DataEnrollCourseResponse> getDataEnrollCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataEnrollCourse",
      requestType = io.grpc.database.DataEnrollCourseRequest.class,
      responseType = io.grpc.database.DataEnrollCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.DataEnrollCourseRequest,
      io.grpc.database.DataEnrollCourseResponse> getDataEnrollCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.DataEnrollCourseRequest, io.grpc.database.DataEnrollCourseResponse> getDataEnrollCourseMethod;
    if ((getDataEnrollCourseMethod = DataBaseGrpc.getDataEnrollCourseMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getDataEnrollCourseMethod = DataBaseGrpc.getDataEnrollCourseMethod) == null) {
          DataBaseGrpc.getDataEnrollCourseMethod = getDataEnrollCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.DataEnrollCourseRequest, io.grpc.database.DataEnrollCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataEnrollCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataEnrollCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataEnrollCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("DataEnrollCourse"))
              .build();
        }
      }
    }
    return getDataEnrollCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.DataDropCourseRequest,
      io.grpc.database.DataDropCourseResponse> getDataDropCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataDropCourse",
      requestType = io.grpc.database.DataDropCourseRequest.class,
      responseType = io.grpc.database.DataDropCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.DataDropCourseRequest,
      io.grpc.database.DataDropCourseResponse> getDataDropCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.DataDropCourseRequest, io.grpc.database.DataDropCourseResponse> getDataDropCourseMethod;
    if ((getDataDropCourseMethod = DataBaseGrpc.getDataDropCourseMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getDataDropCourseMethod = DataBaseGrpc.getDataDropCourseMethod) == null) {
          DataBaseGrpc.getDataDropCourseMethod = getDataDropCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.DataDropCourseRequest, io.grpc.database.DataDropCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataDropCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataDropCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataDropCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("DataDropCourse"))
              .build();
        }
      }
    }
    return getDataDropCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.DataAddCourseRequest,
      io.grpc.database.DataAddCourseResponse> getDataAddCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataAddCourse",
      requestType = io.grpc.database.DataAddCourseRequest.class,
      responseType = io.grpc.database.DataAddCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.DataAddCourseRequest,
      io.grpc.database.DataAddCourseResponse> getDataAddCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.DataAddCourseRequest, io.grpc.database.DataAddCourseResponse> getDataAddCourseMethod;
    if ((getDataAddCourseMethod = DataBaseGrpc.getDataAddCourseMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getDataAddCourseMethod = DataBaseGrpc.getDataAddCourseMethod) == null) {
          DataBaseGrpc.getDataAddCourseMethod = getDataAddCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.DataAddCourseRequest, io.grpc.database.DataAddCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataAddCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataAddCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataAddCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("DataAddCourse"))
              .build();
        }
      }
    }
    return getDataAddCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.DataDeleteCourseRequest,
      io.grpc.database.DataDeleteCourseResponse> getDataDeleteCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataDeleteCourse",
      requestType = io.grpc.database.DataDeleteCourseRequest.class,
      responseType = io.grpc.database.DataDeleteCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.DataDeleteCourseRequest,
      io.grpc.database.DataDeleteCourseResponse> getDataDeleteCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.DataDeleteCourseRequest, io.grpc.database.DataDeleteCourseResponse> getDataDeleteCourseMethod;
    if ((getDataDeleteCourseMethod = DataBaseGrpc.getDataDeleteCourseMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getDataDeleteCourseMethod = DataBaseGrpc.getDataDeleteCourseMethod) == null) {
          DataBaseGrpc.getDataDeleteCourseMethod = getDataDeleteCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.DataDeleteCourseRequest, io.grpc.database.DataDeleteCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataDeleteCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataDeleteCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.DataDeleteCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("DataDeleteCourse"))
              .build();
        }
      }
    }
    return getDataDeleteCourseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataBaseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataBaseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataBaseStub>() {
        @java.lang.Override
        public DataBaseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataBaseStub(channel, callOptions);
        }
      };
    return DataBaseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataBaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataBaseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataBaseBlockingStub>() {
        @java.lang.Override
        public DataBaseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataBaseBlockingStub(channel, callOptions);
        }
      };
    return DataBaseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataBaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataBaseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataBaseFutureStub>() {
        @java.lang.Override
        public DataBaseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataBaseFutureStub(channel, callOptions);
        }
      };
    return DataBaseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStudent(io.grpc.database.GetStudentRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    /**
     */
    default void getCourse(io.grpc.database.GetCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseMethod(), responseObserver);
    }

    /**
     */
    default void getJoin(io.grpc.database.GetJoinRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetJoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJoinMethod(), responseObserver);
    }

    /**
     */
    default void getStudentList(io.grpc.database.GetStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentListMethod(), responseObserver);
    }

    /**
     */
    default void getCourseList(io.grpc.database.GetCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseListMethod(), responseObserver);
    }

    /**
     */
    default void dataDeleteStudent(io.grpc.database.DataDeleteStudentRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataDeleteStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataDeleteStudentMethod(), responseObserver);
    }

    /**
     */
    default void dataEnrollCourse(io.grpc.database.DataEnrollCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataEnrollCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataEnrollCourseMethod(), responseObserver);
    }

    /**
     */
    default void dataDropCourse(io.grpc.database.DataDropCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataDropCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataDropCourseMethod(), responseObserver);
    }

    /**
     */
    default void dataAddCourse(io.grpc.database.DataAddCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataAddCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataAddCourseMethod(), responseObserver);
    }

    /**
     */
    default void dataDeleteCourse(io.grpc.database.DataDeleteCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataDeleteCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataDeleteCourseMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataBase.
   */
  public static abstract class DataBaseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataBaseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataBase.
   */
  public static final class DataBaseStub
      extends io.grpc.stub.AbstractAsyncStub<DataBaseStub> {
    private DataBaseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataBaseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataBaseStub(channel, callOptions);
    }

    /**
     */
    public void getStudent(io.grpc.database.GetStudentRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCourse(io.grpc.database.GetCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJoin(io.grpc.database.GetJoinRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetJoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentList(io.grpc.database.GetStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCourseList(io.grpc.database.GetCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataDeleteStudent(io.grpc.database.DataDeleteStudentRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataDeleteStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataEnrollCourse(io.grpc.database.DataEnrollCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataEnrollCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataEnrollCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataDropCourse(io.grpc.database.DataDropCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataDropCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataDropCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataAddCourse(io.grpc.database.DataAddCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataAddCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataAddCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataDeleteCourse(io.grpc.database.DataDeleteCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.DataDeleteCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataDeleteCourseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataBase.
   */
  public static final class DataBaseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataBaseBlockingStub> {
    private DataBaseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataBaseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataBaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.database.GetStudentResponse getStudent(io.grpc.database.GetStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetCourseResponse getCourse(io.grpc.database.GetCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetJoinResponse getJoin(io.grpc.database.GetJoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetStudentListResponse getStudentList(io.grpc.database.GetStudentListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetCourseListResponse getCourseList(io.grpc.database.GetCourseListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.DataDeleteStudentResponse dataDeleteStudent(io.grpc.database.DataDeleteStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataDeleteStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.DataEnrollCourseResponse dataEnrollCourse(io.grpc.database.DataEnrollCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataEnrollCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.DataDropCourseResponse dataDropCourse(io.grpc.database.DataDropCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataDropCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.DataAddCourseResponse dataAddCourse(io.grpc.database.DataAddCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataAddCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.DataDeleteCourseResponse dataDeleteCourse(io.grpc.database.DataDeleteCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataDeleteCourseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataBase.
   */
  public static final class DataBaseFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataBaseFutureStub> {
    private DataBaseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataBaseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataBaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetStudentResponse> getStudent(
        io.grpc.database.GetStudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetCourseResponse> getCourse(
        io.grpc.database.GetCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetJoinResponse> getJoin(
        io.grpc.database.GetJoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetStudentListResponse> getStudentList(
        io.grpc.database.GetStudentListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetCourseListResponse> getCourseList(
        io.grpc.database.GetCourseListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.DataDeleteStudentResponse> dataDeleteStudent(
        io.grpc.database.DataDeleteStudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataDeleteStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.DataEnrollCourseResponse> dataEnrollCourse(
        io.grpc.database.DataEnrollCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataEnrollCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.DataDropCourseResponse> dataDropCourse(
        io.grpc.database.DataDropCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataDropCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.DataAddCourseResponse> dataAddCourse(
        io.grpc.database.DataAddCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataAddCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.DataDeleteCourseResponse> dataDeleteCourse(
        io.grpc.database.DataDeleteCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataDeleteCourseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT = 0;
  private static final int METHODID_GET_COURSE = 1;
  private static final int METHODID_GET_JOIN = 2;
  private static final int METHODID_GET_STUDENT_LIST = 3;
  private static final int METHODID_GET_COURSE_LIST = 4;
  private static final int METHODID_DATA_DELETE_STUDENT = 5;
  private static final int METHODID_DATA_ENROLL_COURSE = 6;
  private static final int METHODID_DATA_DROP_COURSE = 7;
  private static final int METHODID_DATA_ADD_COURSE = 8;
  private static final int METHODID_DATA_DELETE_COURSE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((io.grpc.database.GetStudentRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetStudentResponse>) responseObserver);
          break;
        case METHODID_GET_COURSE:
          serviceImpl.getCourse((io.grpc.database.GetCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetCourseResponse>) responseObserver);
          break;
        case METHODID_GET_JOIN:
          serviceImpl.getJoin((io.grpc.database.GetJoinRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetJoinResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_LIST:
          serviceImpl.getStudentList((io.grpc.database.GetStudentListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetStudentListResponse>) responseObserver);
          break;
        case METHODID_GET_COURSE_LIST:
          serviceImpl.getCourseList((io.grpc.database.GetCourseListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetCourseListResponse>) responseObserver);
          break;
        case METHODID_DATA_DELETE_STUDENT:
          serviceImpl.dataDeleteStudent((io.grpc.database.DataDeleteStudentRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.DataDeleteStudentResponse>) responseObserver);
          break;
        case METHODID_DATA_ENROLL_COURSE:
          serviceImpl.dataEnrollCourse((io.grpc.database.DataEnrollCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.DataEnrollCourseResponse>) responseObserver);
          break;
        case METHODID_DATA_DROP_COURSE:
          serviceImpl.dataDropCourse((io.grpc.database.DataDropCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.DataDropCourseResponse>) responseObserver);
          break;
        case METHODID_DATA_ADD_COURSE:
          serviceImpl.dataAddCourse((io.grpc.database.DataAddCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.DataAddCourseResponse>) responseObserver);
          break;
        case METHODID_DATA_DELETE_COURSE:
          serviceImpl.dataDeleteCourse((io.grpc.database.DataDeleteCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.DataDeleteCourseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetStudentRequest,
              io.grpc.database.GetStudentResponse>(
                service, METHODID_GET_STUDENT)))
        .addMethod(
          getGetCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetCourseRequest,
              io.grpc.database.GetCourseResponse>(
                service, METHODID_GET_COURSE)))
        .addMethod(
          getGetJoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetJoinRequest,
              io.grpc.database.GetJoinResponse>(
                service, METHODID_GET_JOIN)))
        .addMethod(
          getGetStudentListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetStudentListRequest,
              io.grpc.database.GetStudentListResponse>(
                service, METHODID_GET_STUDENT_LIST)))
        .addMethod(
          getGetCourseListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetCourseListRequest,
              io.grpc.database.GetCourseListResponse>(
                service, METHODID_GET_COURSE_LIST)))
        .addMethod(
          getDataDeleteStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.DataDeleteStudentRequest,
              io.grpc.database.DataDeleteStudentResponse>(
                service, METHODID_DATA_DELETE_STUDENT)))
        .addMethod(
          getDataEnrollCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.DataEnrollCourseRequest,
              io.grpc.database.DataEnrollCourseResponse>(
                service, METHODID_DATA_ENROLL_COURSE)))
        .addMethod(
          getDataDropCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.DataDropCourseRequest,
              io.grpc.database.DataDropCourseResponse>(
                service, METHODID_DATA_DROP_COURSE)))
        .addMethod(
          getDataAddCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.DataAddCourseRequest,
              io.grpc.database.DataAddCourseResponse>(
                service, METHODID_DATA_ADD_COURSE)))
        .addMethod(
          getDataDeleteCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.DataDeleteCourseRequest,
              io.grpc.database.DataDeleteCourseResponse>(
                service, METHODID_DATA_DELETE_COURSE)))
        .build();
  }

  private static abstract class DataBaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataBaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.database.DatabaseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataBase");
    }
  }

  private static final class DataBaseFileDescriptorSupplier
      extends DataBaseBaseDescriptorSupplier {
    DataBaseFileDescriptorSupplier() {}
  }

  private static final class DataBaseMethodDescriptorSupplier
      extends DataBaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataBaseMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataBaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataBaseFileDescriptorSupplier())
              .addMethod(getGetStudentMethod())
              .addMethod(getGetCourseMethod())
              .addMethod(getGetJoinMethod())
              .addMethod(getGetStudentListMethod())
              .addMethod(getGetCourseListMethod())
              .addMethod(getDataDeleteStudentMethod())
              .addMethod(getDataEnrollCourseMethod())
              .addMethod(getDataDropCourseMethod())
              .addMethod(getDataAddCourseMethod())
              .addMethod(getDataDeleteCourseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
