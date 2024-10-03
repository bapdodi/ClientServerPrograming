package io.grpc.login.Part1_제공화일;

import java.util.StringTokenizer;

public class Course {
    protected int couseNum;
    protected String couseProfessor;
    protected String couseName;
    protected int couseLimited;

    public Course(String inputString) {

        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        this.couseNum = Integer.parseInt(stringTokenizer.nextToken());
        this.couseProfessor = stringTokenizer.nextToken();
        this.couseName = stringTokenizer.nextToken();
        if(stringTokenizer.hasMoreTokens()){
            this.couseLimited = Integer.parseInt(stringTokenizer.nextToken());
        }
        else{
            this.couseLimited = 0;
        }
        
    }
}
