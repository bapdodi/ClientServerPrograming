package io.grpc.login.Client;
import java.util.Scanner;
import java.util.logging.Logger;

import org.checkerframework.checker.units.qual.g;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.login.*;
import io.grpc.login.Part1.Student;
import io.grpc.stub.MetadataUtils;
import oracle.net.aso.c;

public class LoginClient {
    private static final Logger logger = Logger.getLogger(LoginClient.class.getName());
    private LoginGrpc.LoginBlockingStub blockingStub;
    private static Scanner scanner;
    private CMethod cMethod;
    private Metadata metadata;

    public LoginClient(io.grpc.Channel channel) {
        blockingStub = LoginGrpc.newBlockingStub(channel);
        cMethod = new CMethod(blockingStub, logger);
        scanner = new Scanner(System.in);
    }
    private void getTokenKey(String token) {
        metadata = new Metadata();
        Metadata.Key<String> tokenKey = Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
        metadata.put(tokenKey, "Bearer "+token);
        blockingStub = blockingStub.withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));
        cMethod = new CMethod(blockingStub, logger);
    }
    public void startMenu(){
        printMenu();
        String inputMenu = scanner.nextLine();
        switch(inputMenu){
            case "1": showMenu(cMethod.login());
                break;
            case "2": cMethod.join();
                break;
            case "x":
                return;
            default:
                showErrorMenuMessage();
        }
        startMenu();
    }
    private void showMenu(Student student) {
        if(student == null){
            return;
        }
        getTokenKey(student.getToken());
        if(student.getRole().equals("admin")){
            AdminClient adminClinet = new AdminClient(cMethod);
            adminClinet.start();
        }
        else{
            UserClient userClient = new UserClient(student,cMethod);
            userClient.start();
        }
    }
    private void showErrorMenuMessage() {
        System.out.println("잘못된 입력입니다.");
        System.out.println("다시 입력해주세요.");
    }
    private void printMenu() {
        System.out.println("*** input number ***");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("x. 종료");
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
        client.startMenu();
    }
}
