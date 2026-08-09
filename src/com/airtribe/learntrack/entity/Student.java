package com.airtribe.learntrack.entity;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private String batchId;
    boolean active;
    public Student(int stuid, String stuFirstName, String stuLastName, String stuEmail, String stuBatchID, boolean active){
        super(stuid, stuFirstName, stuLastName, stuEmail);
        this.batchId = stuBatchID;
        this.active = active;
    }

    public Student(int stuid, String stuFirstName, String stuLastName, String stuBatchID, boolean active) {
        super(stuid, stuFirstName, stuLastName);
        this.batchId = stuBatchID;
        this.active = active;
    }

    public String getstuFirstName(){
        return super.getFirstName();
    }

    public int getstuId(){
        return super.getid();
    }

    public String getstuLastName() {
        return  super.getLastName();
    }

    public String getstuEmailId () {
        return super.getEmailId();
    }

    public String getBatchId(){
        return batchId;
    }

    public boolean getstudentStatus() {
        return active;
    }

    public void setStudentStatus(boolean status) {
        this.active = status;
    }


}
