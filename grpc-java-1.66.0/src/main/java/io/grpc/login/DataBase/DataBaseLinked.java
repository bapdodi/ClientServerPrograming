package io.grpc.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseLinked {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public DataBaseLinked(){
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "12345";

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 데이터베이스 연결
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found. Please add the JDBC library to your project.");
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
    public String login(String id, String password) {
    // SQL SELECT 쿼리 작성
        String selectQuery = "SELECT * FROM users WHERE id = ? AND password = ?";
        
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(selectQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setString(1, id); // id 값
            preparedStatement.setString(2, password); // password 값
            
            // 쿼리 실행
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // 결과 처리
            if (resultSet.next()) { // 결과가 있는 경우
                return resultSet.getString("name"); // "name" 컬럼의 값 반환
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            return "login failed";
        }
        return null; // 로그인 실패 시 null 반환
    }
    public String join(String id, String name, String password){
        // SQL INSERT 쿼리 작성
        String insertQuery = "INSERT INTO users (id, password, name) VALUES (?, ?, ?)";
        
        // PreparedStatement 생성
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(insertQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setString(1, id); // id 값
            preparedStatement.setString(2, password); //  password값
            preparedStatement.setString(3, name); // name 값
            // 쿼리 실행
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                return name +" was joined successfully!";
            } else {
                return "No joined";
            }
        } catch (SQLException e) {
            return "This id is already used";
        } catch (NullPointerException e) {
            return "error";
        }
    }

}
