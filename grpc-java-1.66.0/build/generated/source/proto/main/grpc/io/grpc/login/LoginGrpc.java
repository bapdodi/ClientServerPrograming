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

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ServerDeleteStudentRequest,
      io.grpc.login.ServerDeleteStudentResponse> getServerDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverDeleteStudent",
      requestType = io.grpc.login.ServerDeleteStudentRequest.class,
      responseType = io.grpc.login.ServerDeleteStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ServerDeleteStudentRequest,
      io.grpc.login.ServerDeleteStudentResponse> getServerDeleteStudentMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ServerDeleteStudentRequest, io.grpc.login.ServerDeleteStudentResponse> getServerDeleteStudentMethod;
    if ((getServerDeleteStudentMethod = LoginGrpc.getServerDeleteStudentMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getServerDeleteStudentMethod = LoginGrpc.getServerDeleteStudentMethod) == null) {
          LoginGrpc.getServerDeleteStudentMethod = getServerDeleteStudentMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ServerDeleteStudentRequest, io.grpc.login.ServerDeleteStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverDeleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerDeleteStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerDeleteStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("serverDeleteStudent"))
              .build();
        }
      }
    }
    return getServerDeleteStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ServerEnrollCourseRequest,
      io.grpc.login.ServerEnrollCourseResponse> getServerEnrollCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverEnrollCourse",
      requestType = io.grpc.login.ServerEnrollCourseRequest.class,
      responseType = io.grpc.login.ServerEnrollCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ServerEnrollCourseRequest,
      io.grpc.login.ServerEnrollCourseResponse> getServerEnrollCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ServerEnrollCourseRequest, io.grpc.login.ServerEnrollCourseResponse> getServerEnrollCourseMethod;
    if ((getServerEnrollCourseMethod = LoginGrpc.getServerEnrollCourseMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getServerEnrollCourseMethod = LoginGrpc.getServerEnrollCourseMethod) == null) {
          LoginGrpc.getServerEnrollCourseMethod = getServerEnrollCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ServerEnrollCourseRequest, io.grpc.login.ServerEnrollCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverEnrollCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerEnrollCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerEnrollCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("serverEnrollCourse"))
              .build();
        }
      }
    }
    return getServerEnrollCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ServerDropCourseRequest,
      io.grpc.login.ServerDropCourseResponse> getServerDropCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverDropCourse",
      requestType = io.grpc.login.ServerDropCourseRequest.class,
      responseType = io.grpc.login.ServerDropCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ServerDropCourseRequest,
      io.grpc.login.ServerDropCourseResponse> getServerDropCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ServerDropCourseRequest, io.grpc.login.ServerDropCourseResponse> getServerDropCourseMethod;
    if ((getServerDropCourseMethod = LoginGrpc.getServerDropCourseMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getServerDropCourseMethod = LoginGrpc.getServerDropCourseMethod) == null) {
          LoginGrpc.getServerDropCourseMethod = getServerDropCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ServerDropCourseRequest, io.grpc.login.ServerDropCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverDropCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerDropCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerDropCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("serverDropCourse"))
              .build();
        }
      }
    }
    return getServerDropCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ServerAddCourseRequest,
      io.grpc.login.ServerAddCourseResponse> getServerAddCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverAddCourse",
      requestType = io.grpc.login.ServerAddCourseRequest.class,
      responseType = io.grpc.login.ServerAddCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ServerAddCourseRequest,
      io.grpc.login.ServerAddCourseResponse> getServerAddCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ServerAddCourseRequest, io.grpc.login.ServerAddCourseResponse> getServerAddCourseMethod;
    if ((getServerAddCourseMethod = LoginGrpc.getServerAddCourseMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getServerAddCourseMethod = LoginGrpc.getServerAddCourseMethod) == null) {
          LoginGrpc.getServerAddCourseMethod = getServerAddCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ServerAddCourseRequest, io.grpc.login.ServerAddCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverAddCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerAddCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerAddCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("serverAddCourse"))
              .build();
        }
      }
    }
    return getServerAddCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.login.ServerDeleteCourseRequest,
      io.grpc.login.ServerDeleteCourseResponse> getServerDeleteCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverDeleteCourse",
      requestType = io.grpc.login.ServerDeleteCourseRequest.class,
      responseType = io.grpc.login.ServerDeleteCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.login.ServerDeleteCourseRequest,
      io.grpc.login.ServerDeleteCourseResponse> getServerDeleteCourseMethod() {
    io.grpc.MethodDescriptor<io.grpc.login.ServerDeleteCourseRequest, io.grpc.login.ServerDeleteCourseResponse> getServerDeleteCourseMethod;
    if ((getServerDeleteCourseMethod = LoginGrpc.getServerDeleteCourseMethod) == null) {
      synchronized (LoginGrpc.class) {
        if ((getServerDeleteCourseMethod = LoginGrpc.getServerDeleteCourseMethod) == null) {
          LoginGrpc.getServerDeleteCourseMethod = getServerDeleteCourseMethod =
              io.grpc.MethodDescriptor.<io.grpc.login.ServerDeleteCourseRequest, io.grpc.login.ServerDeleteCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverDeleteCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerDeleteCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.login.ServerDeleteCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginMethodDescriptorSupplier("serverDeleteCourse"))
              .build();
        }
      }
    }
    return getServerDeleteCourseMethod;
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
    default void serverDeleteStudent(io.grpc.login.ServerDeleteStudentRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerDeleteStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerDeleteStudentMethod(), responseObserver);
    }

    /**
     */
    default void serverEnrollCourse(io.grpc.login.ServerEnrollCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerEnrollCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerEnrollCourseMethod(), responseObserver);
    }

    /**
     */
    default void serverDropCourse(io.grpc.login.ServerDropCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerDropCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerDropCourseMethod(), responseObserver);
    }

    /**
     */
    default void serverAddCourse(io.grpc.login.ServerAddCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerAddCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerAddCourseMethod(), responseObserver);
    }

    /**
     */
    default void serverDeleteCourse(io.grpc.login.ServerDeleteCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerDeleteCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerDeleteCourseMethod(), responseObserver);
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
    public void serverDeleteStudent(io.grpc.login.ServerDeleteStudentRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerDeleteStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverEnrollCourse(io.grpc.login.ServerEnrollCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerEnrollCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerEnrollCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverDropCourse(io.grpc.login.ServerDropCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerDropCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerDropCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverAddCourse(io.grpc.login.ServerAddCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerAddCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerAddCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverDeleteCourse(io.grpc.login.ServerDeleteCourseRequest request,
        io.grpc.stub.StreamObserver<io.grpc.login.ServerDeleteCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerDeleteCourseMethod(), getCallOptions()), request, responseObserver);
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
    public io.grpc.login.ServerDeleteStudentResponse serverDeleteStudent(io.grpc.login.ServerDeleteStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerDeleteStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ServerEnrollCourseResponse serverEnrollCourse(io.grpc.login.ServerEnrollCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerEnrollCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ServerDropCourseResponse serverDropCourse(io.grpc.login.ServerDropCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerDropCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ServerAddCourseResponse serverAddCourse(io.grpc.login.ServerAddCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerAddCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.login.ServerDeleteCourseResponse serverDeleteCourse(io.grpc.login.ServerDeleteCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerDeleteCourseMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ServerDeleteStudentResponse> serverDeleteStudent(
        io.grpc.login.ServerDeleteStudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerDeleteStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ServerEnrollCourseResponse> serverEnrollCourse(
        io.grpc.login.ServerEnrollCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerEnrollCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ServerDropCourseResponse> serverDropCourse(
        io.grpc.login.ServerDropCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerDropCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ServerAddCourseResponse> serverAddCourse(
        io.grpc.login.ServerAddCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerAddCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.login.ServerDeleteCourseResponse> serverDeleteCourse(
        io.grpc.login.ServerDeleteCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerDeleteCourseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_JOIN = 1;
  private static final int METHODID_SHOW_STUDENT_LIST = 2;
  private static final int METHODID_SHOW_COURSE_LIST = 3;
  private static final int METHODID_SERVER_DELETE_STUDENT = 4;
  private static final int METHODID_SERVER_ENROLL_COURSE = 5;
  private static final int METHODID_SERVER_DROP_COURSE = 6;
  private static final int METHODID_SERVER_ADD_COURSE = 7;
  private static final int METHODID_SERVER_DELETE_COURSE = 8;

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
        case METHODID_SERVER_DELETE_STUDENT:
          serviceImpl.serverDeleteStudent((io.grpc.login.ServerDeleteStudentRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ServerDeleteStudentResponse>) responseObserver);
          break;
        case METHODID_SERVER_ENROLL_COURSE:
          serviceImpl.serverEnrollCourse((io.grpc.login.ServerEnrollCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ServerEnrollCourseResponse>) responseObserver);
          break;
        case METHODID_SERVER_DROP_COURSE:
          serviceImpl.serverDropCourse((io.grpc.login.ServerDropCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ServerDropCourseResponse>) responseObserver);
          break;
        case METHODID_SERVER_ADD_COURSE:
          serviceImpl.serverAddCourse((io.grpc.login.ServerAddCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ServerAddCourseResponse>) responseObserver);
          break;
        case METHODID_SERVER_DELETE_COURSE:
          serviceImpl.serverDeleteCourse((io.grpc.login.ServerDeleteCourseRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.login.ServerDeleteCourseResponse>) responseObserver);
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
          getServerDeleteStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ServerDeleteStudentRequest,
              io.grpc.login.ServerDeleteStudentResponse>(
                service, METHODID_SERVER_DELETE_STUDENT)))
        .addMethod(
          getServerEnrollCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ServerEnrollCourseRequest,
              io.grpc.login.ServerEnrollCourseResponse>(
                service, METHODID_SERVER_ENROLL_COURSE)))
        .addMethod(
          getServerDropCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ServerDropCourseRequest,
              io.grpc.login.ServerDropCourseResponse>(
                service, METHODID_SERVER_DROP_COURSE)))
        .addMethod(
          getServerAddCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ServerAddCourseRequest,
              io.grpc.login.ServerAddCourseResponse>(
                service, METHODID_SERVER_ADD_COURSE)))
        .addMethod(
          getServerDeleteCourseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.login.ServerDeleteCourseRequest,
              io.grpc.login.ServerDeleteCourseResponse>(
                service, METHODID_SERVER_DELETE_COURSE)))
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
              .addMethod(getServerDeleteStudentMethod())
              .addMethod(getServerEnrollCourseMethod())
              .addMethod(getServerDropCourseMethod())
              .addMethod(getServerAddCourseMethod())
              .addMethod(getServerDeleteCourseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
