/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 package io.grpc.examples.helloworld;

 import io.grpc.Channel;
 import java.util.Scanner;
 import java.util.concurrent.TimeUnit;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 
 import io.grpc.Grpc;
 import io.grpc.InsecureChannelCredentials;
 import io.grpc.ManagedChannel;
 import io.grpc.StatusRuntimeException;
 
 /**
  * A simple client that requests a greeting from the {@link HelloWorldServer}.
  */
 public class HelloWorldClient {
   //로거: 로그메세지를 저장하고 추적할 수 있게 해주는 객체
   private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());
   //블로킹 객체: 서버와 통신할 때 사용하는 객체, 동기적 방식으로 호출을 수행할때 사용됨
   //동기적 방식은 서버 응답을 기다리는동안 lock됨
   //stub이란 클라이언트가 서버의 메서드를 호출할 때 사용되는 객체
   private final GreeterGrpc.GreeterBlockingStub blockingStub;
 
   
   public HelloWorldClient(Channel channel) {
    //채널은 받아오기 때문에 여기서 채널을 종료안시켜도 됨
    //채널을 받아오면 채널을 재사용시키기 편하다
     blockingStub = GreeterGrpc.newBlockingStub(channel);
   }
 
   /** Say hello to server. */
   public void greet(String name) {
     logger.info("Will try to greet " + name + " ...");
     //HelloRequest 객체를 만들어서 name을 넣어줌
     HelloRequest request = HelloRequest.newBuilder().setName(name).build();
     HelloReply response;
     try {
      //서버로 요청을 보내고 응답을 받음
       response = blockingStub.sayHello(request);
     } catch (StatusRuntimeException e) {
       logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
       return;
     }
     logger.info("Greeting: " + response.getMessage());
   }
   
   public void save(String name) {
     logger.info("Will try to save " + name + " ...");
     HelloRequest request = HelloRequest.newBuilder().setName(name).build();
     HelloReply response;
     try {
       response = blockingStub.save(request);
     } catch (StatusRuntimeException e) {
       logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
       return;
     }
     logger.info("save: " + response.getMessage());
   }
 
   public void load() {
     HelloRequest request = HelloRequest.newBuilder().build();
     HelloReply response;
     try {
       response = blockingStub.load(request);
     } catch (StatusRuntimeException e) {
       logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
       return;
     }
     logger.info("load: " + response.getMessage());
   }
 
   /**
    * Greet server. If provided, the first element of {@code args} is the name to use in the
    * greeting. The second argument is the target server.
    */
   public static void main(String[] args) throws Exception {
     String user = "world";
     // Access a service running on the local machine on port 50051
     String target = "localhost:50051";
     // Allow passing in the user and target strings as command line arguments
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
 
     // Create a communication channel to the server, known as a Channel. Channels are thread-safe
     // and reusable. It is common to create channels at the beginning of your application and reuse
     // them until the application shuts down.
     //
     // For the example we use plaintext insecure credentials to avoid needing TLS certificates. To
     // use TLS, use TlsChannelCredentials instead.


     //서버와의 연결을 관리하는 객체
     //채널은 스레드 세이프(스레드 안정성이 올라감)하고 재사용 가능함
     //채널은 애플리케이션 시작시에 만들어지고 애플리케이션이 종료될때까지 재사용됨
     //예제에서는 TLS 인증서가 필요없기 때문에 평문 인증을 사용함
     ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
         .build();
     try {
       HelloWorldClient client = new HelloWorldClient(channel);
       if(args[0].equals("save")){
         Scanner scanner = new Scanner(System.in);
         user = scanner.nextLine();
         scanner.close();
         client.save(user);
       }
       else if(args[0].equals("load")){
         client.load();
       }
       else if(args[0].equals("greet")){
         client.greet(user);
       }
       
     } finally {
       // 채널을 종료시킴
       // 채널이 완전히 종료될때까지 기다림
       // 정상적으로 5초간 기다리고 넘으면 바로 종료
       channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
     }
   }
 }
 