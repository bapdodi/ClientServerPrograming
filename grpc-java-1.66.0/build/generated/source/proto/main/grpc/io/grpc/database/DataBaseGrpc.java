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

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetSubjectListRequest,
      io.grpc.database.GetSubjectListResponse> getGetSubjectListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubjectList",
      requestType = io.grpc.database.GetSubjectListRequest.class,
      responseType = io.grpc.database.GetSubjectListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetSubjectListRequest,
      io.grpc.database.GetSubjectListResponse> getGetSubjectListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetSubjectListRequest, io.grpc.database.GetSubjectListResponse> getGetSubjectListMethod;
    if ((getGetSubjectListMethod = DataBaseGrpc.getGetSubjectListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetSubjectListMethod = DataBaseGrpc.getGetSubjectListMethod) == null) {
          DataBaseGrpc.getGetSubjectListMethod = getGetSubjectListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetSubjectListRequest, io.grpc.database.GetSubjectListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubjectList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetSubjectListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetSubjectListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetSubjectList"))
              .build();
        }
      }
    }
    return getGetSubjectListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetStudentSubjectListRequest,
      io.grpc.database.GetStudentSubjectListResponse> getGetStudentSubjectListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentSubjectList",
      requestType = io.grpc.database.GetStudentSubjectListRequest.class,
      responseType = io.grpc.database.GetStudentSubjectListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetStudentSubjectListRequest,
      io.grpc.database.GetStudentSubjectListResponse> getGetStudentSubjectListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetStudentSubjectListRequest, io.grpc.database.GetStudentSubjectListResponse> getGetStudentSubjectListMethod;
    if ((getGetStudentSubjectListMethod = DataBaseGrpc.getGetStudentSubjectListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetStudentSubjectListMethod = DataBaseGrpc.getGetStudentSubjectListMethod) == null) {
          DataBaseGrpc.getGetStudentSubjectListMethod = getGetStudentSubjectListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetStudentSubjectListRequest, io.grpc.database.GetStudentSubjectListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentSubjectList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentSubjectListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetStudentSubjectListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetStudentSubjectList"))
              .build();
        }
      }
    }
    return getGetStudentSubjectListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetSubjectStudentListRequest,
      io.grpc.database.GetSubjectStudentListResponse> getGetSubjectStudentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubjectStudentList",
      requestType = io.grpc.database.GetSubjectStudentListRequest.class,
      responseType = io.grpc.database.GetSubjectStudentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetSubjectStudentListRequest,
      io.grpc.database.GetSubjectStudentListResponse> getGetSubjectStudentListMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetSubjectStudentListRequest, io.grpc.database.GetSubjectStudentListResponse> getGetSubjectStudentListMethod;
    if ((getGetSubjectStudentListMethod = DataBaseGrpc.getGetSubjectStudentListMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetSubjectStudentListMethod = DataBaseGrpc.getGetSubjectStudentListMethod) == null) {
          DataBaseGrpc.getGetSubjectStudentListMethod = getGetSubjectStudentListMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetSubjectStudentListRequest, io.grpc.database.GetSubjectStudentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubjectStudentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetSubjectStudentListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetSubjectStudentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetSubjectStudentList"))
              .build();
        }
      }
    }
    return getGetSubjectStudentListMethod;
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

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.GetSubjectApplyRequest,
      io.grpc.database.GetSubjectApplyResponse> getGetSubjectApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubjectApply",
      requestType = io.grpc.database.GetSubjectApplyRequest.class,
      responseType = io.grpc.database.GetSubjectApplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.GetSubjectApplyRequest,
      io.grpc.database.GetSubjectApplyResponse> getGetSubjectApplyMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.GetSubjectApplyRequest, io.grpc.database.GetSubjectApplyResponse> getGetSubjectApplyMethod;
    if ((getGetSubjectApplyMethod = DataBaseGrpc.getGetSubjectApplyMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getGetSubjectApplyMethod = DataBaseGrpc.getGetSubjectApplyMethod) == null) {
          DataBaseGrpc.getGetSubjectApplyMethod = getGetSubjectApplyMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.GetSubjectApplyRequest, io.grpc.database.GetSubjectApplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubjectApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetSubjectApplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.GetSubjectApplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("GetSubjectApply"))
              .build();
        }
      }
    }
    return getGetSubjectApplyMethod;
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
    default void getStudentList(io.grpc.database.GetStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentListMethod(), responseObserver);
    }

    /**
     */
    default void getSubjectList(io.grpc.database.GetSubjectListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubjectListMethod(), responseObserver);
    }

    /**
     */
    default void getStudentSubjectList(io.grpc.database.GetStudentSubjectListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentSubjectListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentSubjectListMethod(), responseObserver);
    }

    /**
     */
    default void getSubjectStudentList(io.grpc.database.GetSubjectStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectStudentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubjectStudentListMethod(), responseObserver);
    }

    /**
     */
    default void getCompleteList(io.grpc.database.GetCompleteListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetCompleteListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompleteListMethod(), responseObserver);
    }

    /**
     */
    default void getSubjectApply(io.grpc.database.GetSubjectApplyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectApplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubjectApplyMethod(), responseObserver);
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
    public void getStudentList(io.grpc.database.GetStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSubjectList(io.grpc.database.GetSubjectListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubjectListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentSubjectList(io.grpc.database.GetStudentSubjectListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetStudentSubjectListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentSubjectListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSubjectStudentList(io.grpc.database.GetSubjectStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectStudentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubjectStudentListMethod(), getCallOptions()), request, responseObserver);
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
    public void getSubjectApply(io.grpc.database.GetSubjectApplyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectApplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubjectApplyMethod(), getCallOptions()), request, responseObserver);
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
    public io.grpc.database.GetStudentListResponse getStudentList(io.grpc.database.GetStudentListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetSubjectListResponse getSubjectList(io.grpc.database.GetSubjectListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubjectListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetStudentSubjectListResponse getStudentSubjectList(io.grpc.database.GetStudentSubjectListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentSubjectListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetSubjectStudentListResponse getSubjectStudentList(io.grpc.database.GetSubjectStudentListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubjectStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetCompleteListResponse getCompleteList(io.grpc.database.GetCompleteListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompleteListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.GetSubjectApplyResponse getSubjectApply(io.grpc.database.GetSubjectApplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubjectApplyMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetStudentListResponse> getStudentList(
        io.grpc.database.GetStudentListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetSubjectListResponse> getSubjectList(
        io.grpc.database.GetSubjectListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubjectListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetStudentSubjectListResponse> getStudentSubjectList(
        io.grpc.database.GetStudentSubjectListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentSubjectListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetSubjectStudentListResponse> getSubjectStudentList(
        io.grpc.database.GetSubjectStudentListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubjectStudentListMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.GetSubjectApplyResponse> getSubjectApply(
        io.grpc.database.GetSubjectApplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubjectApplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT_LIST = 0;
  private static final int METHODID_GET_SUBJECT_LIST = 1;
  private static final int METHODID_GET_STUDENT_SUBJECT_LIST = 2;
  private static final int METHODID_GET_SUBJECT_STUDENT_LIST = 3;
  private static final int METHODID_GET_COMPLETE_LIST = 4;
  private static final int METHODID_GET_SUBJECT_APPLY = 5;

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
        case METHODID_GET_STUDENT_LIST:
          serviceImpl.getStudentList((io.grpc.database.GetStudentListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetStudentListResponse>) responseObserver);
          break;
        case METHODID_GET_SUBJECT_LIST:
          serviceImpl.getSubjectList((io.grpc.database.GetSubjectListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectListResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_SUBJECT_LIST:
          serviceImpl.getStudentSubjectList((io.grpc.database.GetStudentSubjectListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetStudentSubjectListResponse>) responseObserver);
          break;
        case METHODID_GET_SUBJECT_STUDENT_LIST:
          serviceImpl.getSubjectStudentList((io.grpc.database.GetSubjectStudentListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectStudentListResponse>) responseObserver);
          break;
        case METHODID_GET_COMPLETE_LIST:
          serviceImpl.getCompleteList((io.grpc.database.GetCompleteListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetCompleteListResponse>) responseObserver);
          break;
        case METHODID_GET_SUBJECT_APPLY:
          serviceImpl.getSubjectApply((io.grpc.database.GetSubjectApplyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.GetSubjectApplyResponse>) responseObserver);
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
          getGetStudentListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetStudentListRequest,
              io.grpc.database.GetStudentListResponse>(
                service, METHODID_GET_STUDENT_LIST)))
        .addMethod(
          getGetSubjectListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetSubjectListRequest,
              io.grpc.database.GetSubjectListResponse>(
                service, METHODID_GET_SUBJECT_LIST)))
        .addMethod(
          getGetStudentSubjectListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetStudentSubjectListRequest,
              io.grpc.database.GetStudentSubjectListResponse>(
                service, METHODID_GET_STUDENT_SUBJECT_LIST)))
        .addMethod(
          getGetSubjectStudentListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetSubjectStudentListRequest,
              io.grpc.database.GetSubjectStudentListResponse>(
                service, METHODID_GET_SUBJECT_STUDENT_LIST)))
        .addMethod(
          getGetCompleteListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetCompleteListRequest,
              io.grpc.database.GetCompleteListResponse>(
                service, METHODID_GET_COMPLETE_LIST)))
        .addMethod(
          getGetSubjectApplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.GetSubjectApplyRequest,
              io.grpc.database.GetSubjectApplyResponse>(
                service, METHODID_GET_SUBJECT_APPLY)))
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
              .addMethod(getGetStudentListMethod())
              .addMethod(getGetSubjectListMethod())
              .addMethod(getGetStudentSubjectListMethod())
              .addMethod(getGetSubjectStudentListMethod())
              .addMethod(getGetCompleteListMethod())
              .addMethod(getGetSubjectApplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
