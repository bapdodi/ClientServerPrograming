package io.grpc.login.DataBase;
import java.io.IOException;
import java.text.SimpleDateFormat;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import io.grpc.database.*;
import io.grpc.login.Server.LoginServer;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class DataBaseServer {
    private static final Logger logger = Logger.getLogger(LoginServer.class.getName());
    private static final int PORT = 50052; // 데이터베이스 서버 포트
    private static final DataBaseLinked db=new DataBaseLinked(logger);
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = Grpc.newServerBuilderForPort(PORT, InsecureServerCredentials.create()).addService(new DataBaseImpl()).build().start();
        setLogger();
        logger.info("DataBase Server started on port " + PORT);
        server.awaitTermination();
    }
    private static void setLogger() {
        try {
            // FileHandler 설정
            FileHandler fileHandler = new FileHandler("src/main/Log/dataserver.log", true);
            fileHandler.setFormatter(new CustomFormatter());
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
    static class DataBaseImpl extends DataBaseGrpc.DataBaseImplBase {
        @Override
        public void getStudent(GetStudentRequest request, StreamObserver<GetStudentResponse> responseObserver) {
            int id = request.getStudentId();
            DataStudent student = db.getStudent(id);
            GetStudentResponse response;
            if(student==null) {
                response = GetStudentResponse.newBuilder().build();
            }
            else{
                response = GetStudentResponse.newBuilder().setStudent(student).build();
            }
            finishedresponse(responseObserver, response);
        }
        @Override
        public void getCourse(GetCourseRequest request, StreamObserver<GetCourseResponse> responseObserver) {
            int id = request.getCourseId();
            DataCourse course = db.getCourse(id);
            GetCourseResponse response;
            if(course==null) {
                response = GetCourseResponse.newBuilder().build();;
            }
            else{
                response = GetCourseResponse.newBuilder().setCourse(course).build();
            }
            finishedresponse(responseObserver, response);
        }
        @Override
        public void getJoin(GetJoinRequest request, StreamObserver<GetJoinResponse> responseObserver) {
            DataStudent dataStudent = request.getStudent();
            boolean check = db.join(dataStudent);
            GetJoinResponse response = GetJoinResponse.newBuilder().setCheck(check).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void getStudentList(GetStudentListRequest request, StreamObserver<GetStudentListResponse> responseObserver) {
            List<DataStudent> studentList = db.getStudentList();
            GetStudentListResponse response = GetStudentListResponse.newBuilder().addAllStudent(studentList).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void getCourseList(GetCourseListRequest request, StreamObserver<GetCourseListResponse> responseObserver) {
            List<DataCourse> courseList = db.getCourseList();
            GetCourseListResponse response = GetCourseListResponse.newBuilder().addAllCourse(courseList).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void dataDeleteStudent(DataDeleteStudentRequest request, StreamObserver<DataDeleteStudentResponse> responseObserver) {
            int id = request.getStudentId();
            DataDeleteStudentResponse response = DataDeleteStudentResponse.newBuilder()
                    .setCheck(db.deleteStudent(id))
                    .build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void dataAddCourse(DataAddCourseRequest request, StreamObserver<DataAddCourseResponse> responseObserver) {
            int courseId = request.getCourseId();
            String courseProfessor = request.getCourseProfessor();
            String courseName = request.getCourseName();
            List<Integer> courseLimitedList = request.getCourseLimitedList();
            DataAddCourseResponse response = DataAddCourseResponse.newBuilder()
                    .setCheck(db.addCourse(courseId, courseProfessor, courseName, courseLimitedList))
                    .build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void dataDeleteCourse(DataDeleteCourseRequest request, StreamObserver<DataDeleteCourseResponse> responseObserver) {
            int courseId = request.getCourseId();
            DataDeleteCourseResponse response = DataDeleteCourseResponse.newBuilder()
                    .setCheck(db.deleteCourse(courseId))
                    .build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void dataEnrollCourse(DataEnrollCourseRequest request, StreamObserver<DataEnrollCourseResponse> responseObserver) {
            int studentId = request.getStudentId();
            int courseId = request.getCourseId();
            DataEnrollCourseResponse response = DataEnrollCourseResponse.newBuilder()
                    .setCheck(db.enrollCourse(studentId, courseId))
                    .build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void dataDropCourse(DataDropCourseRequest request, StreamObserver<DataDropCourseResponse> responseObserver) {
            int studentId = request.getStudentId();
            int courseId = request.getCourseId();
            DataDropCourseResponse response = DataDropCourseResponse.newBuilder().setCheck(db.dropCourse(studentId, courseId)).build();
            finishedresponse(responseObserver, response);
        }
        private <T> void finishedresponse(StreamObserver<T> responseObserver, T response){
            finishedresponse(responseObserver, response);
        }
    }
}
