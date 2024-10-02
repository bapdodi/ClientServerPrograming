package io.grpc.login;


import java.io.IOException;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import io.grpc.database.DataBaseGrpc;
import io.grpc.database.SaveUserRequest;
import io.grpc.database.SaveUserResponse;
import io.grpc.database.LoginUserRequest;
import io.grpc.database.LoginUserResponse;


public class DataBaseServer {
    private static final int PORT = 50052; // 데이터베이스 서버 포트

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = Grpc.newServerBuilderForPort(PORT, InsecureServerCredentials.create())
                .addService(new DataBaseImpl())
                .build()
                .start();

        System.out.println("DataBase Server started on port " + PORT);
        server.awaitTermination();
    }



    static class DataBaseImpl extends DataBaseGrpc.DataBaseImplBase {

        @Override
        public void saveUser(SaveUserRequest request, StreamObserver<SaveUserResponse> responseObserver) {
        
            SaveUserResponse response = SaveUserResponse.newBuilder().setResult("User Saved").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void loginUser(LoginUserRequest request, StreamObserver<LoginUserResponse> responseObserver) {
    
            LoginUserResponse response;
            
            response = LoginUserResponse.newBuilder().setResult("Login Fail").build();
            
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
