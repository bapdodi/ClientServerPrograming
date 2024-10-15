package io.grpc.login.Part1;
import java.io.Serializable;
import java.util.List;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	protected int studentId;
    protected String name;
    protected String department;
    protected List<Integer> completedCoursesList;

    public Student(int studentId, String name, String department, List<Integer> completedCoursesList) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.completedCoursesList = completedCoursesList;
    }
    public boolean match(int studentId) {
        return this.studentId == studentId;
    }
    public String getName() {
        return this.name;
    }
    public List<Integer> getCompletedCourses() {
        return this.completedCoursesList;
    }
    public String toString() {
        String stringReturn = this.studentId + " " + this.name + " " + this.department;
        for (int i = 0; i < this.completedCoursesList.size(); i++) {
            stringReturn = stringReturn + " " + this.completedCoursesList.get(i);
        }
        return stringReturn;
    }
}
