package io.grpc.login.Client;

import io.grpc.StatusRuntimeException;
import io.grpc.login.JoinRequest;
import io.grpc.login.JoinResponse;
import io.grpc.login.LoginGrpc;
import io.grpc.login.LoginRequest;
import io.grpc.login.LoginResponse;
import io.grpc.login.ServerStudent;
import io.grpc.login.ShowCompleteListRequest;
import io.grpc.login.ShowCompleteListResponse;
import io.grpc.login.ShowStudentListRequest;
import io.grpc.login.ShowStudentListResponse;
import io.grpc.login.ShowStudentCourseListRequest;
import io.grpc.login.ShowStudentCourseListResponse;
import io.grpc.login.ShowCourseApplyRequest;
import io.grpc.login.ShowCourseApplyResponse;
import io.grpc.login.ShowCourseListRequest;
import io.grpc.login.ShowCourseListResponse;
import io.grpc.login.ShowCourseStudentListRequest;
import io.grpc.login.ShowCourseStudentListResponse;
import io.grpc.login.LoginGrpc.LoginBlockingStub;
import io.grpc.login.Part1.Student;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class CMethod {
    private final LoginGrpc.LoginBlockingStub blockingStub;
    private final Logger logger;
    private Scanner scanner;
    public CMethod(LoginGrpc.LoginBlockingStub blockingStub, Logger logger) {
        this.blockingStub = blockingStub;
        this.logger = logger;
        this.scanner = new Scanner(System.in);
    }

    public Student login() {
        Student student = null;
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input password: ");
        String password = scanner.nextLine();
        LoginRequest request = LoginRequest.newBuilder().setStudentId(id).setPassword(password).build();
        LoginResponse response;
        try {
            response = blockingStub.login(request);
            if(response.getStudent().getName().equals("")){
                logger.info("Login: " + "Login failed");
                return null;
            }
            else{
                student = new Student(response.getStudent().getStudentId(), response.getStudent().getName(), response.getStudent().getMajor(), response.getStudent().getCourseIdList());
                logger.info("Login: " + response.getStudent().getName());
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
        logger.info("Join: " + response.getResult());
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
        logger.info("ShowStudentList: " + response.getResult());
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
        logger.info("ShowCourseList: " + response.getResult());
    }

	public void showStudentCourseList() {
        logger.info("Input studentId: ");
        String studentId = scanner.nextLine();
		ShowStudentCourseListRequest request = ShowStudentCourseListRequest.newBuilder().setStudentId(studentId).build();
        ShowStudentCourseListResponse response;
        try {
            response = blockingStub.showStudentCourseList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowStudentCourseList: " + response.getResult());
	}

	public void showCourseStudentList() {
        logger.info("Input courseId: ");
        String courseId = scanner.nextLine();
        ShowCourseStudentListRequest request = ShowCourseStudentListRequest.newBuilder().setCourseId(courseId).build();
        ShowCourseStudentListResponse response;
        try {
            response = blockingStub.showCourseStudentList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowCourseStudentList: " + response.getResult());
	}

	public void showCompleteList() {
        logger.info("Input studentId: ");
        String studentId = scanner.nextLine();
        ShowCompleteListRequest request = ShowCompleteListRequest.newBuilder().setStudentId(studentId).build();
        ShowCompleteListResponse response;
        try {
            response = blockingStub.showCompleteList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowCompleteList: " + response.getResult());
	}

	public void showCourseApply() {
        logger.info("Input studentId: ");
        String studentId = scanner.nextLine();
        logger.info("Input courseId: ");
        String courseId = scanner.nextLine();
        ShowCourseApplyRequest request = ShowCourseApplyRequest.newBuilder().setStudentId(studentId).setCourseId(courseId).build();
        ShowCourseApplyResponse response;
        try {
            response = blockingStub.showCourseApply(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowCourseApply: " + response.getResult());
	}


    
}
