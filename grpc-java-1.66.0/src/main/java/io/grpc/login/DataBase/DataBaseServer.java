package io.grpc.login.DataBase;
import java.io.FileNotFoundException;
import java.io.IOException;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import io.grpc.database.*;
import io.grpc.login.Part1.Course;
import io.grpc.login.Part1.CourseList;
import io.grpc.login.Part1.Student;

import java.util.ArrayList;


public class DataBaseServer {
    private static final int PORT = 50052; // 데이터베이스 서버 포트
    private static final DataBaseLinked db=new DataBaseLinked();

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
        public void getLogin(GetLoginRequest request, StreamObserver<GetLoginResponse> responseObserver) {
            int id = request.getStudentId();
            String password = request.getPassword();
            DataStudent student = db.login(id, password);
            
            if(student==null) {
                GetLoginResponse response = GetLoginResponse.newBuilder()
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                return;
            }
            else{
                GetLoginResponse response = GetLoginResponse.newBuilder()
                        .setStudent(student)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            
        }
        @Override
        public void getJoin(GetJoinRequest request, StreamObserver<GetJoinResponse> responseObserver) {
            DataStudent dataStudent = request.getStudent();
            String result = db.join(dataStudent);
            GetJoinResponse response = GetJoinResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void getStudentList(GetStudentListRequest request, StreamObserver<GetStudentListResponse> responseObserver) {
            String result="";
            
        }
        @Override
        public void getCourseList(GetCourseListRequest request, StreamObserver<GetCourseListResponse> responseObserver) {
            String result="";
            CourseList courseList;
            try {
                courseList = new CourseList("src/main/java/io/grpc/login/Part1/Courses.txt");
                ArrayList<Course> result1 = courseList.getAllCourseRecords();
                int i=1;
                for(Course c : result1) {
                    result+=i+": ";
                    result+=c.toString();
                    result+="\n";
                    i++;
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            GetCourseListResponse response = GetCourseListResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void getStudentCourseList(GetStudentCourseListRequest request, StreamObserver<GetStudentCourseListResponse> responseObserver) {
            String result="";
            GetStudentCourseListResponse response = GetStudentCourseListResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void getCourseStudentList(GetCourseStudentListRequest request, StreamObserver<GetCourseStudentListResponse> responseObserver) {
            String result="";
            GetCourseStudentListResponse response = GetCourseStudentListResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void getCompleteList(GetCompleteListRequest request, StreamObserver<GetCompleteListResponse> responseObserver) {
            String result="";
            GetCompleteListResponse response = GetCompleteListResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void getCourseApply(GetCourseApplyRequest request, StreamObserver<GetCourseApplyResponse> responseObserver) {
            String result="";
            GetCourseApplyResponse response = GetCourseApplyResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

    }
}
