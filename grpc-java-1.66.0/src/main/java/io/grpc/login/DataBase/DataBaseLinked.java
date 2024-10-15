package io.grpc.login.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import io.grpc.database.DataStudent;
import java.util.ArrayList;

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
            e.printStackTrace();
        } 
    }
    public DataStudent login(int id, String password) {
    // SQL SELECT 쿼리 작성
        String selectQuery = "SELECT * FROM STUDENT WHERE student_id = ? AND password = ?";
        
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(selectQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, id); // id 값
            preparedStatement.setString(2, password); // password 값
            
            // 쿼리 실행
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // 결과 처리
            if (resultSet.next()) { // 결과가 있는 경우
                List<Integer> courseIdList = getCourseIdList(id);
                DataStudent dataStudent = DataStudent.newBuilder()
                        .setStudentId(id)
                        .setPassword(password)
                        .setName(resultSet.getString("name"))
                        .setMajor(resultSet.getString("major"))
                        .addAllCourseId(courseIdList)
                        .build(); 
                return dataStudent;// "name" 컬럼의 값 반환
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Login Error");
            return null;
        }
        return null; // 로그인 실패 시 null 반환
    }
    private List<Integer> getCourseIdList(int id) {
        // SQL SELECT 쿼리 작성
        String selectQuery = "SELECT course_id FROM STUDENT_COURSE WHERE student_id = ?";
        
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(selectQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, id); // id 값
            
            // 쿼리 실행
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // 결과 처리
            List<Integer> courseIdList = new ArrayList<>();
            while (resultSet.next()) { // 결과가 있는 경우
                courseIdList.add(resultSet.getInt("course_id"));
            }
            return courseIdList;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Error");
            return null;
        }
        return null; // 로그인 실패 시 null 반환
    }
    public String join(DataStudent dataStudent) {
        // SQL INSERT 쿼리 작성
        String insertQuery = "INSERT INTO STUDENT (student_id, password, name, major) VALUES (?, ?, ?, ?)";
        
        // PreparedStatement 생성
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(insertQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, dataStudent.getStudentId()); // id 값
            preparedStatement.setString(2, dataStudent.getPassword()); //  password값
            preparedStatement.setString(3, dataStudent.getName()); // name 값
            preparedStatement.setString(4, dataStudent.getMajor()); // course 값
            // 쿼리 실행
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                return dataStudent.getName() +" was joined successfully!";
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
