package io.grpc.login.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.StringTokenizer;

import io.grpc.database.DataCourse;
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
    public boolean checkStudentId(int id) {
        // SQL SELECT 쿼리 작성
        String selectQuery = "SELECT * FROM STUDENT WHERE student_id = ?";
        
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
            if (resultSet.next()) { // 결과가 있는 경우
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }
    public boolean deleteStudent(int id) {
        // SQL DELETE 쿼리 작성
        String deleteQuery = "DELETE FROM STUDENT WHERE student_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(deleteQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, id); // id 값
            
            // 쿼리 실행
            int rowsDeleted = preparedStatement.executeUpdate();
            
            if (rowsDeleted > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean checkCourseId(int id) {
        // SQL SELECT 쿼리 작성
        String selectQuery = "SELECT * FROM COURSE WHERE course_id = ?";
        
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
            if (resultSet.next()) { // 결과가 있는 경우
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }
    public String addCourse(int courseId, String courseProfessor, String courseName, List<Integer> courseLimitedList) {
        // SQL INSERT 쿼리 작성
        String insertQuery = "INSERT INTO COURSE (course_id, course_professor, course_name) VALUES (?, ?, ?)";
        String insertQuery2 = "INSERT INTO REQUIRED_COURSE (course_id, REQUIRED_COURSE_ID) VALUES (?,?)";
        // PreparedStatement 생성
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }

            preparedStatement = connection.prepareStatement(insertQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, courseId); // id 값
            preparedStatement.setString(2, courseProfessor); // professor 값
            preparedStatement.setString(3, courseName); // name 값
            // 쿼리 실행
            int rowsInserted = preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(insertQuery2);

            for(int courseLimited_id : courseLimitedList){
                preparedStatement.setInt(1, courseId);
                preparedStatement.setInt(2, courseLimited_id);
                preparedStatement.executeUpdate();
            }

            if (rowsInserted > 0) {
                return "Success insert course" + courseId;
            } else {
                return "Fail insert course" + courseId;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            // 중복 키 예외 처리
            return "Error: Duplicate entry for courseId " + courseId;
        } catch (SQLException e) {
            // 다른 SQL 예외 처리
            e.printStackTrace();
            return "Error: SQLException";
        } catch (NullPointerException e) {
            // NullPointerException 처리
            e.printStackTrace();
            return "Error: NullPointerException";
        }

        
    }
    public String deleteCourse(int courseId) {
        // SQL DELETE 쿼리 작성
        String deleteQuery = "DELETE FROM COURSE WHERE course_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(deleteQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, courseId);
            
            // 쿼리 실행
            int rowsDeleted = preparedStatement.executeUpdate();
            
            // 삭제된 행이 없는 경우 처리
            if (rowsDeleted > 0) {
                return "Success: Deleted course with ID " + courseId;
            } else {
                return "No course found with ID " + courseId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: SQLException occurred while deleting course with ID " + courseId;
        }
    }
    public String enrollCourse(int studentId, int courseId) {
        String insertQuery = "INSERT INTO STUDENT_COURSE (student_id, course_id) VALUES (?, ?)";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(insertQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, courseId);
            int rowsInserted = preparedStatement.executeUpdate();
            
            if (rowsInserted > 0) {
                return "Success: Enrolled in course with ID " + courseId;
            } else {
                return "Error: Failed to enroll in course with ID " + courseId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: SQLException occurred while enrolling in course with ID " + courseId;
        }
    }
    public String dropCourse(int studentId, int courseId) {
        String deleteQuery = "DELETE FROM STUDENT_COURSE WHERE student_id = ? AND course_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(deleteQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, courseId);
            
            // 쿼리 실행
            int rowsDeleted = preparedStatement.executeUpdate();
            
            // 삭제된 행이 없는 경우 처리
            if (rowsDeleted > 0) {
                return "Success: Dropped course with ID " + courseId;
            } else {
                return "No course found with ID " + courseId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: SQLException occurred while dropping course with ID " + courseId;
        }
    }
    public DataStudent getStudent(int id) {
        // SQL SELECT 쿼리 작성
        String selectQuery = "SELECT * FROM STUDENT WHERE student_id = ?";
        
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
            if (resultSet.next()) { // 결과가 있는 경우
                List<Integer> courseIdList = getCourseIdList(id);
                DataStudent dataStudent = DataStudent.newBuilder()
                        .setStudentId(id)
                        .setPassword(resultSet.getString("password"))
                        .setName(resultSet.getString("name"))
                        .setMajor(resultSet.getString("major"))
                        .addAllCourseId(courseIdList)
                        .build(); 
                return dataStudent;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public DataCourse getCourse(int id) {
        // SQL SELECT 쿼리 작성
        String selectQuery = "SELECT * FROM COURSE WHERE course_id = ?";
        
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            
            preparedStatement = connection.prepareStatement(selectQuery);
            // 쿼리 파라미터 설정
            preparedStatement.setInt(1, id); // id 값
            
            // 쿼리 실행
            ResultSet resultSet = preparedStatement.executeQuery();
            
            selectQuery = "SELECT REQUIRED_COURSE_ID FROM REQUIRED_COURSE WHERE course_id = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, id);
            ResultSet requiredCourse = preparedStatement.executeQuery();
            List<Integer> requiredCourseList = new ArrayList<>();
            while(requiredCourse.next()){
                requiredCourseList.add(requiredCourse.getInt("required_course_id"));
            }
             // 결과 처리
            if (resultSet.next()) { // 결과가 있는 경우
                DataCourse dataCourse = DataCourse.newBuilder()
                        .setCourseId(id)
                        .setCourseProfessor(resultSet.getString("course_professor"))
                        .setCourseName(resultSet.getString("course_name"))
                        .addAllCourseLimited(requiredCourseList)
                        .build();
                return dataCourse;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    

}
