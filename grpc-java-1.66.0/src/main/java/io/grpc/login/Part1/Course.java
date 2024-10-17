package io.grpc.login.Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Course {
    protected int courseId;
    protected String courseProfessor;
    protected String courseName;
    protected List<Integer> courseLimitedList;

    public Course(String inputString) {

        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        this.courseId = Integer.parseInt(stringTokenizer.nextToken());
        this.courseProfessor = stringTokenizer.nextToken();
        this.courseName = stringTokenizer.nextToken();
        if(stringTokenizer.hasMoreTokens()){
            this.courseLimitedList.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
    }
    public Course() {
        courseLimitedList = new ArrayList<Integer>();
    }
    public String toString() {
        String stringReturn = this.courseId + " " + this.courseProfessor + " " + this.courseName;
        for (int i = 0; i < this.courseLimitedList.size(); i++) {
            stringReturn = stringReturn + " " + this.courseLimitedList.get(i);
        }
        return stringReturn;
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseProfessor() {
        return courseProfessor;
    }
    public void setCourseProfessor(String courseProfessor) {
        this.courseProfessor = courseProfessor;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public List<Integer> getCourseLimitedList() {
        return courseLimitedList;
    }
    public void setCourseLimitedList(List<Integer> courseLimitedList) {
        this.courseLimitedList = courseLimitedList;
    }
}
