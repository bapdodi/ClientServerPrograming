package io.grpc.login.Client;

import io.grpc.StatusRuntimeException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import io.grpc.login.*;

public class CMethod {
    private final LoginGrpc.LoginBlockingStub blockingStub;
    private final Logger logger;
    private Scanner scanner;
    public CMethod(LoginGrpc.LoginBlockingStub blockingStub, Logger logger) {
        this.blockingStub = blockingStub;
        this.logger = logger;
        this.scanner = new Scanner(System.in);
    }

    public void login() {
        System.out.println("Input id: ");
        String id = scanner.nextLine();
        System.out.println("Input password: ");
        String password = scanner.nextLine();
        LoginRequest request = LoginRequest.newBuilder().setId(id).setPassword(password).build();
        LoginResponse response;
        try {
            response = blockingStub.login(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Login: " + response.getName());
    }

    public void join() {
        System.out.println("Input id: ");
        String id = scanner.nextLine();
        System.out.println("Input password: ");
        String password = scanner.nextLine();
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        JoinRequest request = JoinRequest.newBuilder().setId(id).setPassword(password).setName(name).build();
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

    public void showSubjectList() {
        ShowSubjectListRequest request = ShowSubjectListRequest.newBuilder().build();
        ShowSubjectListResponse response;
        try {
            response = blockingStub.showSubjectList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowSubjectList: " + response.getResult());
    }

	public void showStudentSubjectList() {
        logger.info("Input studentId: ");
        String studentId = scanner.nextLine();
		ShowStudentSubjectListRequest request = ShowStudentSubjectListRequest.newBuilder().setStudentId(studentId).build();
        ShowStudentSubjectListResponse response;
        try {
            response = blockingStub.showStudentSubjectList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowStudentSubjectList: " + response.getResult());
	}

	public void showSubjectStudentList() {
        logger.info("Input subjectId: ");
        String subjectId = scanner.nextLine();
        ShowSubjectStudentListRequest request = ShowSubjectStudentListRequest.newBuilder().setSubjectId(subjectId).build();
        ShowSubjectStudentListResponse response;
        try {
            response = blockingStub.showSubjectStudentList(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowSubjectStudentList: " + response.getResult());
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

	public void showSubjectApply() {
        logger.info("Input studentId: ");
        String studentId = scanner.nextLine();
        logger.info("Input subjectId: ");
        String subjectId = scanner.nextLine();
        ShowSubjectApplyRequest request = ShowSubjectApplyRequest.newBuilder().setStudentId(studentId).setSubjectId(subjectId).build();
        ShowSubjectApplyResponse response;
        try {
            response = blockingStub.showSubjectApply(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("ShowSubjectApply: " + response.getResult());
	}


    
}
