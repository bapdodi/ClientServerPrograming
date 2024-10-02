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
  private static volatile io.grpc.MethodDescriptor<io.grpc.database.SaveUserRequest,
      io.grpc.database.SaveUserResponse> getSaveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveUser",
      requestType = io.grpc.database.SaveUserRequest.class,
      responseType = io.grpc.database.SaveUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.SaveUserRequest,
      io.grpc.database.SaveUserResponse> getSaveUserMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.SaveUserRequest, io.grpc.database.SaveUserResponse> getSaveUserMethod;
    if ((getSaveUserMethod = DataBaseGrpc.getSaveUserMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getSaveUserMethod = DataBaseGrpc.getSaveUserMethod) == null) {
          DataBaseGrpc.getSaveUserMethod = getSaveUserMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.SaveUserRequest, io.grpc.database.SaveUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.SaveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.SaveUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("SaveUser"))
              .build();
        }
      }
    }
    return getSaveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.LoginUserRequest,
      io.grpc.database.LoginUserResponse> getLoginUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginUser",
      requestType = io.grpc.database.LoginUserRequest.class,
      responseType = io.grpc.database.LoginUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.LoginUserRequest,
      io.grpc.database.LoginUserResponse> getLoginUserMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.LoginUserRequest, io.grpc.database.LoginUserResponse> getLoginUserMethod;
    if ((getLoginUserMethod = DataBaseGrpc.getLoginUserMethod) == null) {
      synchronized (DataBaseGrpc.class) {
        if ((getLoginUserMethod = DataBaseGrpc.getLoginUserMethod) == null) {
          DataBaseGrpc.getLoginUserMethod = getLoginUserMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.LoginUserRequest, io.grpc.database.LoginUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.LoginUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.LoginUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataBaseMethodDescriptorSupplier("LoginUser"))
              .build();
        }
      }
    }
    return getLoginUserMethod;
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
     * <pre>
     * 회원가입
     * </pre>
     */
    default void saveUser(io.grpc.database.SaveUserRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.SaveUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    default void loginUser(io.grpc.database.LoginUserRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.LoginUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginUserMethod(), responseObserver);
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
     * <pre>
     * 회원가입
     * </pre>
     */
    public void saveUser(io.grpc.database.SaveUserRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.SaveUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    public void loginUser(io.grpc.database.LoginUserRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.LoginUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * 회원가입
     * </pre>
     */
    public io.grpc.database.SaveUserResponse saveUser(io.grpc.database.SaveUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    public io.grpc.database.LoginUserResponse loginUser(io.grpc.database.LoginUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginUserMethod(), getCallOptions(), request);
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
     * <pre>
     * 회원가입
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.SaveUserResponse> saveUser(
        io.grpc.database.SaveUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.LoginUserResponse> loginUser(
        io.grpc.database.LoginUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_USER = 0;
  private static final int METHODID_LOGIN_USER = 1;

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
        case METHODID_SAVE_USER:
          serviceImpl.saveUser((io.grpc.database.SaveUserRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.SaveUserResponse>) responseObserver);
          break;
        case METHODID_LOGIN_USER:
          serviceImpl.loginUser((io.grpc.database.LoginUserRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.LoginUserResponse>) responseObserver);
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
          getSaveUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.SaveUserRequest,
              io.grpc.database.SaveUserResponse>(
                service, METHODID_SAVE_USER)))
        .addMethod(
          getLoginUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.database.LoginUserRequest,
              io.grpc.database.LoginUserResponse>(
                service, METHODID_LOGIN_USER)))
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
              .addMethod(getSaveUserMethod())
              .addMethod(getLoginUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
