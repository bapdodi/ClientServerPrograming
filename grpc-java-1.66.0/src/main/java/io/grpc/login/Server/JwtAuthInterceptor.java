package io.grpc.login.Server;

import io.grpc.*;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class JwtAuthInterceptor implements ServerInterceptor {

    private static final String SECRET_KEY = "purplenavybeigefdffsfsdafSFSAFSADAGSEDvsdF";  // JWT 서명에 사용된 비밀 키
    private static final Context.Key<String> ROLE_KEY = Context.key("role");
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call,
                                                                Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        String methodName = call.getMethodDescriptor().getFullMethodName();
        if (methodName.equals("login.Login/login")) {
            return next.startCall(call, headers);
        }
        else if (methodName.equals("login.Login/join")) {
            return next.startCall(call, headers);
        }
        Metadata.Key<String> tokenKey = Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
        String token = headers.get(tokenKey);
        if (token == null || !token.startsWith("Bearer ")) {
            call.close(Status.UNAUTHENTICATED.withDescription("No token provided or invalid token format"), headers);
            return new ServerCall.Listener<ReqT>() {};
        }
        try {
            String jwtToken = token.substring(7);
            Key key = new SecretKeySpec(SECRET_KEY.getBytes(), SignatureAlgorithm.HS256.getJcaName());
            // JWT 토큰 검증
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jwtToken);
            if(!isadmin(methodName, getRoleFromToken(jwtToken))) {
                call.close(Status.PERMISSION_DENIED.withDescription("Permission denied"), headers);
                return new ServerCall.Listener<ReqT>() {};
            }
            return next.startCall(call, headers);

        } catch (JwtException e) {
            call.close(Status.UNAUTHENTICATED.withDescription("Invalid token signature"), headers);
            return new ServerCall.Listener<ReqT>() {};
        }
    }
    private String getRoleFromToken(String token) {
        Claims claims = Jwts.parserBuilder().setSigningKey(SECRET_KEY.getBytes()).build().parseClaimsJws(token).getBody();
        return claims.get("role", String.class);
    }
    private boolean isadmin(String method, String role) {
        if(method.equals("login.Login/showStudentList") && role.equals("admin")) {
            return true;
        }
        if(method.equals("login.Login/showCourseList") && role.equals("admin")) {
            return true;
        }
        if(method.equals("login.Login/serverDeleteStudent") && role.equals("admin")) {
            return true;
        }
        if(method.equals("login.Login/serverDropCourse") && role.equals("admin")) {
            return true;
        }
        if(method.equals("login.Login/serverAddCourse") && role.equals("admin")) {
            return true;
        }
        if(method.equals("login.Login/serverDeleteCourse") && role.equals("admin")) {
            return true;
        }
        
        return true;
    }
}
