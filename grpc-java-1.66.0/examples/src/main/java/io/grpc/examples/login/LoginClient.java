package io.grpc.examples.login;

import io.grpc.Channel;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;


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
    private static Scanner scanner = new Scanner(System.in);

    public LoginClient(io.grpc.Channel channel) {
        //채널은 받아오기 때문에 여기서 채널을 종료안시켜도 됨
        //채널을 받아오면 채널을 재사용시키기 편하다
        blockingStub = LoginGrpc.newBlockingStub(channel);
    }

    /** Join to server. */
    public void join(String Id, String Password, String name){
        //HelloRequest 객체를 만들어서 name을 넣어줌
        JoinRequest request = JoinRequest.newBuilder().setId(Id).setPassword(Password).setName(name).build();
        JoinResponse response;
        try {
            //서버로 요청을 보내고 응답을 받음
            response = blockingStub.join(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Join: " + response.getResult());
    }
    public void login(String Id, String Password){
        //HelloRequest 객체를 만들어서 name을 넣어줌
        LoginRequest request = LoginRequest.newBuilder().setId(Id).setPassword(Password).build();
        LoginResponse response;
        try {
            //서버로 요청을 보내고 응답을 받음
            response = blockingStub.login(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info(response.getResult());
    }

    public static void selectMethod(String target){
        System.out.println("join 또는 login을 입력해주세요");
        String method = scanner.nextLine();
        if(method.equals("join")){
            System.out.println("Id, Password, name을 입력해주세요");
            String Id = scanner.nextLine();
            String Password = scanner.nextLine();
            String name = scanner.nextLine();
            ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
            .usePlaintext()
            .build();
            try {
                LoginClient client = new LoginClient(channel);
                client.join(Id, Password, name);
            } finally {
                try {
                    channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        else if(method.equals("login")){
            System.out.println("Id, Password을 입력해주세요");
            String Id = scanner.nextLine();
            String Password = scanner.nextLine();
            ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
            .usePlaintext()
            .build();
            try {
                LoginClient client = new LoginClient(channel);
                client.login(Id, Password);
            } finally {
                try {
                    channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        else{
            selectMethod(target);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String user = "world";
        String target = "localhost:50051";
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
        if (args.length > 1) {
        target = args[1];
        }
        selectMethod(target);
        
    }


}
