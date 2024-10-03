package io.grpc.login.Part1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CourseList {
    protected ArrayList<Course> vCourse;

    public CourseList(String courseFileName) throws FileNotFoundException, IOException {
		BufferedReader objStudentFile = new BufferedReader(new FileReader(courseFileName));
		this.vCourse = new ArrayList<Course>();
		while (objStudentFile.ready()) {
			String stuInfo = objStudentFile.readLine();
			if (!stuInfo.equals("")) {
				this.vCourse.add(new Course(stuInfo));
			}
		}
		objStudentFile.close();
	}
}
