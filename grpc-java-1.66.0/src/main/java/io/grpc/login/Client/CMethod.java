package io.grpc.login.Client;

import io.grpc.StatusRuntimeException;

import io.grpc.login.*;
import io.grpc.login.LoginGrpc.LoginBlockingStub;
import io.grpc.login.Part1.Course;
import io.grpc.login.Part1.Student;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CMethod {
    private LoginGrpc.LoginBlockingStub blockingStub;
    private final Logger logger;
    private Scanner scanner;
    public CMethod(LoginGrpc.LoginBlockingStub blockingStub, Logger logger) {
        this.blockingStub = blockingStub;
        this.logger = logger;
        this.scanner = new Scanner(System.in);
    }
    public Student login() {
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input password: ");
        String password = scanner.nextLine();
        LoginRequest request = LoginRequest.newBuilder().setStudentId(id).setPassword(password).build();
        try {
            LoginResponse response = blockingStub.login(request);
            if(!response.hasStudent()){
                System.out.println("Login failed");
                return null;
            }
            else{
                Student student = new Student(response.getStudent().getStudentId(), response.getStudent().getName(), response.getStudent().getMajor(), response.getStudent().getCourseIdList());
                System.out.println("Login: " + response.getStudent().getName());
                student.setToken(response.getToken());
                student.setRole(response.getRole());
                return student;
            }
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
    }
    public void join() {
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input password: ");
        String password = scanner.nextLine();
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input major: ");
        String major = scanner.nextLine();
        ServerStudent student = ServerStudent.newBuilder().setStudentId(id).setPassword(password).setName(name).setMajor(major).build();
        JoinRequest request = JoinRequest.newBuilder().setStudent(student).build();
        JoinResponse response;
        try {
            response = blockingStub.join(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void showStudentList(){
        ShowStudentListRequest request = ShowStudentListRequest.newBuilder().build();
        ShowStudentListResponse response;
        try {
            response = blockingStub.showStudentList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void showCourseList() {
        ShowCourseListRequest request = ShowCourseListRequest.newBuilder().build();
        ShowCourseListResponse response;
        try {
            response = blockingStub.showCourseList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void deleteStudent() {
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        ServerDeleteStudentRequest request = ServerDeleteStudentRequest.newBuilder().setStudentId(id).build();
        ServerDeleteStudentResponse response;
        try {
            response = blockingStub.serverDeleteStudent(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void enrollCourse() {
        System.out.println("Input studentId: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Input courseId: ");
        int courseId = Integer.parseInt(scanner.nextLine());
        ServerEnrollCourseRequest request = ServerEnrollCourseRequest.newBuilder().setStudentId(studentId).setCourseId(courseId).build();
        ServerEnrollCourseResponse response;
        try {
            response = blockingStub.serverEnrollCourse(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void dropCourse() {
        System.out.println("Input studentId: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Input courseId: ");
        int courseId = Integer.parseInt(scanner.nextLine());
        ServerDropCourseRequest request = ServerDropCourseRequest.newBuilder().setStudentId(studentId).setCourseId(courseId).build();
        ServerDropCourseResponse response;
        try {
            response = blockingStub.serverDropCourse(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void enrollCourse(Student student) {
        int studentId = student.getStudentId();
        System.out.println("Input courseId: ");
        int courseId = Integer.parseInt(scanner.nextLine());
        ServerEnrollCourseRequest request = ServerEnrollCourseRequest.newBuilder().setStudentId(studentId).setCourseId(courseId).build();
        ServerEnrollCourseResponse response;
        try {
            response = blockingStub.serverEnrollCourse(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void dropCourse(Student student) {
        int studentId = student.getStudentId();
        System.out.println("Input courseId: ");
        int courseId = Integer.parseInt(scanner.nextLine());
        ServerDropCourseRequest request = ServerDropCourseRequest.newBuilder().setStudentId(studentId).setCourseId(courseId).build();
        ServerDropCourseResponse response;
        try {
            response = blockingStub.serverDropCourse(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void addCourse() {
        Course course = new Course();
        System.out.println("Input courseId: ");
        course.setCourseId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Input courseName: ");
        course.setCourseName(scanner.nextLine());
        System.out.println("Input professor: ");
        course.setCourseProfessor(scanner.nextLine());
        System.out.println("Input CourseLimited: ");
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());
        while (stringTokenizer.hasMoreTokens()) {
            course.getCourseLimitedList().add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        ServerAddCourseRequest serverAddCourseRequest = ServerAddCourseRequest.newBuilder().setCourseId(course.getCourseId()).setCourseName(course.getCourseName()).setCourseProfessor(course.getCourseProfessor()).addAllCourseLimited(course.getCourseLimitedList()).build();
        ServerAddCourseResponse response;
        try {
            response = blockingStub.serverAddCourse(serverAddCourseRequest);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
    public void deleteCourse() {
        System.out.println("Input courseId: ");
        int courseId = Integer.parseInt(scanner.nextLine());
        ServerDeleteCourseRequest request = ServerDeleteCourseRequest.newBuilder().setCourseId(courseId).build();
        ServerDeleteCourseResponse response;
        try {
            response = blockingStub.serverDeleteCourse(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        System.out.println(response.getResult());
    }
}
