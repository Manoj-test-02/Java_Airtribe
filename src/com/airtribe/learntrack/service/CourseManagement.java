package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.*;

import java.util.ArrayList;

public class CourseManagement {
    public static ArrayList<Course> newCourse = new ArrayList<>();

    public static void addNewCourse(int coId, String coName, String coDesc, int coDur, boolean coStatus){
        newCourse.add(new Course(coId, coName, coDesc, coDur, coStatus));
    }

    public static void viewAllCourse(){
        for (Course c : newCourse){
            System.out.println("Course Id: " + c.id);
            System.out.println("Course Name: " + c.courseName);
            System.out.println("Course Description: "+ c.courseDescription);
            System.out.println("Course Duration: " + c.courseDuration);
            System.out.println("Course Status: " + c.courseStatus);
        }
    }

    public static void setCourseStatus (int coID, boolean coStatus){
        for (Course c : newCourse){
            if(c.id == coID){
                c.courseStatus = coStatus;
                return;
            }
        }
        System.out.println("Course ID not found");
    }

    public static boolean checkCoursePresence(int courId){
        for (Course c: newCourse){
            if(c.id == courId){
                return true;
            }
        }
        return false;
    }

    public static String getCourseName(int courID){
        for(Course c: newCourse){
            if(c.id == courID){
                return  c.courseName;
            }
        }
        return "Course Not found";

    }
}
