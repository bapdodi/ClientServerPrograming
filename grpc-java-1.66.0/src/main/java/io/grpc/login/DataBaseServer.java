package io.grpc.login;


import java.io.IOException;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import io.grpc.database.DataBaseGrpc;
import io.grpc.database.GetStudentListRequest;


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
        public void GetStudentList(GetStudentListRequest request, StreamObserver<GetStudentListResponse> responseObserver) {
            GetStudentListResponse response = GetStudentListResponse.newBuilder()
                .setResult("Student List Data")
                .build();
            
            // 클라이언트에 응답 전송
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
