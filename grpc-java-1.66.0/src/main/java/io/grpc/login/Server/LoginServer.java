package io.grpc.login.Server;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.database.*;
import io.grpc.login.*;
import io.grpc.stub.StreamObserver;
import oracle.net.aso.c;
public class LoginServer {
    private static final Logger logger = Logger.getLogger(LoginServer.class.getName());
    private Server clientServer;
    private Server dbServer;
    private static ServerStudent student;
    private static DataBaseGrpc.DataBaseBlockingStub blockingStub;
    private void start() throws IOException{
   
        int clientPort = 50051;
        //인증이 없는 서버
        clientServer = Grpc.newServerBuilderForPort(clientPort, InsecureServerCredentials.create())
                .addService(new LoginImpl())
                .build()
                .start();
        
        logger.info("Server started, listening on " + clientPort);

        int dbPort = 50052;
        ManagedChannel dbChannel = ManagedChannelBuilder.forAddress("localhost", dbPort)
        .usePlaintext()
        .build();
        blockingStub = DataBaseGrpc.newBlockingStub(dbChannel);

        //JVM이 종료될때 서버를 안전하게 종료하기 위해 사용
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try{
                    LoginServer.this.stop(clientServer);
                    LoginServer.this.stop(dbServer);
                } catch (InterruptedException e){
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }
    private void stop(Server server) throws InterruptedException{
        if(server != null){
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
    // 서버가 종료될때 메인 스레드가 종료되면서 데몬 스레드도 종료되기 때문에 서버가 종료될때까지 기다리기 위해 사용
    private void blockUntilShutdown(Server server) throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        final LoginServer server = new LoginServer();
        server.start();
        server.blockUntilShutdown(server.clientServer);
        server.blockUntilShutdown(server.dbServer);
    }
    static class LoginImpl extends LoginGrpc.LoginImplBase {
        @Override
        public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
            GetLoginRequest request2 = GetLoginRequest.newBuilder().setStudentId(request.getStudentId()).setPassword(request.getPassword()).build();
            if(request2.getStudentId() == -1){
            }
            else{
                GetLoginResponse response2 = blockingStub.getLogin(request2);
                student = ServerStudent.newBuilder().setStudentId(response2.getStudent().getStudentId()).setName(response2.getStudent().getName()).setMajor(response2.getStudent().getMajor()).addAllCourseId(response2.getStudent().getCourseIdList()).build();
            }
            
            LoginResponse response = LoginResponse.newBuilder()
                .setStudent(student)
                .build();
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void join(JoinRequest request, StreamObserver<JoinResponse> responseObserver) {
            DataStudent dataStudent = DataStudent.newBuilder()
            .setStudentId(request.getStudent().getStudentId())
            .setPassword(request.getStudent().getPassword())
            .setName(request.getStudent().getName())
            .setMajor(request.getStudent().getMajor())
            .build();
            
            GetJoinRequest request2 = GetJoinRequest.newBuilder().setStudent(dataStudent).build();
            GetJoinResponse response2 = blockingStub.getJoin(request2);
            JoinResponse response = JoinResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void showStudentList(ShowStudentListRequest request, StreamObserver<ShowStudentListResponse> responseObserver) {
            GetStudentListRequest request2 = GetStudentListRequest.newBuilder().build();
            GetStudentListResponse response2 = blockingStub.getStudentList(request2);
            ShowStudentListResponse response = ShowStudentListResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void showCourseList(ShowCourseListRequest request, StreamObserver<ShowCourseListResponse> responseObserver) {
            GetCourseListRequest request2 = GetCourseListRequest.newBuilder().build();
            GetCourseListResponse response2 = blockingStub.getCourseList(request2);
            ShowCourseListResponse response = ShowCourseListResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void showStudentCourseList(ShowStudentCourseListRequest request, StreamObserver<ShowStudentCourseListResponse> responseObserver) {
            ShowStudentCourseListResponse response = ShowStudentCourseListResponse.newBuilder()
                .setResult("Student Course List Data")
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void showCourseStudentList(ShowCourseStudentListRequest request, StreamObserver<ShowCourseStudentListResponse> responseObserver) {
            ShowCourseStudentListResponse response = ShowCourseStudentListResponse.newBuilder()
                .setResult("Course Student List Data")
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void showCompleteList(ShowCompleteListRequest request, StreamObserver<ShowCompleteListResponse> responseObserver) {
            ShowCompleteListResponse response = ShowCompleteListResponse.newBuilder()
                .setResult("Complete List Data")
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void showCourseApply(ShowCourseApplyRequest request, StreamObserver<ShowCourseApplyResponse> responseObserver) {
            ShowCourseApplyResponse response = ShowCourseApplyResponse.newBuilder()
                .setResult("Course Apply Data")
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void serverDeleteStudent(ServerDeleteStudentRequest request, StreamObserver<ServerDeleteStudentResponse> responseObserver) {
            DataDeleteStudentRequest request2 = DataDeleteStudentRequest.newBuilder().setStudentId(request.getStudentId()).build();
            DataDeleteStudentResponse response2 = blockingStub.dataDeleteStudent(request2);
            ServerDeleteStudentResponse response = ServerDeleteStudentResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void serverEnrollCourse(ServerEnrollCourseRequest request, StreamObserver<ServerEnrollCourseResponse> responseObserver) {
            GetStudentRequest request3 = GetStudentRequest.newBuilder().setStudentId(request.getStudentId()).build();
            GetStudentResponse getStudent = blockingStub.getStudent(request3);
            if(!getStudent.hasStudent()){
                ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder()
                .setResult("Student Not Found")
                .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                return;
            }
            GetCourseRequest request4 = GetCourseRequest.newBuilder().setCourseId(request.getCourseId()).build();
            GetCourseResponse getCourse = blockingStub.getCourse(request4);
            if(!getCourse.hasCourse()){
                ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder()
                .setResult("Course Not Found")
                .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            LinkedList<Integer> courseLimitedList = new LinkedList<Integer>();
            courseLimitedList.addAll(getCourse.getCourse().getCourseLimitedList());
            LinkedList<Integer> studentCompleteCoures = new LinkedList<Integer>();
            studentCompleteCoures.addAll(getStudent.getStudent().getCourseIdList());
            if(studentCompleteCoures.contains(request.getCourseId())){
                ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder()
                .setResult("Already Enrolled")
                .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            if(studentCompleteCoures.containsAll(courseLimitedList)){
                DataEnrollCourseRequest request2 = DataEnrollCourseRequest.newBuilder().setCourseId(request.getCourseId()).setStudentId(request.getStudentId()).build();
                DataEnrollCourseResponse response2 = blockingStub.dataEnrollCourse(request2);
                ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder()
                    .setResult(response2.getResult())
                    .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            else{
                ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder()
                .setResult("Course Limited")
                .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            
            
        }
        @Override
        public void serverDropCourse(ServerDropCourseRequest request, StreamObserver<ServerDropCourseResponse> responseObserver) {
            DataDropCourseRequest request2 = DataDropCourseRequest.newBuilder().setCourseId(request.getCourseId()).setStudentId(request.getStudentId()).build();
            DataDropCourseResponse response2 = blockingStub.dataDropCourse(request2);
            ServerDropCourseResponse response = ServerDropCourseResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void serverAddCourse(ServerAddCourseRequest request, StreamObserver<ServerAddCourseResponse> responseObserver) {
            DataAddCourseRequest request2 = DataAddCourseRequest.newBuilder().setCourseId(request.getCourseId()).setCourseName(request.getCourseName()).setCourseProfessor(request.getCourseProfessor()).addAllCourseLimited(request.getCourseLimitedList()).build();
            DataAddCourseResponse response2 = blockingStub.dataAddCourse(request2);
            ServerAddCourseResponse response = ServerAddCourseResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void serverDeleteCourse(ServerDeleteCourseRequest request, StreamObserver<ServerDeleteCourseResponse> responseObserver) {
            DataDeleteCourseRequest request2 = DataDeleteCourseRequest.newBuilder().setCourseId(request.getCourseId()).build();
            DataDeleteCourseResponse response2 = blockingStub.dataDeleteCourse(request2);
            ServerDeleteCourseResponse response = ServerDeleteCourseResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
