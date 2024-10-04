package io.grpc.login;

import java.io.IOException;
import java.sql.SQLException;
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
import io.grpc.database.DataBaseGrpc;
import io.grpc.database.*;
import io.grpc.stub.StreamObserver;
public class LoginServer {
    private static final Logger logger = Logger.getLogger(LoginServer.class.getName());
    private Server clientServer;
    private Server dbServer;
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
