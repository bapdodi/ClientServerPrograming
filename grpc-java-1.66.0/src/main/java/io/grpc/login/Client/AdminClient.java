package io.grpc.login.Client;
import java.util.Scanner;

public class AdminClient {
    private static Scanner scanner;
    private CMethod cMethod;

    public AdminClient(CMethod cMethod) {
        scanner = new Scanner(System.in);
        this.cMethod = cMethod;
    }
    public void start(){
        showMenu();
        String inputMenu = scanner.nextLine();
        switch (inputMenu) {
            case "1":cMethod.deleteStudent();
                break;
            case "2":cMethod.enrollCourse();
                break;
            case "3":cMethod.dropCourse();
                break;
            case "4":cMethod.showStudentList();
                break;
            case "5":cMethod.showCourseList();
                break;
            case "6":cMethod.deleteStudent();;
                break;
            case "7":cMethod.addCourse();
                break;
            case "8":cMethod.deleteCourse();
                break;
            case "x":
                return;
            default:
                showErrorMenuMessage();
        }
        this.start();
    }
    private void showMenu() {
        System.out.println("*** input number ***");
        System.out.println("1. 학생 삭제");
        System.out.println("2. 수강과목 신청");
        System.out.println("3. 수강과목 취소");
        System.out.println("4. 학생리스트");
        System.out.println("5. 수강과목리스트");
        System.out.println("6. 학생 삭제");
        System.out.println("7. 수강과목 추가");
        System.out.println("8. 수강과목 삭제");
        System.out.println("x. 메인 화면으로 가기");
    }
    private void showErrorMenuMessage() {
        System.out.println("잘못된 입력입니다.");
        System.out.println("다시 입력해주세요.");
    }

}
