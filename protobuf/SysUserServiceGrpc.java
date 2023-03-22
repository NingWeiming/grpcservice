//package cn.zjhn.grpcservice.protobuf;
//
//import static io.grpc.MethodDescriptor.generateFullMethodName;
//
///**
// */
//@javax.annotation.Generated(
//    value = "by gRPC proto compiler (version 1.51.0)",
//    comments = "Source: sysuserservice.proto")
//@io.grpc.stub.annotations.GrpcGenerated
//public final class SysUserServiceGrpc {
//
//  private SysUserServiceGrpc() {}
//
//  public static final String SERVICE_NAME = "SysUserService";
//
//  // Static method descriptors that strictly reflect the proto.
//  private static volatile io.grpc.MethodDescriptor<UserServiceProto.AddRequest,
//      UserServiceProto.AddResponse> getAddUserMethod;
//
//  @io.grpc.stub.annotations.RpcMethod(
//      fullMethodName = SERVICE_NAME + '/' + "addUser",
//      requestType = UserServiceProto.AddRequest.class,
//      responseType = UserServiceProto.AddResponse.class,
//      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
//  public static io.grpc.MethodDescriptor<UserServiceProto.AddRequest,
//      UserServiceProto.AddResponse> getAddUserMethod() {
//    io.grpc.MethodDescriptor<UserServiceProto.AddRequest, UserServiceProto.AddResponse> getAddUserMethod;
//    if ((getAddUserMethod = SysUserServiceGrpc.getAddUserMethod) == null) {
//      synchronized (SysUserServiceGrpc.class) {
//        if ((getAddUserMethod = SysUserServiceGrpc.getAddUserMethod) == null) {
//          SysUserServiceGrpc.getAddUserMethod = getAddUserMethod =
//              io.grpc.MethodDescriptor.<UserServiceProto.AddRequest, UserServiceProto.AddResponse>newBuilder()
//              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
//              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addUser"))
//              .setSampledToLocalTracing(true)
//              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.AddRequest.getDefaultInstance()))
//              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.AddResponse.getDefaultInstance()))
//              .setSchemaDescriptor(new SysUserServiceMethodDescriptorSupplier("addUser"))
//              .build();
//        }
//      }
//    }
//    return getAddUserMethod;
//  }
//
//  private static volatile io.grpc.MethodDescriptor<UserServiceProto.DeleteRequest,
//      UserServiceProto.DeleteResponse> getDeleteUserMethod;
//
//  @io.grpc.stub.annotations.RpcMethod(
//      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
//      requestType = UserServiceProto.DeleteRequest.class,
//      responseType = UserServiceProto.DeleteResponse.class,
//      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
//  public static io.grpc.MethodDescriptor<UserServiceProto.DeleteRequest,
//      UserServiceProto.DeleteResponse> getDeleteUserMethod() {
//    io.grpc.MethodDescriptor<UserServiceProto.DeleteRequest, UserServiceProto.DeleteResponse> getDeleteUserMethod;
//    if ((getDeleteUserMethod = SysUserServiceGrpc.getDeleteUserMethod) == null) {
//      synchronized (SysUserServiceGrpc.class) {
//        if ((getDeleteUserMethod = SysUserServiceGrpc.getDeleteUserMethod) == null) {
//          SysUserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
//              io.grpc.MethodDescriptor.<UserServiceProto.DeleteRequest, UserServiceProto.DeleteResponse>newBuilder()
//              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
//              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
//              .setSampledToLocalTracing(true)
//              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.DeleteRequest.getDefaultInstance()))
//              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.DeleteResponse.getDefaultInstance()))
//              .setSchemaDescriptor(new SysUserServiceMethodDescriptorSupplier("deleteUser"))
//              .build();
//        }
//      }
//    }
//    return getDeleteUserMethod;
//  }
//
//  private static volatile io.grpc.MethodDescriptor<UserServiceProto.UpdateRequest,
//      UserServiceProto.UpdateResponse> getUpdateUserMethod;
//
//  @io.grpc.stub.annotations.RpcMethod(
//      fullMethodName = SERVICE_NAME + '/' + "updateUser",
//      requestType = UserServiceProto.UpdateRequest.class,
//      responseType = UserServiceProto.UpdateResponse.class,
//      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
//  public static io.grpc.MethodDescriptor<UserServiceProto.UpdateRequest,
//      UserServiceProto.UpdateResponse> getUpdateUserMethod() {
//    io.grpc.MethodDescriptor<UserServiceProto.UpdateRequest, UserServiceProto.UpdateResponse> getUpdateUserMethod;
//    if ((getUpdateUserMethod = SysUserServiceGrpc.getUpdateUserMethod) == null) {
//      synchronized (SysUserServiceGrpc.class) {
//        if ((getUpdateUserMethod = SysUserServiceGrpc.getUpdateUserMethod) == null) {
//          SysUserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
//              io.grpc.MethodDescriptor.<UserServiceProto.UpdateRequest, UserServiceProto.UpdateResponse>newBuilder()
//              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
//              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
//              .setSampledToLocalTracing(true)
//              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.UpdateRequest.getDefaultInstance()))
//              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.UpdateResponse.getDefaultInstance()))
//              .setSchemaDescriptor(new SysUserServiceMethodDescriptorSupplier("updateUser"))
//              .build();
//        }
//      }
//    }
//    return getUpdateUserMethod;
//  }
//
//  private static volatile io.grpc.MethodDescriptor<UserServiceProto.SelectUserListRequest,
//      UserServiceProto.SelectUserListResponse> getSelectUserListMethod;
//
//  @io.grpc.stub.annotations.RpcMethod(
//      fullMethodName = SERVICE_NAME + '/' + "selectUserList",
//      requestType = UserServiceProto.SelectUserListRequest.class,
//      responseType = UserServiceProto.SelectUserListResponse.class,
//      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
//  public static io.grpc.MethodDescriptor<UserServiceProto.SelectUserListRequest,
//      UserServiceProto.SelectUserListResponse> getSelectUserListMethod() {
//    io.grpc.MethodDescriptor<UserServiceProto.SelectUserListRequest, UserServiceProto.SelectUserListResponse> getSelectUserListMethod;
//    if ((getSelectUserListMethod = SysUserServiceGrpc.getSelectUserListMethod) == null) {
//      synchronized (SysUserServiceGrpc.class) {
//        if ((getSelectUserListMethod = SysUserServiceGrpc.getSelectUserListMethod) == null) {
//          SysUserServiceGrpc.getSelectUserListMethod = getSelectUserListMethod =
//              io.grpc.MethodDescriptor.<UserServiceProto.SelectUserListRequest, UserServiceProto.SelectUserListResponse>newBuilder()
//              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
//              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "selectUserList"))
//              .setSampledToLocalTracing(true)
//              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.SelectUserListRequest.getDefaultInstance()))
//              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
//                  UserServiceProto.SelectUserListResponse.getDefaultInstance()))
//              .setSchemaDescriptor(new SysUserServiceMethodDescriptorSupplier("selectUserList"))
//              .build();
//        }
//      }
//    }
//    return getSelectUserListMethod;
//  }
//
//  /**
//   * Creates a new async stub that supports all call types for the service
//   */
//  public static SysUserServiceStub newStub(io.grpc.Channel channel) {
//    io.grpc.stub.AbstractStub.StubFactory<SysUserServiceStub> factory =
//      new io.grpc.stub.AbstractStub.StubFactory<SysUserServiceStub>() {
//        @java.lang.Override
//        public SysUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//          return new SysUserServiceStub(channel, callOptions);
//        }
//      };
//    return SysUserServiceStub.newStub(factory, channel);
//  }
//
//  /**
//   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
//   */
//  public static SysUserServiceBlockingStub newBlockingStub(
//      io.grpc.Channel channel) {
//    io.grpc.stub.AbstractStub.StubFactory<SysUserServiceBlockingStub> factory =
//      new io.grpc.stub.AbstractStub.StubFactory<SysUserServiceBlockingStub>() {
//        @java.lang.Override
//        public SysUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//          return new SysUserServiceBlockingStub(channel, callOptions);
//        }
//      };
//    return SysUserServiceBlockingStub.newStub(factory, channel);
//  }
//
//  /**
//   * Creates a new ListenableFuture-style stub that supports unary calls on the service
//   */
//  public static SysUserServiceFutureStub newFutureStub(
//      io.grpc.Channel channel) {
//    io.grpc.stub.AbstractStub.StubFactory<SysUserServiceFutureStub> factory =
//      new io.grpc.stub.AbstractStub.StubFactory<SysUserServiceFutureStub>() {
//        @java.lang.Override
//        public SysUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//          return new SysUserServiceFutureStub(channel, callOptions);
//        }
//      };
//    return SysUserServiceFutureStub.newStub(factory, channel);
//  }
//
//  /**
//   */
//  public static abstract class SysUserServiceImplBase implements io.grpc.BindableService {
//
//    /**
//     */
//    public void addUser(UserServiceProto.AddRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.AddResponse> responseObserver) {
//      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
//    }
//
//    /**
//     */
//    public void deleteUser(UserServiceProto.DeleteRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.DeleteResponse> responseObserver) {
//      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
//    }
//
//    /**
//     */
//    public void updateUser(UserServiceProto.UpdateRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.UpdateResponse> responseObserver) {
//      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
//    }
//
//    /**
//     */
//    public void selectUserList(UserServiceProto.SelectUserListRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.SelectUserListResponse> responseObserver) {
//      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectUserListMethod(), responseObserver);
//    }
//
//    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
//      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
//          .addMethod(
//            getAddUserMethod(),
//            io.grpc.stub.ServerCalls.asyncUnaryCall(
//              new MethodHandlers<
//                UserServiceProto.AddRequest,
//                UserServiceProto.AddResponse>(
//                  this, METHODID_ADD_USER)))
//          .addMethod(
//            getDeleteUserMethod(),
//            io.grpc.stub.ServerCalls.asyncUnaryCall(
//              new MethodHandlers<
//                UserServiceProto.DeleteRequest,
//                UserServiceProto.DeleteResponse>(
//                  this, METHODID_DELETE_USER)))
//          .addMethod(
//            getUpdateUserMethod(),
//            io.grpc.stub.ServerCalls.asyncUnaryCall(
//              new MethodHandlers<
//                UserServiceProto.UpdateRequest,
//                UserServiceProto.UpdateResponse>(
//                  this, METHODID_UPDATE_USER)))
//          .addMethod(
//            getSelectUserListMethod(),
//            io.grpc.stub.ServerCalls.asyncUnaryCall(
//              new MethodHandlers<
//                UserServiceProto.SelectUserListRequest,
//                UserServiceProto.SelectUserListResponse>(
//                  this, METHODID_SELECT_USER_LIST)))
//          .build();
//    }
//  }
//
//  /**
//   */
//  public static final class SysUserServiceStub extends io.grpc.stub.AbstractAsyncStub<SysUserServiceStub> {
//    private SysUserServiceStub(
//        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//      super(channel, callOptions);
//    }
//
//    @java.lang.Override
//    protected SysUserServiceStub build(
//        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//      return new SysUserServiceStub(channel, callOptions);
//    }
//
//    /**
//     */
//    public void addUser(UserServiceProto.AddRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.AddResponse> responseObserver) {
//      io.grpc.stub.ClientCalls.asyncUnaryCall(
//          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
//    }
//
//    /**
//     */
//    public void deleteUser(UserServiceProto.DeleteRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.DeleteResponse> responseObserver) {
//      io.grpc.stub.ClientCalls.asyncUnaryCall(
//          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
//    }
//
//    /**
//     */
//    public void updateUser(UserServiceProto.UpdateRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.UpdateResponse> responseObserver) {
//      io.grpc.stub.ClientCalls.asyncUnaryCall(
//          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
//    }
//
//    /**
//     */
//    public void selectUserList(UserServiceProto.SelectUserListRequest request,
//        io.grpc.stub.StreamObserver<UserServiceProto.SelectUserListResponse> responseObserver) {
//      io.grpc.stub.ClientCalls.asyncUnaryCall(
//          getChannel().newCall(getSelectUserListMethod(), getCallOptions()), request, responseObserver);
//    }
//  }
//
//  /**
//   */
//  public static final class SysUserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SysUserServiceBlockingStub> {
//    private SysUserServiceBlockingStub(
//        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//      super(channel, callOptions);
//    }
//
//    @java.lang.Override
//    protected SysUserServiceBlockingStub build(
//        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//      return new SysUserServiceBlockingStub(channel, callOptions);
//    }
//
//    /**
//     */
//    public UserServiceProto.AddResponse addUser(UserServiceProto.AddRequest request) {
//      return io.grpc.stub.ClientCalls.blockingUnaryCall(
//          getChannel(), getAddUserMethod(), getCallOptions(), request);
//    }
//
//    /**
//     */
//    public UserServiceProto.DeleteResponse deleteUser(UserServiceProto.DeleteRequest request) {
//      return io.grpc.stub.ClientCalls.blockingUnaryCall(
//          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
//    }
//
//    /**
//     */
//    public UserServiceProto.UpdateResponse updateUser(UserServiceProto.UpdateRequest request) {
//      return io.grpc.stub.ClientCalls.blockingUnaryCall(
//          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
//    }
//
//    /**
//     */
//    public UserServiceProto.SelectUserListResponse selectUserList(UserServiceProto.SelectUserListRequest request) {
//      return io.grpc.stub.ClientCalls.blockingUnaryCall(
//          getChannel(), getSelectUserListMethod(), getCallOptions(), request);
//    }
//  }
//
//  /**
//   */
//  public static final class SysUserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SysUserServiceFutureStub> {
//    private SysUserServiceFutureStub(
//        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//      super(channel, callOptions);
//    }
//
//    @java.lang.Override
//    protected SysUserServiceFutureStub build(
//        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
//      return new SysUserServiceFutureStub(channel, callOptions);
//    }
//
//    /**
//     */
//    public com.google.common.util.concurrent.ListenableFuture<UserServiceProto.AddResponse> addUser(
//        UserServiceProto.AddRequest request) {
//      return io.grpc.stub.ClientCalls.futureUnaryCall(
//          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
//    }
//
//    /**
//     */
//    public com.google.common.util.concurrent.ListenableFuture<UserServiceProto.DeleteResponse> deleteUser(
//        UserServiceProto.DeleteRequest request) {
//      return io.grpc.stub.ClientCalls.futureUnaryCall(
//          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
//    }
//
//    /**
//     */
//    public com.google.common.util.concurrent.ListenableFuture<UserServiceProto.UpdateResponse> updateUser(
//        UserServiceProto.UpdateRequest request) {
//      return io.grpc.stub.ClientCalls.futureUnaryCall(
//          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
//    }
//
//    /**
//     */
//    public com.google.common.util.concurrent.ListenableFuture<UserServiceProto.SelectUserListResponse> selectUserList(
//        UserServiceProto.SelectUserListRequest request) {
//      return io.grpc.stub.ClientCalls.futureUnaryCall(
//          getChannel().newCall(getSelectUserListMethod(), getCallOptions()), request);
//    }
//  }
//
//  private static final int METHODID_ADD_USER = 0;
//  private static final int METHODID_DELETE_USER = 1;
//  private static final int METHODID_UPDATE_USER = 2;
//  private static final int METHODID_SELECT_USER_LIST = 3;
//
//  private static final class MethodHandlers<Req, Resp> implements
//      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
//      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
//      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
//      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
//    private final SysUserServiceImplBase serviceImpl;
//    private final int methodId;
//
//    MethodHandlers(SysUserServiceImplBase serviceImpl, int methodId) {
//      this.serviceImpl = serviceImpl;
//      this.methodId = methodId;
//    }
//
//    @java.lang.Override
//    @java.lang.SuppressWarnings("unchecked")
//    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
//      switch (methodId) {
//        case METHODID_ADD_USER:
//          serviceImpl.addUser((UserServiceProto.AddRequest) request,
//              (io.grpc.stub.StreamObserver<UserServiceProto.AddResponse>) responseObserver);
//          break;
//        case METHODID_DELETE_USER:
//          serviceImpl.deleteUser((UserServiceProto.DeleteRequest) request,
//              (io.grpc.stub.StreamObserver<UserServiceProto.DeleteResponse>) responseObserver);
//          break;
//        case METHODID_UPDATE_USER:
//          serviceImpl.updateUser((UserServiceProto.UpdateRequest) request,
//              (io.grpc.stub.StreamObserver<UserServiceProto.UpdateResponse>) responseObserver);
//          break;
//        case METHODID_SELECT_USER_LIST:
//          serviceImpl.selectUserList((UserServiceProto.SelectUserListRequest) request,
//              (io.grpc.stub.StreamObserver<UserServiceProto.SelectUserListResponse>) responseObserver);
//          break;
//        default:
//          throw new AssertionError();
//      }
//    }
//
//    @java.lang.Override
//    @java.lang.SuppressWarnings("unchecked")
//    public io.grpc.stub.StreamObserver<Req> invoke(
//        io.grpc.stub.StreamObserver<Resp> responseObserver) {
//      switch (methodId) {
//        default:
//          throw new AssertionError();
//      }
//    }
//  }
//
//  private static abstract class SysUserServiceBaseDescriptorSupplier
//      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
//    SysUserServiceBaseDescriptorSupplier() {}
//
//    @java.lang.Override
//    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
//      return UserServiceProto.getDescriptor();
//    }
//
//    @java.lang.Override
//    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
//      return getFileDescriptor().findServiceByName("SysUserService");
//    }
//  }
//
//  private static final class SysUserServiceFileDescriptorSupplier
//      extends SysUserServiceBaseDescriptorSupplier {
//    SysUserServiceFileDescriptorSupplier() {}
//  }
//
//  private static final class SysUserServiceMethodDescriptorSupplier
//      extends SysUserServiceBaseDescriptorSupplier
//      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
//    private final String methodName;
//
//    SysUserServiceMethodDescriptorSupplier(String methodName) {
//      this.methodName = methodName;
//    }
//
//    @java.lang.Override
//    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
//      return getServiceDescriptor().findMethodByName(methodName);
//    }
//  }
//
//  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;
//
//  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
//    io.grpc.ServiceDescriptor result = serviceDescriptor;
//    if (result == null) {
//      synchronized (SysUserServiceGrpc.class) {
//        result = serviceDescriptor;
//        if (result == null) {
//          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
//              .setSchemaDescriptor(new SysUserServiceFileDescriptorSupplier())
//              .addMethod(getAddUserMethod())
//              .addMethod(getDeleteUserMethod())
//              .addMethod(getUpdateUserMethod())
//              .addMethod(getSelectUserListMethod())
//              .build();
//        }
//      }
//    }
//    return result;
//  }
//}
