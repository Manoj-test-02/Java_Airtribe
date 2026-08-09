package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Person;
import com.airtribe.learntrack.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    static ArrayList<Person> list = new ArrayList<>();

    public static void addStudent (int stuid, String stuFirstName, String stuLastName, String stuEmail, String stuBatchID, boolean active) {
            list.add(new Student(stuid, stuFirstName, stuLastName, stuEmail, stuBatchID, active));

    }
    public static void addStudent (int stuid, String stuFirstName, String stuLastName, String stuBatchID, boolean active) {
            list.add(new Student(stuid, stuFirstName, stuLastName, stuBatchID, active));
    }

    public static void getallStudent (){
        for(Person p : list){
            Student s = (Student) p;
            System.out.println("Student ID: " + s.getstuId() + " " + "First Name: " + s.getstuFirstName()
            + " " + "Last Name: " + s.getstuLastName() + " " + "Mail ID: " +s.getstuEmailId()
            + " " + "Student Batch Id: " + s.getBatchId() + " " + "Is student active: " + s.getstudentStatus());
        }
    }

    public static void searchbyStudentId (int id){
        for (Person p : list) {
            Student s = (Student) p;
            if (s.getstuId() == id) {
                System.out.println("Student ID: " + s.getstuId() + " " + "First Name: " + s.getstuFirstName()
                        + " " + "Last Name: " + s.getstuLastName() + " " + "Mail ID: " + s.getstuEmailId()
                        + " " + "Student Batch Id: " + s.getBatchId() + " " + "Is student active: " + s.getstudentStatus());
                return;
            }
        }
        System.out.println("Student with the given Id is not Present");
    }

    public static void setStuStatusbyId(int id, boolean status){
        for(Person p : list){
            Student s = (Student) p;
            if(s.getstuId() == id){
                s.setStudentStatus(status);
                return;
            }
        }
        System.out.println("Unable to update the status for the mentioned Student.");
    }

    public static boolean checkStudentId(int stuid){
        for(Person p: list){
            Student s = (Student) p;
            if(s.getstuId() == stuid){
                return true;
            }
        }
        return false;
    }
}
