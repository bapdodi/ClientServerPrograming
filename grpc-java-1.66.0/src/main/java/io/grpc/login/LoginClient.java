package io.grpc.login;

import java.util.Scanner;
import java.util.logging.Logger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
  * A simple client that requests a greeting from the {@link LoginServer}.
  */
public class LoginClient {

    //로거: 로그메세지를 저장하고 추적할 수 있게 해주는 객체
    private static final Logger logger = Logger.getLogger(LoginClient.class.getName());
    //블로킹 객체: 서버와 통신할 때 사용하는 객체, 동기적 방식으로 호출을 수행할때 사용됨
    //동기적 방식은 서버 응답을 기다리는동안 lock됨
    //stub이란 클라이언트가 서버의 메서드를 호출할 때 사용되는 객체
    private final LoginGrpc.LoginBlockingStub blockingStub;
    private static Scanner scanner;
    private final CMethod cMethod;

    public LoginClient(io.grpc.Channel channel) {
        //채널은 받아오기 때문에 여기서 채널을 종료안시켜도 됨
        //채널을 받아오면 채널을 재사용시키기 편하다
        blockingStub = LoginGrpc.newBlockingStub(channel);
        cMethod = new CMethod(blockingStub, logger);
        scanner = new Scanner(System.in);
    }
    public void selectMethod(){
        printMenu();
        String inputMenu = scanner.nextLine();
        switch(inputMenu){
            case "1": cMethod.showStudentList();
                break;
            case "2": cMethod.showSubjectList();
                break;
            case "3": cMethod.showStudentSubjectList();
                break;
            case "4": cMethod.showSubjectStudentList();
                break;
            case "5": cMethod.showCompleteList();
                break;
            case "6": cMethod.showSubjectApply();
                break;
            case "7": System.exit(0);
                break;
            default:
                showErrorMenuMessage();
                break;
        }
        selectMethod();
    }
    private void showErrorMenuMessage() {
        System.out.println("잘못된 입력입니다.");
        System.out.println("다시 입력해주세요.");
    }
    private void printMenu() {
        System.out.println("*** input number ***");
        System.out.println("1. 학생리스트");
        System.out.println("2. 수강과목리스트");
        System.out.println("3. 학생 별 수강과목리스트");
        System.out.println("4. 수강과목 별 학생리스트");
        System.out.println("5. 학생 별 수강을 완료한 과목리스트");
        System.out.println("6. 수강신청");
        System.out.println("7. 종료");
    }

    private static String processArguments(String[] args, String target) {
        String user = "world";
        if (args.length > 0) {
            if ("--help".equals(args[0])) {
              System.err.println("Usage: [name [target]]");
              System.err.println("");
              System.err.println("  name    The name you wish to be greeted by. Defaults to " + user);
              System.err.println("  target  The server to connect to. Defaults to " + target);
              System.exit(1);
            }
        user = args[0];
        }
        if (args.length > 1) {target = args[1];}
        return target;
    }

    public static void main(String[] args) throws InterruptedException {
        String target = "localhost:50051";
        target = processArguments(args, target);
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        LoginClient client = new LoginClient(channel);
        client.selectMethod();
    }
    
    


}
