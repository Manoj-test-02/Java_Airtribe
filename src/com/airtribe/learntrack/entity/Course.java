package com.airtribe.learntrack.entity;

public class Course {
    public int id;
    public String courseName;
    public String courseDescription;
    public int courseDuration;
    public boolean  courseStatus;

    public Course (int coId, String coName, String coDesc, int coDur, boolean coStatus){
        this.id = coId;
        this.courseName = coName;
        this.courseDescription = coDesc;
        this.courseDuration = coDur;
        this.courseStatus = coStatus;
    }
}
