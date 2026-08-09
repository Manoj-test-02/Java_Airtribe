package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import java.time.LocalDate;
import java.util.ArrayList;

import static com.airtribe.learntrack.service.CourseManagement.checkCoursePresence;
import static com.airtribe.learntrack.service.StudentManagement.checkStudentId;

public class EnrollmentManagement {

    static ArrayList<Enrollment> newEnrollment = new ArrayList<>();

    public static void enrollStudent(int enrID, int enrStuId, int enrCourseId, LocalDate enrDate, String enrStatus){
        boolean isStudentPresent = checkStudentId(enrStuId);
        boolean isCoursePresent = checkCoursePresence(enrCourseId);
        if(isStudentPresent && isCoursePresent){
            newEnrollment.add(new Enrollment(enrID, enrStuId, enrCourseId, enrDate, enrStatus));
        } else {
            System.out.println("Provided Student ID or course ID is not Present");
        }
    }

    public static  void getEnrollementforStudents(int enrStuId){
         boolean studentfound = false;
        for (Enrollment e : newEnrollment){
            if(e.getStudentId() == enrStuId){
                System.out.println("List of all the Enrolled Course for StudentID: " + enrStuId);
                System.out.println("Student Id: " + e.getStudentId());
                System.out.println("Enrolled Course: " + e.getCoursename(e.courseid));
                System.out.println("Enrollment Status: " + e.status);
                studentfound = true;
            }
        }
        if(!studentfound) {
            System.out.println("Provided Student Id is not enrolled to any course");
        }
    }

    public static void setEnrollementStatus (int enrStuId, int enrId, String status){
        boolean studentfound = false;
        for (Enrollment e : newEnrollment){
            if(e.getStudentId() == enrStuId && e.id == enrId) {
                e.status = status;
                studentfound = true;
                System.out.println("Status of the enrollment is updated properly");
                System.out.println("-----------------------");
            }
            }
        if(!studentfound){
            System.out.println("Provided Student Id or Enrollment Id is not found");
        }
        }
}
