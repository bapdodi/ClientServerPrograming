package io.grpc.login.Client;
import java.util.Scanner;
import io.grpc.login.Part1.Student;

public class UserClient {
    private static Scanner scanner;
    private CMethod cMethod;
    private Student student;

    public UserClient(Student student, CMethod cMethod) {
        scanner = new Scanner(System.in);
        this.cMethod = cMethod;
        this.student = student;
    }
    public void start(){
        showMenu();
        String inputMenu = scanner.nextLine();
        switch (inputMenu) {
            case "1":cMethod.enrollCourse(student);
                break;
            case "2":cMethod.dropCourse(student);
                break;
            case "x":
                return;
            default:
                showErrorMenuMessage();
                break;
        }
        start();
    }
    private void showMenu() {
        System.out.println("*** input number ***");
        System.out.println("1. 수강과목 신청");
        System.out.println("2. 수강과목 취소");
        System.out.println("x. 메인 화면으로 가기");
    }
    private void showErrorMenuMessage() {
        System.out.println("잘못된 입력입니다.");
        System.out.println("다시 입력해주세요.");
    }

}
