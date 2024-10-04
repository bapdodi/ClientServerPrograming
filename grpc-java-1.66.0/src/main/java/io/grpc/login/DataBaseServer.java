package io.grpc.login;


import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import io.grpc.database.*;
import io.grpc.login.Part1.Course;
import io.grpc.login.Part1.CourseList;
import io.grpc.login.Part1.Student;
import io.grpc.login.Part1.StudentList;

import java.util.ArrayList;


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
        public void getStudentList(GetStudentListRequest request, StreamObserver<GetStudentListResponse> responseObserver) {
            String result="";
            StudentList studentList;
            try {
                studentList = new StudentList("src/main/java/io/grpc/login/Part1/Students.txt");
                ArrayList<Student> result1 = studentList.getAllStudentRecords();
                int i=1;
                for(Student s : result1) {
                    result+=i+": ";
                    result+=s.toString();
                    result+="\n";
                    i++;
                }
                GetStudentListResponse response = GetStudentListResponse.newBuilder()
                        .setResult(result)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        @Override
        public void getSubjectList(GetSubjectListRequest request, StreamObserver<GetSubjectListResponse> responseObserver) {
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
            GetSubjectListResponse response = GetSubjectListResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void getStudentSubjectList(GetStudentSubjectListRequest request, StreamObserver<GetStudentSubjectListResponse> responseObserver) {
            String result="";
            GetStudentSubjectListResponse response = GetStudentSubjectListResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void getSubjectStudentList(GetSubjectStudentListRequest request, StreamObserver<GetSubjectStudentListResponse> responseObserver) {
            String result="";
            GetSubjectStudentListResponse response = GetSubjectStudentListResponse.newBuilder()
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
        public void getSubjectApply(GetSubjectApplyRequest request, StreamObserver<GetSubjectApplyResponse> responseObserver) {
            String result="";
            GetSubjectApplyResponse response = GetSubjectApplyResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

    }
}
