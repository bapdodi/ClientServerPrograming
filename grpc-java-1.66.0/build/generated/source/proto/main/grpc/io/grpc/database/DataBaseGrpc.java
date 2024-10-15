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
  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetLoginRequest,
      io.grpc.database.GetLoginResponse> getGetLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogin",
      requestType = io.grpc.database.GetLoginRequest.class,
      responseType = io.grpc.database.GetLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetLoginRequest,
      io.grpc.database.GetLoginResponse> getGetLoginMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetLoginRequest, io.grpc.database.GetLoginResponse> getGetLoginMethod;
    if ((getGetLoginMethod = DataBaseGrpc.getGetLoginMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetLoginMethod = DataBaseGrpc.getGetLoginMethod) == null) {
          DataBaseGrpc.getGetLoginMethod = getGetLoginMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetLoginRequest, io.grpc.database.GetLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetLogin"))
              .build();
        }
      }
    }
    return getGetLoginMethod;
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

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetStudentCourseListRequest,
      io.grpc.database.GetStudentCourseListResponse> getGetStudentCourseListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentCourseList",
      requestType = io.grpc.database.GetStudentCourseListRequest.class,
      responseType = io.grpc.database.GetStudentCourseListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetStudentCourseListRequest,
      io.grpc.database.GetStudentCourseListResponse> getGetStudentCourseListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetStudentCourseListRequest, io.grpc.database.GetStudentCourseListResponse> getGetStudentCourseListMethod;
    if ((getGetStudentCourseListMethod = DataBaseGrpc.getGetStudentCourseListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetStudentCourseListMethod = DataBaseGrpc.getGetStudentCourseListMethod) == null) {
          DataBaseGrpc.getGetStudentCourseListMethod = getGetStudentCourseListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetStudentCourseListRequest, io.grpc.database.GetStudentCourseListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentCourseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentCourseListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentCourseListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetStudentCourseList"))
              .build();
        }
      }
    }
    return getGetStudentCourseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetCourseStudentListRequest,
      io.grpc.database.GetCourseStudentListResponse> getGetCourseStudentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCourseStudentList",
      requestType = io.grpc.database.GetCourseStudentListRequest.class,
      responseType = io.grpc.database.GetCourseStudentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetCourseStudentListRequest,
      io.grpc.database.GetCourseStudentListResponse> getGetCourseStudentListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetCourseStudentListRequest, io.grpc.database.GetCourseStudentListResponse> getGetCourseStudentListMethod;
    if ((getGetCourseStudentListMethod = DataBaseGrpc.getGetCourseStudentListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetCourseStudentListMethod = DataBaseGrpc.getGetCourseStudentListMethod) == null) {
          DataBaseGrpc.getGetCourseStudentListMethod = getGetCourseStudentListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetCourseStudentListRequest, io.grpc.database.GetCourseStudentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCourseStudentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseStudentListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseStudentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetCourseStudentList"))
              .build();
        }
      }
    }
    return getGetCourseStudentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetCompleteListRequest,
      io.grpc.database.GetCompleteListResponse> getGetCompleteListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompleteList",
      requestType = io.grpc.database.GetCompleteListRequest.class,
      responseType = io.grpc.database.GetCompleteListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetCompleteListRequest,
      io.grpc.database.GetCompleteListResponse> getGetCompleteListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetCompleteListRequest, io.grpc.database.GetCompleteListResponse> getGetCompleteListMethod;
    if ((getGetCompleteListMethod = DataBaseGrpc.getGetCompleteListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetCompleteListMethod = DataBaseGrpc.getGetCompleteListMethod) == null) {
          DataBaseGrpc.getGetCompleteListMethod = getGetCompleteListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetCompleteListRequest, io.grpc.database.GetCompleteListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompleteList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCompleteListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCompleteListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetCompleteList"))
              .build();
        }
      }
    }
    return getGetCompleteListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetCourseApplyRequest,
      io.grpc.database.GetCourseApplyResponse> getGetCourseApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCourseApply",
      requestType = io.grpc.database.GetCourseApplyRequest.class,
      responseType = io.grpc.database.GetCourseApplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetCourseApplyRequest,
      io.grpc.database.GetCourseApplyResponse> getGetCourseApplyMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetCourseApplyRequest, io.grpc.database.GetCourseApplyResponse> getGetCourseApplyMethod;
    if ((getGetCourseApplyMethod = DataBaseGrpc.getGetCourseApplyMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetCourseApplyMethod = DataBaseGrpc.getGetCourseApplyMethod) == null) {
          DataBaseGrpc.getGetCourseApplyMethod = getGetCourseApplyMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetCourseApplyRequest, io.grpc.database.GetCourseApplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCourseApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseApplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetCourseApplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetCourseApply"))
              .build();
        }
      }
    }
    return getGetCourseApplyMethod;
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
    default void getLogin(io.grpc.database.GetLoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLoginMethod(), responseObserver);
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
    default void getStudentCourseList(io.grpc.database.GetStudentCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentCourseListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentCourseListMethod(), responseObserver);
    }

    /**
     */
    default void getCourseStudentList(io.grpc.database.GetCourseStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseStudentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseStudentListMethod(), responseObserver);
    }

    /**
     */
    default void getCompleteList(io.grpc.database.GetCompleteListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCompleteListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompleteListMethod(), responseObserver);
    }

    /**
     */
    default void getCourseApply(io.grpc.database.GetCourseApplyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseApplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseApplyMethod(), responseObserver);
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
    public void getLogin(io.grpc.database.GetLoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLoginMethod(), getCallOptions()), request, responseObserver);
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
    public void getStudentCourseList(io.grpc.database.GetStudentCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentCourseListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentCourseListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCourseStudentList(io.grpc.database.GetCourseStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseStudentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseStudentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompleteList(io.grpc.database.GetCompleteListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCompleteListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCompleteListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCourseApply(io.grpc.database.GetCourseApplyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCourseApplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseApplyMethod(), getCallOptions()), request, responseObserver);
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
    public io.grpc.database.GetLoginResponse getLogin(io.grpc.database.GetLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLoginMethod(), getCallOptions(), request);
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
    public io.grpc.database.GetStudentCourseListResponse getStudentCourseList(io.grpc.database.GetStudentCourseListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentCourseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetCourseStudentListResponse getCourseStudentList(io.grpc.database.GetCourseStudentListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetCompleteListResponse getCompleteList(io.grpc.database.GetCompleteListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompleteListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetCourseApplyResponse getCourseApply(io.grpc.database.GetCourseApplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseApplyMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetLoginResponse> getLogin(
        io.grpc.database.GetLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLoginMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetStudentCourseListResponse> getStudentCourseList(
        io.grpc.database.GetStudentCourseListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentCourseListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetCourseStudentListResponse> getCourseStudentList(
        io.grpc.database.GetCourseStudentListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseStudentListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetCompleteListResponse> getCompleteList(
        io.grpc.database.GetCompleteListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCompleteListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetCourseApplyResponse> getCourseApply(
        io.grpc.database.GetCourseApplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseApplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOGIN = 0;
  private static final int METHODID_GET_JOIN = 1;
  private static final int METHODID_GET_STUDENT_LIST = 2;
  private static final int METHODID_GET_COURSE_LIST = 3;
  private static final int METHODID_GET_STUDENT_COURSE_LIST = 4;
  private static final int METHODID_GET_COURSE_STUDENT_LIST = 5;
  private static final int METHODID_GET_COMPLETE_LIST = 6;
  private static final int METHODID_GET_COURSE_APPLY = 7;

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
        case METHODID_GET_LOGIN:
          serviceImpl.getLogin((io.grpc.database.GetLoginRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetLoginResponse>) responseObserver);
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
        case METHODID_GET_STUDENT_COURSE_LIST:
          serviceImpl.getStudentCourseList((io.grpc.database.GetStudentCourseListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetStudentCourseListResponse>) responseObserver);
          break;
        case METHODID_GET_COURSE_STUDENT_LIST:
          serviceImpl.getCourseStudentList((io.grpc.database.GetCourseStudentListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetCourseStudentListResponse>) responseObserver);
          break;
        case METHODID_GET_COMPLETE_LIST:
          serviceImpl.getCompleteList((io.grpc.database.GetCompleteListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetCompleteListResponse>) responseObserver);
          break;
        case METHODID_GET_COURSE_APPLY:
          serviceImpl.getCourseApply((io.grpc.database.GetCourseApplyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetCourseApplyResponse>) responseObserver);
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
          getGetLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetLoginRequest,
              io.grpc.database.GetLoginResponse>(
                service, METHODID_GET_LOGIN)))
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
          getGetStudentCourseListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetStudentCourseListRequest,
              io.grpc.database.GetStudentCourseListResponse>(
                service, METHODID_GET_STUDENT_COURSE_LIST)))
        .addMethod(
          getGetCourseStudentListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetCourseStudentListRequest,
              io.grpc.database.GetCourseStudentListResponse>(
                service, METHODID_GET_COURSE_STUDENT_LIST)))
        .addMethod(
          getGetCompleteListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetCompleteListRequest,
              io.grpc.database.GetCompleteListResponse>(
                service, METHODID_GET_COMPLETE_LIST)))
        .addMethod(
          getGetCourseApplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetCourseApplyRequest,
              io.grpc.database.GetCourseApplyResponse>(
                service, METHODID_GET_COURSE_APPLY)))
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
              .addMethod(getGetLoginMethod())
              .addMethod(getGetJoinMethod())
              .addMethod(getGetStudentListMethod())
              .addMethod(getGetCourseListMethod())
              .addMethod(getGetStudentCourseListMethod())
              .addMethod(getGetCourseStudentListMethod())
              .addMethod(getGetCompleteListMethod())
              .addMethod(getGetCourseApplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
