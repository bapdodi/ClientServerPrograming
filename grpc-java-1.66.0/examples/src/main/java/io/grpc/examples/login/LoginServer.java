package io.grpc.examples.login;

import java.io.IOException;
import java.sql.SQLException;
/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
public class LoginServer {
    private static final Logger logger = Logger.getLogger(LoginServer.class.getName());
    private Server server;
    private static DataBase dataBase;
    private void start() throws IOException{
        int port = 50051;
        //인증이 없는 서버
        server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
                .addService(new GreeterImpl())
                .build()
                .start();
        
        logger.info("Server started, listening on " + port);
        //JVM이 종료될때 서버를 안전하게 종료하기 위해 사용
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try{
                    LoginServer.this.stop();
                } catch (InterruptedException e){
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }
    private void stop() throws InterruptedException{
        if(server != null){
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
    // 서버가 종료될때 메인 스레드가 종료되면서 데몬 스레드도 종료되기 때문에 서버가 종료될때까지 기다리기 위해 사용
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
          server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        final LoginServer server = new LoginServer();
        dataBase = new DataBase();
        server.start();
        server.blockUntilShutdown();
    }
    static class GreeterImpl extends LoginGrpc.LoginImplBase {

        @Override
        public void join(JoinRequest request, StreamObserver<JoinResponse> responseObserver) {
            dataBase.join(request.getId(), request.getName(), request.getPassword());
            JoinResponse response = JoinResponse.newBuilder().setResult("Join Success").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
            LoginResponse response;
            String name = dataBase.login(request.getId(), request.getPassword());
            if(name != null){
                response = LoginResponse.newBuilder().setResult("Login Success: "+name).build();
            }
            else{
                response = LoginResponse.newBuilder().setResult("Login Fail").build();
                
            }
            
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    
    }
}
