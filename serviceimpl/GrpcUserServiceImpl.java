//package cn.zjhn.grpcservice.serviceimpl;
//
//import cn.zjhn.grpcservice.protobuf.SysUserServiceGrpc;
//import cn.zjhn.grpcservice.protobuf.UserServiceProto;
//import cn.zjhn.service.api.entity.SysUser;
//import cn.zjhn.service.api.mapper.SysUserMapper;
//import cn.zjhn.service.common.param.UserPagedArg;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import io.grpc.stub.StreamObserver;
//import net.devh.boot.grpc.server.service.GrpcService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.lang.reflect.Field;
//import java.util.*;
//
//@GrpcService
//public class GrpcUserServiceImpl extends SysUserServiceGrpc.SysUserServiceImplBase{
//
//    @Autowired
//    SysUserMapper sysUserMapper;
//    @Override
//    public void selectUserList(UserServiceProto.SelectUserListRequest request, StreamObserver<UserServiceProto.SelectUserListResponse> responseObserver) {
//        UserPagedArg body = new UserPagedArg();
//        //得到调用方传来的参数
//        body.setPage(request.getPage()).setPageSize(request.getPagesize()).setKey(request.getRequestBody());
//        //真正的调用
//        Page<SysUser> pages = sysUserMapper.selectByParm(new Page<>(body.getPage(),body.getPageSize()),body);
//        //为了区分实体类和proto定义的message类，在proto中的类结尾加了‘s’，不代表集合
//        List<UserServiceProto.SysUsers> users = new ArrayList<>();
//        List<SysUser> list = pages.getRecords();
//        //list结果遍历赋值Builder
//        for(SysUser u : list){
//            if(u==null){continue;}
//            users.add(this.setUser(u).build());
//        }
//
//        UserServiceProto.SelectUserListResponse reply = UserServiceProto.SelectUserListResponse.newBuilder().addAllUser(users).build();
//        responseObserver.onNext(reply);
//        responseObserver.onCompleted();
//
//    }
//
//    @Override
//    public void addUser(UserServiceProto.AddRequest request, StreamObserver<UserServiceProto.AddResponse> responseObserver) {
//        //暂时只传了两个值
//        SysUser user = new SysUser();
//        user.setName(request.getUser().getName()).setUserName(request.getUser().getUsername());
//        int row = sysUserMapper.insert(user);;
//        //构建响应体
//        UserServiceProto.AddResponse reply = UserServiceProto.AddResponse.newBuilder().setRow(row).build();
//        //将响应返回
//        responseObserver.onNext(reply);
//        //向客户端发送处理后的结果
//        responseObserver.onCompleted();
//    }
//
//    public UserServiceProto.SysUsers.Builder setUser(SysUser u){
//        UserServiceProto.SysUsers.Builder userBuilder = UserServiceProto.SysUsers.newBuilder();
//        UserServiceProto.date.Builder dateBuilder = UserServiceProto.date.newBuilder();
//        //字段类型不为Date直接赋值
//        this.mergeObject(u,userBuilder);
//        //字段类型为proto自定义的Date类型需要另外赋值
//        if(u.getBirthday()!=null){userBuilder.setBirthday(setDate(dateBuilder,u.getBirthday()));}
//        if(u.getEntryTime()!=null){userBuilder.setEntryTime(setDate(dateBuilder,u.getEntryTime()));}
//        if(u.getContractCommencement()!=null){userBuilder.setContractCommencement(setDate(dateBuilder,u.getContractCommencement()));}
//        if(u.getContractEnd()!=null){userBuilder.setContractEnd(setDate(dateBuilder,u.getContractEnd()));}
//        if(u.getTrialStart()!=null){userBuilder.setTrialStart(setDate(dateBuilder,u.getTrialStart()));}
//        if(u.getTrialEnd()!=null){userBuilder.setTrialEnd(setDate(dateBuilder,u.getTrialEnd()));}
//        if(u.getTerminationTime()!=null){userBuilder.setTerminationTime(setDate(dateBuilder,u.getTerminationTime()));}
//        if(u.getCreateTime()!=null){userBuilder.setCreateTime(setDate(dateBuilder,u.getCreateTime()));}
//        if(u.getUpdateTime()!=null){userBuilder.setUpdateTime(setDate(dateBuilder,u.getUpdateTime()));}
//
//        return userBuilder;
//
//    }
//
//
//    //将服务端查询到的日期类结果赋值给proto文件里定义的日期类
//    public UserServiceProto.date.Builder setDate(UserServiceProto.date.Builder dateBuilder, Date date){
//        Calendar c = Calendar.getInstance();
//        c.setTime(date);
//        dateBuilder.setY(c.get(c.YEAR)).setM(c.get(c.MONTH)).setD(c.get(c.DATE)).build();
//        return dateBuilder;
//    }
//
////将远程调用后得到的User实体类的属性赋值给传输用的Builder类，保证属性不能为null
//    public <T> void mergeObject(T origin, T destination) {
//        if (origin == null || destination == null)
//            return;
//        if (!origin.getClass().equals(destination.getClass()))
//            return;
//
//        Field[] fields = origin.getClass().getDeclaredFields();
//        for (int i = 0; i < fields.length; i++) {
//            String type = fields[i].getType().toString();
//            if(!type.equals("class.java.util.Date")){
//                try {
//                    fields[i].setAccessible(true);
//                    Object value = fields[i].get(origin);
//                    if (null != value) {
//                        fields[i].set(destination, value);
//                    }
//                    fields[i].setAccessible(false);
//                } catch (Exception e) {
//                }
//          }
//        }
//    }
//
//
//}
