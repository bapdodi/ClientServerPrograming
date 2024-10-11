package io.grpc.login.Server;

import java.io.IOException;
import java.sql.SQLException;
/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Date;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.database.*;
import io.grpc.login.*;
import io.grpc.stub.StreamObserver;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.text.SimpleDateFormat;

public class LoginServer {
    private static final Logger logger = Logger.getLogger(LoginServer.class.getName());
    private Server clientServer;
    private Server dbServer;
    private static DataBaseGrpc.DataBaseBlockingStub blockingStub;
    private void start() throws IOException{

        setLogger();
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
    private void setLogger() {
        try {
            // FileHandler 설정
            FileHandler fileHandler = new FileHandler("src/main/Log/server.log", true); // true는 파일에 덧붙이기
            fileHandler.setFormatter(new CustomFormatter()); // 기본 포맷 사용
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static class CustomFormatter extends Formatter {
        private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        @Override
        public String format(LogRecord record) {
            StringBuilder sb = new StringBuilder();
            sb.append(dateFormat.format(new Date(record.getMillis()))).append(" ");
            sb.append(record.getLevel()).append(": ");
            sb.append(record.getMessage()).append("\n");
            return sb.toString();
        }
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
            GetLoginRequest request2 = GetLoginRequest.newBuilder().setId(request.getId()).setPassword(request.getPassword()).build();
            GetLoginResponse response2 = blockingStub.getLogin(request2);
            LoginResponse response = LoginResponse.newBuilder()
                .setResult(response2.getResult())
                .setName(response2.getName())
                .build();
            // 클라이언트에 응답 전송
            logger.info("Login: " + response.getName());
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void join(JoinRequest request, StreamObserver<JoinResponse> responseObserver) {
            GetJoinRequest request2 = GetJoinRequest.newBuilder().setId(request.getId()).setName(request.getName()).setPassword(request.getPassword()).build();
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
        public void showSubjectList(ShowSubjectListRequest request, StreamObserver<ShowSubjectListResponse> responseObserver) {
            GetSubjectListRequest request2 = GetSubjectListRequest.newBuilder().build();
            GetSubjectListResponse response2 = blockingStub.getSubjectList(request2);
            ShowSubjectListResponse response = ShowSubjectListResponse.newBuilder()
                .setResult(response2.getResult())
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void showStudentSubjectList(ShowStudentSubjectListRequest request, StreamObserver<ShowStudentSubjectListResponse> responseObserver) {
            ShowStudentSubjectListResponse response = ShowStudentSubjectListResponse.newBuilder()
                .setResult("Student Subject List Data")
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void showSubjectStudentList(ShowSubjectStudentListRequest request, StreamObserver<ShowSubjectStudentListResponse> responseObserver) {
            ShowSubjectStudentListResponse response = ShowSubjectStudentListResponse.newBuilder()
                .setResult("Subject Student List Data")
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
        public void showSubjectApply(ShowSubjectApplyRequest request, StreamObserver<ShowSubjectApplyResponse> responseObserver) {
            ShowSubjectApplyResponse response = ShowSubjectApplyResponse.newBuilder()
                .setResult("Subject Apply Data")
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    
    }
}
