package com.airtribe.learntrack.ui;

import java.time.LocalDate;
import java.util.Scanner;

import static com.airtribe.learntrack.service.CourseManagement.*;
import static com.airtribe.learntrack.service.CourseManagement.addNewCourse;
import static com.airtribe.learntrack.service.EnrollmentManagement.*;
import static com.airtribe.learntrack.service.StudentManagement.*;
import static com.airtribe.learntrack.util.Helpers.*;
import static com.airtribe.learntrack.util.Helpers.welcomeMessage;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static  int studentId;
    public static void main(String[] args)  {

        welcomeMessage();
        boolean applive = true;
            while (applive) {
                int choosen = validateInt("Enter the Value to Choose Option: ", sc);
                switch (choosen) {
                    case 0:
                        welcomeMessage();
                        break;
                    case 1:
                        int generatestuID = getStudentID();
                        System.out.print("Enter the First Name of the Student: ");
                        String studentFirstName = sc.nextLine();
                        System.out.print("Enter the Last Name of the Student: ");
                        String studentLastName = sc.nextLine();
                        System.out.print("Enter the Mail Id of the Student: ");
                        String studentMailId = sc.nextLine();
                        System.out.print("Enter the Batch Id of the Student: ");
                        String studnetBatchId = sc.nextLine();
                        System.out.print("Enter the Student active status of the Student (Type true/ false): ");
                        boolean studentActive = sc.nextBoolean();
                        if (studentMailId.isBlank() || studentMailId == null) {
                            addStudent(generatestuID, studentFirstName, studentLastName, studnetBatchId, studentActive);
                        } else {
                            addStudent(generatestuID, studentFirstName, studentLastName, studentMailId, studnetBatchId, studentActive);
                        }
                        System.out.println("To add more student enter 1 again in choose option field");
                        break;
                    case 2:
                        getallStudent();
                        returnMenu();
                        break;
                    case 3:
                        studentId = validateInt("Enter the Student Id: ", sc);
                        searchbyStudentId(studentId);
                        returnMenu();
                        break;
                    case 4:
                        studentId = validateInt("Enter the Student Id: ", sc);
                        System.out.print("Enter the Student active status of the Student (Type true/ false): ");
                        boolean stustatus = sc.nextBoolean();
                        setStuStatusbyId(studentId, stustatus);
                        returnMenu();
                        break;
                    case 5:
                        int generateCouseId = getCourseID();
                        System.out.print("Enter the Course Name: ");
                        String newCourseName = sc.nextLine();
                        System.out.print("Enter the Course Description: ");
                        String newCourseDesc = sc.nextLine();
                        int courseDuration = validateInt("Enter the Course Duration in weeks: ", sc);
                        System.out.print("Enter the course Status: ");
                        boolean courseStatus = sc.nextBoolean();
                        addNewCourse(generateCouseId, newCourseName, newCourseDesc, courseDuration, courseStatus);
                        System.out.println("New Course " + newCourseName + "added succesfully");
                        returnMenu();
                        break;
                    case 6:
                        viewAllCourse();
                        returnMenu();
                        break;
                    case 7:
                        int courseId = validateInt("Enter the Course Id to change the Status: ", sc);
                        System.out.print("Enter the status to be changed: ");
                        boolean newStatus = sc.nextBoolean();
                        setStuStatusbyId(courseId, newStatus);
                        returnMenu();
                        break;
                    case 8:
                        int enrId = getEnrollmentId();
                        studentId = validateInt("Enter the Student Id to enroll: ", sc);
                        System.out.println("----------------------------------");
                        System.out.println("----------Available Courses-------");
                        viewAllCourse();
                        System.out.println("----------------------------------");
                        int coId = validateInt("Enter the Course Id to be enrolled: ", sc);
                        System.out.print("Enter the Course Status (ACTIVE/COMPLETED/CANCELLED): ");
                        String costatus = sc.nextLine();
                        enrollStudent(enrId, studentId, coId, LocalDate.now(), costatus);
                        returnMenu();
                        break;
                    case 9:
                        studentId = validateInt("Enter the Student Id to view the Enrolled Courses: ", sc);
                        getEnrollementforStudents(studentId);
                        returnMenu();
                        break;
                    case 10:
                        studentId = validateInt("Enter the Student Id to change the Enrollment Status: ", sc);
                        int enrlId = validateInt("Enter the Enrollment Id to change the Enrollment Status: ", sc);
                        System.out.print("Enter the Course Status (ACTIVE/COMPLETED/CANCELLED): ");
                        String status = sc.nextLine();
                        setEnrollementStatus(studentId, enrlId, status);
                        returnMenu();
                        break;
                    case 11:
                        applive = false;
                        break;
                }
            }
    }
}
