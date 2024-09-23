package io.grpc.examples.login;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: login.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoginGrpc {

  private LoginGrpc() {}

  public static final java.lang.String SERVICE_NAME = "login.Login";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.login.LoginRequest,
      io.grpc.examples.login.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = io.grpc.examples.login.LoginRequest.class,
      responseType = io.grpc.examples.login.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.login.LoginRequest,
      io.grpc.examples.login.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.login.LoginRequest, io.grpc.examples.login.LoginResponse> getLoginMethod;
    if ((getLoginMethod = LoginGrpc.getLoginMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getLoginMethod = LoginGrpc.getLoginMethod) == null) {
          LoginGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.login.LoginRequest, io.grpc.examples.login.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.login.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.login.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.login.JoinRequest,
      io.grpc.examples.login.JoinResponse> getJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "join",
      requestType = io.grpc.examples.login.JoinRequest.class,
      responseType = io.grpc.examples.login.JoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.login.JoinRequest,
      io.grpc.examples.login.JoinResponse> getJoinMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.login.JoinRequest, io.grpc.examples.login.JoinResponse> getJoinMethod;
    if ((getJoinMethod = LoginGrpc.getJoinMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getJoinMethod = LoginGrpc.getJoinMethod) == null) {
          LoginGrpc.getJoinMethod = getJoinMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.login.JoinRequest, io.grpc.examples.login.JoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "join"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.login.JoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.login.JoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("join"))
              .build();
        }
      }
    }
    return getJoinMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginStub>() {
        @java.lang.Override
        public LoginStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginStub(channel, callOptions);
        }
      };
    return LoginStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginBlockingStub>() {
        @java.lang.Override
        public LoginBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginBlockingStub(channel, callOptions);
        }
      };
    return LoginBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginFutureStub>() {
        @java.lang.Override
        public LoginFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginFutureStub(channel, callOptions);
        }
      };
    return LoginFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void login(io.grpc.examples.login.LoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.login.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void join(io.grpc.examples.login.JoinRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.login.JoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Login.
   */
  public static abstract class LoginImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LoginGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Login.
   */
  public static final class LoginStub
      extends io.grpc.stub.AbstractAsyncStub<LoginStub> {
    private LoginStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginStub(channel, callOptions);
    }

    /**
     */
    public void login(io.grpc.examples.login.LoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.login.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void join(io.grpc.examples.login.JoinRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.login.JoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Login.
   */
  public static final class LoginBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LoginBlockingStub> {
    private LoginBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.login.LoginResponse login(io.grpc.examples.login.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.login.JoinResponse join(io.grpc.examples.login.JoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Login.
   */
  public static final class LoginFutureStub
      extends io.grpc.stub.AbstractFutureStub<LoginFutureStub> {
    private LoginFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.login.LoginResponse> login(
        io.grpc.examples.login.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.login.JoinResponse> join(
        io.grpc.examples.login.JoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_JOIN = 1;

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
        case METHODID_LOGIN:
          serviceImpl.login((io.grpc.examples.login.LoginRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.login.LoginResponse>) responseObserver);
          break;
        case METHODID_JOIN:
          serviceImpl.join((io.grpc.examples.login.JoinRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.login.JoinResponse>) responseObserver);
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
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.login.LoginRequest,
              io.grpc.examples.login.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getJoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.login.JoinRequest,
              io.grpc.examples.login.JoinResponse>(
                service, METHODID_JOIN)))
        .build();
  }

  private static abstract class LoginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.login.LoginProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Login");
    }
  }

  private static final class LoginFileDescriptorSupplier
      extends LoginBaseDescriptorSupplier {
    LoginFileDescriptorSupplier() {}
  }

  private static final class LoginMethodDescriptorSupplier
      extends LoginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LoginMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LoginGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getJoinMethod())
              .build();
        }
      }
    }
    return result;
  }
}
