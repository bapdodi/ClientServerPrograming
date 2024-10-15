package io.grpc.login;

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
  private static volatile io.grpc.MethodDescriptor<io.grpc.login.LoginRequest,
      io.grpc.login.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = io.grpc.login.LoginRequest.class,
      responseType = io.grpc.login.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.LoginRequest,
      io.grpc.login.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.LoginRequest, io.grpc.login.LoginResponse> getLoginMethod;
    if ((getLoginMethod = LoginGrpc.getLoginMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getLoginMethod = LoginGrpc.getLoginMethod) == null) {
          LoginGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.LoginRequest, io.grpc.login.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.JoinRequest,
      io.grpc.login.JoinResponse> getJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "join",
      requestType = io.grpc.login.JoinRequest.class,
      responseType = io.grpc.login.JoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.JoinRequest,
      io.grpc.login.JoinResponse> getJoinMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.JoinRequest, io.grpc.login.JoinResponse> getJoinMethod;
    if ((getJoinMethod = LoginGrpc.getJoinMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getJoinMethod = LoginGrpc.getJoinMethod) == null) {
          LoginGrpc.getJoinMethod = getJoinMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.JoinRequest, io.grpc.login.JoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "join"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.JoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.JoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("join"))
              .build();
        }
      }
    }
    return getJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ShowStudentListRequest,
      io.grpc.login.ShowStudentListResponse> getShowStudentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStudentList",
      requestType = io.grpc.login.ShowStudentListRequest.class,
      responseType = io.grpc.login.ShowStudentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ShowStudentListRequest,
      io.grpc.login.ShowStudentListResponse> getShowStudentListMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ShowStudentListRequest, io.grpc.login.ShowStudentListResponse> getShowStudentListMethod;
    if ((getShowStudentListMethod = LoginGrpc.getShowStudentListMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getShowStudentListMethod = LoginGrpc.getShowStudentListMethod) == null) {
          LoginGrpc.getShowStudentListMethod = getShowStudentListMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ShowStudentListRequest, io.grpc.login.ShowStudentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showStudentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowStudentListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowStudentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("showStudentList"))
              .build();
        }
      }
    }
    return getShowStudentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ShowCourseListRequest,
      io.grpc.login.ShowCourseListResponse> getShowCourseListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showCourseList",
      requestType = io.grpc.login.ShowCourseListRequest.class,
      responseType = io.grpc.login.ShowCourseListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ShowCourseListRequest,
      io.grpc.login.ShowCourseListResponse> getShowCourseListMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ShowCourseListRequest, io.grpc.login.ShowCourseListResponse> getShowCourseListMethod;
    if ((getShowCourseListMethod = LoginGrpc.getShowCourseListMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getShowCourseListMethod = LoginGrpc.getShowCourseListMethod) == null) {
          LoginGrpc.getShowCourseListMethod = getShowCourseListMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ShowCourseListRequest, io.grpc.login.ShowCourseListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showCourseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCourseListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCourseListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("showCourseList"))
              .build();
        }
      }
    }
    return getShowCourseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ShowStudentCourseListRequest,
      io.grpc.login.ShowStudentCourseListResponse> getShowStudentCourseListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStudentCourseList",
      requestType = io.grpc.login.ShowStudentCourseListRequest.class,
      responseType = io.grpc.login.ShowStudentCourseListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ShowStudentCourseListRequest,
      io.grpc.login.ShowStudentCourseListResponse> getShowStudentCourseListMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ShowStudentCourseListRequest, io.grpc.login.ShowStudentCourseListResponse> getShowStudentCourseListMethod;
    if ((getShowStudentCourseListMethod = LoginGrpc.getShowStudentCourseListMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getShowStudentCourseListMethod = LoginGrpc.getShowStudentCourseListMethod) == null) {
          LoginGrpc.getShowStudentCourseListMethod = getShowStudentCourseListMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ShowStudentCourseListRequest, io.grpc.login.ShowStudentCourseListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showStudentCourseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowStudentCourseListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowStudentCourseListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("showStudentCourseList"))
              .build();
        }
      }
    }
    return getShowStudentCourseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ShowCourseStudentListRequest,
      io.grpc.login.ShowCourseStudentListResponse> getShowCourseStudentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showCourseStudentList",
      requestType = io.grpc.login.ShowCourseStudentListRequest.class,
      responseType = io.grpc.login.ShowCourseStudentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ShowCourseStudentListRequest,
      io.grpc.login.ShowCourseStudentListResponse> getShowCourseStudentListMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ShowCourseStudentListRequest, io.grpc.login.ShowCourseStudentListResponse> getShowCourseStudentListMethod;
    if ((getShowCourseStudentListMethod = LoginGrpc.getShowCourseStudentListMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getShowCourseStudentListMethod = LoginGrpc.getShowCourseStudentListMethod) == null) {
          LoginGrpc.getShowCourseStudentListMethod = getShowCourseStudentListMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ShowCourseStudentListRequest, io.grpc.login.ShowCourseStudentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showCourseStudentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCourseStudentListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCourseStudentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("showCourseStudentList"))
              .build();
        }
      }
    }
    return getShowCourseStudentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ShowCompleteListRequest,
      io.grpc.login.ShowCompleteListResponse> getShowCompleteListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showCompleteList",
      requestType = io.grpc.login.ShowCompleteListRequest.class,
      responseType = io.grpc.login.ShowCompleteListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ShowCompleteListRequest,
      io.grpc.login.ShowCompleteListResponse> getShowCompleteListMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ShowCompleteListRequest, io.grpc.login.ShowCompleteListResponse> getShowCompleteListMethod;
    if ((getShowCompleteListMethod = LoginGrpc.getShowCompleteListMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getShowCompleteListMethod = LoginGrpc.getShowCompleteListMethod) == null) {
          LoginGrpc.getShowCompleteListMethod = getShowCompleteListMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ShowCompleteListRequest, io.grpc.login.ShowCompleteListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showCompleteList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCompleteListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCompleteListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("showCompleteList"))
              .build();
        }
      }
    }
    return getShowCompleteListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ShowCourseApplyRequest,
      io.grpc.login.ShowCourseApplyResponse> getShowCourseApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showCourseApply",
      requestType = io.grpc.login.ShowCourseApplyRequest.class,
      responseType = io.grpc.login.ShowCourseApplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ShowCourseApplyRequest,
      io.grpc.login.ShowCourseApplyResponse> getShowCourseApplyMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ShowCourseApplyRequest, io.grpc.login.ShowCourseApplyResponse> getShowCourseApplyMethod;
    if ((getShowCourseApplyMethod = LoginGrpc.getShowCourseApplyMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getShowCourseApplyMethod = LoginGrpc.getShowCourseApplyMethod) == null) {
          LoginGrpc.getShowCourseApplyMethod = getShowCourseApplyMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ShowCourseApplyRequest, io.grpc.login.ShowCourseApplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showCourseApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCourseApplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ShowCourseApplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("showCourseApply"))
              .build();
        }
      }
    }
    return getShowCourseApplyMethod;
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
    default void login(io.grpc.login.LoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void join(io.grpc.login.JoinRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.JoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinMethod(), responseObserver);
    }

    /**
     */
    default void showStudentList(io.grpc.login.ShowStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowStudentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowStudentListMethod(), responseObserver);
    }

    /**
     */
    default void showCourseList(io.grpc.login.ShowCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowCourseListMethod(), responseObserver);
    }

    /**
     */
    default void showStudentCourseList(io.grpc.login.ShowStudentCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowStudentCourseListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowStudentCourseListMethod(), responseObserver);
    }

    /**
     */
    default void showCourseStudentList(io.grpc.login.ShowCourseStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseStudentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowCourseStudentListMethod(), responseObserver);
    }

    /**
     */
    default void showCompleteList(io.grpc.login.ShowCompleteListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCompleteListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowCompleteListMethod(), responseObserver);
    }

    /**
     */
    default void showCourseApply(io.grpc.login.ShowCourseApplyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseApplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowCourseApplyMethod(), responseObserver);
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
    public void login(io.grpc.login.LoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void join(io.grpc.login.JoinRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.JoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showStudentList(io.grpc.login.ShowStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowStudentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowStudentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showCourseList(io.grpc.login.ShowCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowCourseListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showStudentCourseList(io.grpc.login.ShowStudentCourseListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowStudentCourseListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowStudentCourseListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showCourseStudentList(io.grpc.login.ShowCourseStudentListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseStudentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowCourseStudentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showCompleteList(io.grpc.login.ShowCompleteListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCompleteListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowCompleteListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showCourseApply(io.grpc.login.ShowCourseApplyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseApplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowCourseApplyMethod(), getCallOptions()), request, responseObserver);
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
    public io.grpc.login.LoginResponse login(io.grpc.login.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.JoinResponse join(io.grpc.login.JoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ShowStudentListResponse showStudentList(io.grpc.login.ShowStudentListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ShowCourseListResponse showCourseList(io.grpc.login.ShowCourseListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowCourseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ShowStudentCourseListResponse showStudentCourseList(io.grpc.login.ShowStudentCourseListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowStudentCourseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ShowCourseStudentListResponse showCourseStudentList(io.grpc.login.ShowCourseStudentListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowCourseStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ShowCompleteListResponse showCompleteList(io.grpc.login.ShowCompleteListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowCompleteListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ShowCourseApplyResponse showCourseApply(io.grpc.login.ShowCourseApplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowCourseApplyMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.LoginResponse> login(
        io.grpc.login.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.JoinResponse> join(
        io.grpc.login.JoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ShowStudentListResponse> showStudentList(
        io.grpc.login.ShowStudentListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowStudentListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ShowCourseListResponse> showCourseList(
        io.grpc.login.ShowCourseListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowCourseListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ShowStudentCourseListResponse> showStudentCourseList(
        io.grpc.login.ShowStudentCourseListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowStudentCourseListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ShowCourseStudentListResponse> showCourseStudentList(
        io.grpc.login.ShowCourseStudentListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowCourseStudentListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ShowCompleteListResponse> showCompleteList(
        io.grpc.login.ShowCompleteListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowCompleteListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ShowCourseApplyResponse> showCourseApply(
        io.grpc.login.ShowCourseApplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowCourseApplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_JOIN = 1;
  private static final int METHODID_SHOW_STUDENT_LIST = 2;
  private static final int METHODID_SHOW_COURSE_LIST = 3;
  private static final int METHODID_SHOW_STUDENT_COURSE_LIST = 4;
  private static final int METHODID_SHOW_COURSE_STUDENT_LIST = 5;
  private static final int METHODID_SHOW_COMPLETE_LIST = 6;
  private static final int METHODID_SHOW_COURSE_APPLY = 7;

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
          serviceImpl.login((io.grpc.login.LoginRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.LoginResponse>) responseObserver);
          break;
        case METHODID_JOIN:
          serviceImpl.join((io.grpc.login.JoinRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.JoinResponse>) responseObserver);
          break;
        case METHODID_SHOW_STUDENT_LIST:
          serviceImpl.showStudentList((io.grpc.login.ShowStudentListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ShowStudentListResponse>) responseObserver);
          break;
        case METHODID_SHOW_COURSE_LIST:
          serviceImpl.showCourseList((io.grpc.login.ShowCourseListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseListResponse>) responseObserver);
          break;
        case METHODID_SHOW_STUDENT_COURSE_LIST:
          serviceImpl.showStudentCourseList((io.grpc.login.ShowStudentCourseListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ShowStudentCourseListResponse>) responseObserver);
          break;
        case METHODID_SHOW_COURSE_STUDENT_LIST:
          serviceImpl.showCourseStudentList((io.grpc.login.ShowCourseStudentListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseStudentListResponse>) responseObserver);
          break;
        case METHODID_SHOW_COMPLETE_LIST:
          serviceImpl.showCompleteList((io.grpc.login.ShowCompleteListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ShowCompleteListResponse>) responseObserver);
          break;
        case METHODID_SHOW_COURSE_APPLY:
          serviceImpl.showCourseApply((io.grpc.login.ShowCourseApplyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ShowCourseApplyResponse>) responseObserver);
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
              io.grpc.login.LoginRequest,
              io.grpc.login.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getJoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.JoinRequest,
              io.grpc.login.JoinResponse>(
                service, METHODID_JOIN)))
        .addMethod(
          getShowStudentListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ShowStudentListRequest,
              io.grpc.login.ShowStudentListResponse>(
                service, METHODID_SHOW_STUDENT_LIST)))
        .addMethod(
          getShowCourseListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ShowCourseListRequest,
              io.grpc.login.ShowCourseListResponse>(
                service, METHODID_SHOW_COURSE_LIST)))
        .addMethod(
          getShowStudentCourseListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ShowStudentCourseListRequest,
              io.grpc.login.ShowStudentCourseListResponse>(
                service, METHODID_SHOW_STUDENT_COURSE_LIST)))
        .addMethod(
          getShowCourseStudentListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ShowCourseStudentListRequest,
              io.grpc.login.ShowCourseStudentListResponse>(
                service, METHODID_SHOW_COURSE_STUDENT_LIST)))
        .addMethod(
          getShowCompleteListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ShowCompleteListRequest,
              io.grpc.login.ShowCompleteListResponse>(
                service, METHODID_SHOW_COMPLETE_LIST)))
        .addMethod(
          getShowCourseApplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ShowCourseApplyRequest,
              io.grpc.login.ShowCourseApplyResponse>(
                service, METHODID_SHOW_COURSE_APPLY)))
        .build();
  }

  private static abstract class LoginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.login.LoginProto.getDescriptor();
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
              .addMethod(getShowStudentListMethod())
              .addMethod(getShowCourseListMethod())
              .addMethod(getShowStudentCourseListMethod())
              .addMethod(getShowCourseStudentListMethod())
              .addMethod(getShowCompleteListMethod())
              .addMethod(getShowCourseApplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
