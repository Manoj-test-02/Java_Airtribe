package com.airtribe.learntrack.entity;

import java.time.LocalDate;

import static com.airtribe.learntrack.service.CourseManagement.getCourseName;

public class Enrollment {
    public int id;
    private int studentid;
    public int courseid;
    public LocalDate enrollmentDate;
    public String status;

    public Enrollment(int enID, int enstuId, int enCouId, LocalDate enDate, String enStatus){
        this.id = enID;
        this.studentid = enstuId;
        this.courseid = enCouId;
        this.enrollmentDate = enDate;
        this.status = enStatus;
    }

    public int getStudentId (){
        return this.studentid;
    }

    public static String getCoursename(int id){
        String courseName = getCourseName(id);
        return courseName;
    }

}
