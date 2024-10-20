package io.grpc.login.DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Logger;
import io.grpc.database.DataCourse;
import io.grpc.database.DataStudent;
import oracle.net.aso.l;

import java.util.ArrayList;

public class DataBaseLinked {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private final Logger logger;
    public DataBaseLinked(Logger logger){
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "12345";
        this.logger = logger;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found. Please add the JDBC library to your project.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    private List<Integer> getStudentCourseIdList(int studentId) {
        String selectQuery = "SELECT course_id FROM STUDENT_COURSE WHERE student_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, studentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Integer> courseIdList = new ArrayList<>();
            while (resultSet.next()) { 
                courseIdList.add(resultSet.getInt("course_id"));
            }
            return courseIdList;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return null; 
    }
    public boolean join(DataStudent dataStudent) {
        String insertQuery = "INSERT INTO STUDENT (student_id, password, name, major) VALUES (?, ?, ?, ?)";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }      
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, dataStudent.getStudentId()); // id 값
            preparedStatement.setString(2, dataStudent.getPassword()); //  password값
            preparedStatement.setString(3, dataStudent.getName()); // name 값
            preparedStatement.setString(4, dataStudent.getMajor()); // course 값
            preparedStatement.executeUpdate();
            logger.info("Join Success "+ dataStudent.getStudentId());
            return true;
        } catch (SQLException e) {
            logger.warning("Join SQLException Error");
        } catch (NullPointerException e) {
            logger.warning("Join NullPointerException Error");
        }
        return false;
        
    }
    
    public boolean deleteStudent(int studentId) {
        String deleteQuery = "DELETE FROM STUDENT WHERE student_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, studentId); 
            preparedStatement.executeUpdate();
            logger.info("Delete Success "+studentId);
            return true;
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while deleting student with ID " + studentId);
            e.printStackTrace();
        }
        return false;
        
    }
    public boolean addCourse(int courseId, String courseProfessor, String courseName, List<Integer> courseLimitedList) {
        String insertQuery = "INSERT INTO COURSE (course_id, course_professor, course_name) VALUES (?, ?, ?)";
        String insertQuery2 = "INSERT INTO REQUIRED_COURSE (course_id, REQUIRED_COURSE_ID) VALUES (?,?)";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, courseId); // id 값
            preparedStatement.setString(2, courseProfessor); // professor 값
            preparedStatement.setString(3, courseName); // name 값
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(insertQuery2);
            for(int courseLimited_id : courseLimitedList){
                preparedStatement.setInt(1, courseId);
                preparedStatement.setInt(2, courseLimited_id);
                preparedStatement.executeUpdate();
            }
            logger.info("Success: Added course with ID " + courseId);
            return true;
        } catch (SQLIntegrityConstraintViolationException e) {
            logger.warning("Error: Duplicate entry for courseId " + courseId);
            e.printStackTrace();
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while adding course with ID " + courseId);
            e.printStackTrace();
        } catch (NullPointerException e) {
            logger.warning("Error: NullPointerException occurred while adding course with ID " + courseId);
            e.printStackTrace();
        }
        return false;

    }
    public boolean deleteCourse(int courseId) {
        String deleteQuery = "DELETE FROM COURSE WHERE course_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, courseId);
            preparedStatement.executeUpdate();
            logger.info("Success: Deleted course with ID " + courseId);
            return true;
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while deleting course with ID " + courseId);
            e.printStackTrace();
        }
        return false;
    }
    public boolean enrollCourse(int studentId, int courseId) {
        String insertQuery = "INSERT INTO STUDENT_COURSE (student_id, course_id) VALUES (?, ?)";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, courseId);
            preparedStatement.executeUpdate();
            logger.info("Success: Enrolled in course with ID " + courseId);
            return true;
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while enrolling in course with ID " + courseId);
            e.printStackTrace();
        }
        return false;
    }
    public boolean dropCourse(int studentId, int courseId) {
        String deleteQuery = "DELETE FROM STUDENT_COURSE WHERE student_id = ? AND course_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, courseId);
            preparedStatement.executeUpdate();
            logger.info("Success: Dropped course with ID " + courseId);
            return true;
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while dropping course with ID " + courseId);
            e.printStackTrace();
        }
        return false;
    }
    public DataStudent getStudent(int id) {
        String selectQuery = "SELECT * FROM STUDENT WHERE student_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, id); // id 값
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) { // 결과가 있는 경우
                List<Integer> courseIdList = getStudentCourseIdList(id);
                DataStudent dataStudent = DataStudent.newBuilder().setStudentId(id).setPassword(resultSet.getString("password")).setName(resultSet.getString("name")).setMajor(resultSet.getString("major")).addAllCourseId(courseIdList).build(); 
                return dataStudent;
            }
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while getting student with ID " + id);
            e.printStackTrace();
        }
        return null;
    }
    public DataCourse getCourse(int id) {
        String selectQuery = "SELECT * FROM COURSE WHERE course_id = ?";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, id); // id 값
            ResultSet resultSet = preparedStatement.executeQuery();
            selectQuery = "SELECT REQUIRED_COURSE_ID FROM REQUIRED_COURSE WHERE course_id = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, id);
            ResultSet requiredCourse = preparedStatement.executeQuery();
            List<Integer> requiredCourseList = new ArrayList<>();
            while(requiredCourse.next()){
                requiredCourseList.add(requiredCourse.getInt("required_course_id"));
            }
            if (resultSet.next()) { // 결과가 있는 경우
                DataCourse dataCourse = DataCourse.newBuilder().setCourseId(id).setCourseProfessor(resultSet.getString("course_professor")).setCourseName(resultSet.getString("course_name")).addAllCourseLimited(requiredCourseList).build();
                return dataCourse;
            }
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while getting course with ID " + id);
            e.printStackTrace();
        }
        return null;
    }
    public List<DataStudent> getStudentList() {
        String selectQuery = "SELECT * FROM STUDENT";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<DataStudent> studentList = new ArrayList<>();
            while (resultSet.next()) { 
                List<Integer> courseIdList = getStudentCourseIdList(resultSet.getInt("student_id"));
                DataStudent dataStudent = DataStudent.newBuilder().setStudentId(resultSet.getInt("student_id")).setPassword(resultSet.getString("password")).setName(resultSet.getString("name")).setMajor(resultSet.getString("major")).addAllCourseId(courseIdList).build();
                studentList.add(dataStudent);
            }
            return studentList;
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while getting student list");
            e.printStackTrace();
        }
        return null;
    }
	public List<DataCourse> getCourseList() {
		String selectQuery = "SELECT * FROM COURSE";
        try {
            if (connection == null || connection.isClosed()) {
                throw new SQLException("Connection is not established or is closed");
            }
            preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<DataCourse> courseList = new ArrayList<>();
            while (resultSet.next()) { 
                String selectQuery2 = "SELECT REQUIRED_COURSE_ID FROM REQUIRED_COURSE WHERE course_id = ?";
                preparedStatement = connection.prepareStatement(selectQuery2);
                preparedStatement.setInt(1, resultSet.getInt("course_id"));
                ResultSet requiredCourse = preparedStatement.executeQuery();
                List<Integer> requiredCourseList = new ArrayList<>();
                while(requiredCourse.next()){
                    requiredCourseList.add(requiredCourse.getInt("required_course_id"));
                }
                DataCourse dataCourse = DataCourse.newBuilder().setCourseId(resultSet.getInt("course_id")).setCourseProfessor(resultSet.getString("course_professor")).setCourseName(resultSet.getString("course_name")).addAllCourseLimited(requiredCourseList).build();
                courseList.add(dataCourse);
            }
            return courseList;
        } catch (SQLException e) {
            logger.warning("Error: SQLException occurred while getting course list");
            e.printStackTrace();
        }
        return null;
	}
}
