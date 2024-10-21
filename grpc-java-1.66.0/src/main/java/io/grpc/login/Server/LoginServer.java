package io.grpc.login.Server;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
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
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginServer {
    private static final Logger logger = Logger.getLogger(LoginServer.class.getName());
    private Server clientServer;
    private Server dbServer;
    private static DataBaseGrpc.DataBaseBlockingStub blockingStub;
    private void start() throws IOException{
        int clientPort = 50051;
        setLogger();
        clientServer = Grpc.newServerBuilderForPort(clientPort, InsecureServerCredentials.create()).addService(new LoginImpl()).build().start();
        logger.info("Server started, listening on " + clientPort);
        int dbPort = 50052;
        ManagedChannel dbChannel = ManagedChannelBuilder.forAddress("localhost", dbPort).usePlaintext().build();
        blockingStub = DataBaseGrpc.newBlockingStub(dbChannel);
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
            FileHandler fileHandler = new FileHandler("src/main/Log/server.log", true);
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
    private void stop(Server server) throws InterruptedException{
        if(server != null){
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
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
            DataStudent dataStudent = getStudent(request.getStudentId());
            if(dataStudent != null&&dataStudent.getPassword().equals(request.getPassword())){
                LoginResponse response = LoginResponse.newBuilder().setStudent(ServerStudent.newBuilder().setStudentId(dataStudent.getStudentId()).setPassword(dataStudent.getPassword()).setName(dataStudent.getName()).setMajor(dataStudent.getMajor()).addAllCourseId(dataStudent.getCourseIdList())).build();
                finishedresponse(responseObserver, response);
                logger.info(request.getStudentId() + " login");
            }
            LoginResponse response = LoginResponse.newBuilder().build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void join(JoinRequest request, StreamObserver<JoinResponse> responseObserver) {
            DataStudent dataStudent = getStudent(request.getStudent().getStudentId());
            String result = "";
            if(dataStudent != null){
                result = "Already User";
            }
            else{
                dataStudent = DataStudent.newBuilder().setStudentId(request.getStudent().getStudentId()).setPassword(request.getStudent().getPassword()).setName(request.getStudent().getName()).setMajor(request.getStudent().getMajor()).build();
                GetJoinRequest request2 = GetJoinRequest.newBuilder().setStudent(dataStudent).build();
                GetJoinResponse response2 = blockingStub.getJoin(request2);
                if(response2.getCheck()){
                    result = "Join Success";
                    logger.info(request.getStudent().getStudentId() + " join");
                }
                else{
                    result = "Join Fail";
                }
            }
            JoinResponse response = JoinResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void showStudentList(ShowStudentListRequest request, StreamObserver<ShowStudentListResponse> responseObserver) {
            GetStudentListRequest request2 = GetStudentListRequest.newBuilder().build();
            GetStudentListResponse response2 = blockingStub.getStudentList(request2);
            List<DataStudent> studentList = response2.getStudentList();
            String result = "*** Student List ***\n";
            for(DataStudent student : studentList){
                result += "Student ID: " + student.getStudentId() + " Password: " + student.getPassword() + " Name: " + student.getName() + " Major: " + student.getMajor() + " Course ID: ";
                for(int courseId : student.getCourseIdList()){
                    result += courseId+"";
                }
                result += "\n";
            }
            ShowStudentListResponse response = ShowStudentListResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void showCourseList(ShowCourseListRequest request, StreamObserver<ShowCourseListResponse> responseObserver) {
            GetCourseListRequest request2 = GetCourseListRequest.newBuilder().build();
            GetCourseListResponse response2 = blockingStub.getCourseList(request2);
            List<DataCourse> courseList = response2.getCourseList();
            String result = "*** Course List ***\n";
            for(DataCourse course : courseList){
                result += "Course ID: " + course.getCourseId() + " Course Name: " + course.getCourseName() + " Course Professor: " + course.getCourseProfessor() + " Course Limited: ";
                for(int courseLimited : course.getCourseLimitedList()){
                    result += courseLimited;
                }
                result += "\n";
            }
            ShowCourseListResponse response = ShowCourseListResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void serverDeleteStudent(ServerDeleteStudentRequest request, StreamObserver<ServerDeleteStudentResponse> responseObserver) {
            DataDeleteStudentRequest request2 = DataDeleteStudentRequest.newBuilder().setStudentId(request.getStudentId()).build();
            DataDeleteStudentResponse response2 = blockingStub.dataDeleteStudent(request2);
            String result = "";
            if(getStudent(request.getStudentId())==null){
                result = "Student Not Found";
            }
            else if(response2.getCheck()){
                result = "Delete Success";
                logger.info(request.getStudentId() + " deleteStudent");
            }
            else{
                result = "Delete Fail";
            }
            ServerDeleteStudentResponse response = ServerDeleteStudentResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void serverEnrollCourse(ServerEnrollCourseRequest request, StreamObserver<ServerEnrollCourseResponse> responseObserver) {
            DataStudent student = getStudent(request.getStudentId());
            DataCourse course = getCourse(request.getCourseId());
            if(student == null){
                ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder().setResult("Student Not Found").build();
                finishedresponse(responseObserver, response);
                return;
            }
            if(course==null){
                ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder().setResult("Course Not Found").build();
                finishedresponse(responseObserver, response);
                return;
            }
            LinkedList<Integer> courseLimitedList = new LinkedList<Integer>();
            courseLimitedList.addAll(course.getCourseLimitedList());
            LinkedList<Integer> studentCompleteCoures = new LinkedList<Integer>();
            studentCompleteCoures.addAll(student.getCourseIdList());

            String result = "";
            if(studentCompleteCoures.contains(request.getCourseId())){
                result = "Already Enrolled";
            }
            else if(studentCompleteCoures.containsAll(courseLimitedList)){
                DataEnrollCourseRequest request2 = DataEnrollCourseRequest.newBuilder().setCourseId(request.getCourseId()).setStudentId(request.getStudentId()).build();
                DataEnrollCourseResponse response2 = blockingStub.dataEnrollCourse(request2);

                if(response2.getCheck()){
                    result = "Success EnrollCourse";
                    logger.info(request.getStudentId() + " enroll " + request.getCourseId());
                }
                else{
                    result = "Fail EnrollCourse";
                }
            }
            else{
                result = "Course Limited";
            }
            ServerEnrollCourseResponse response = ServerEnrollCourseResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);

        }
        @Override
        public void serverDropCourse(ServerDropCourseRequest request, StreamObserver<ServerDropCourseResponse> responseObserver) {
            DataDropCourseRequest request2 = DataDropCourseRequest.newBuilder().setCourseId(request.getCourseId()).setStudentId(request.getStudentId()).build();
            DataDropCourseResponse response2 = blockingStub.dataDropCourse(request2);
            String result = "";
            if(getStudent(request.getStudentId())==null){
                result = "Student Not Found";
            }
            else if(getCourse(request.getCourseId())==null){
                result = "Course Not Found";
            }
            else if (response2.getCheck()) {
                result = "Success DropCourse";
                logger.info(request.getStudentId() + " drop " + request.getCourseId());
            }
            else{
                result = "Fail DropCourse";
            }
            ServerDropCourseResponse response = ServerDropCourseResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void serverAddCourse(ServerAddCourseRequest request, StreamObserver<ServerAddCourseResponse> responseObserver) {
            DataAddCourseRequest request2 = DataAddCourseRequest.newBuilder().setCourseId(request.getCourseId()).setCourseName(request.getCourseName()).setCourseProfessor(request.getCourseProfessor()).addAllCourseLimited(request.getCourseLimitedList()).build();
            DataAddCourseResponse response2 = blockingStub.dataAddCourse(request2);
            String result="";
            if (getCourse(request.getCourseId())==null){
                result = "Already Course";
            }
            else if(response2.getCheck()){
                result = "Success AddCourse";
                logger.info(request.getCourseId() + " addCourse");
            }
            else{
                result = "Fail AddCourse";
            }
            ServerAddCourseResponse response = ServerAddCourseResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);
        }
        @Override
        public void serverDeleteCourse(ServerDeleteCourseRequest request, StreamObserver<ServerDeleteCourseResponse> responseObserver) {
            DataDeleteCourseRequest request2 = DataDeleteCourseRequest.newBuilder().setCourseId(request.getCourseId()).build();
            DataDeleteCourseResponse response2 = blockingStub.dataDeleteCourse(request2);
            String result = "";
            if(getCourse(request.getCourseId())!=null){
                result = "Course Not Found";
            }
            else if(response2.getCheck()){
                result = "Success DeleteCourse";
                logger.info(request.getCourseId() + " deleteCourse");
            }
            else{
                result = "Fail DeleteCourse";
            }
            ServerDeleteCourseResponse response = ServerDeleteCourseResponse.newBuilder().setResult(result).build();
            finishedresponse(responseObserver, response);

        }
        private <T> void finishedresponse(StreamObserver<T> responseObserver, T response){
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        private DataStudent getStudent(int studentId){
            GetStudentRequest request = GetStudentRequest.newBuilder().setStudentId(studentId).build();
            GetStudentResponse getStudent = blockingStub.getStudent(request);
            if(!getStudent.hasStudent()) return null;
            return getStudent.getStudent();
        }
        private DataCourse getCourse(int courseId){
            GetCourseRequest request = GetCourseRequest.newBuilder().setCourseId(courseId).build();
            GetCourseResponse getCourse = blockingStub.getCourse(request);
            if(!getCourse.hasCourse()) return null;
            return getCourse.getCourse();
        }
    }
}
