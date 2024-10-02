package io.grpc.login;

import java.io.IOException;
import java.sql.SQLException;
/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.logging.Level;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.StatusRuntimeException;
import io.grpc.database.DataBaseGrpc;
import io.grpc.database.SaveUserRequest;
import io.grpc.database.SaveUserResponse;
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
        public void join(JoinRequest request, StreamObserver<JoinResponse> responseObserver) {

            SaveUserRequest dbRequest = SaveUserRequest.newBuilder().setId("Id").setPassword("Password").setName("name").build();
            SaveUserResponse dbResponse;
            try {
                //서버로 요청을 보내고 응답을 받음
                dbResponse = blockingStub.saveUser(dbRequest);
            } catch (StatusRuntimeException e) {
                logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                return;
            }
            logger.info("Join: " + dbResponse.getResult());



            JoinResponse response = JoinResponse.newBuilder().setResult(dbResponse.getResult()).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
            LoginResponse response;
            response = LoginResponse.newBuilder().setResult("Login Fail").build();
            
            
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    
    }
}
