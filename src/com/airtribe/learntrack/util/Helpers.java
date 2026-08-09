package com.airtribe.learntrack.util;

import java.util.Scanner;

public class Helpers {
    public static int studentId = 0;
    public static int courseId = 0;
    public static int enrollmentId = 0;

    public static int getStudentID(){
        return ++studentId;
    }
    public static int getCourseID(){ return  ++courseId;}
    public static int getEnrollmentId() { return ++enrollmentId;}

    public static void welcomeMessage () {
        System.out.println("---------------------------------------------");
        System.out.println("Welcome to Airtribe Student and Course Management System");
        System.out.println("Choose one from the below Options");
        System.out.println("----------------Student Management--------------");
        System.out.println("Type 1 to Add a new student");
        System.out.println("Type 2 to view all the student");
        System.out.println("Type 3 to search a student by ID");
        System.out.println("Type 4 to deactivate a student by ID");
        System.out.println("----------------------------------------------");
        System.out.println("----------------Course Management-------------");
        System.out.println("Type 5 to Add a new course");
        System.out.println("Type 6 to view all the courses");
        System.out.println("Type 7 to Activate or Deactivate the course");
        System.out.println("----------------------------------------------");
        System.out.println("----------------Enrollment Management---------");
        System.out.println("Type 8 to enroll a student in a new course");
        System.out.println("Type 9 to view enrollment for a Student");
        System.out.println("Type 10 to mark enrollment as completed/cancelled");
        System.out.println("----------------------------------------------");
    }

    public static void returnMenu(){
        System.out.println("Enter 11 to exit or Enter 0 to get the Menu back");
    }

    /*
    ** Custom Exception:
    ** This logic will help the application to not to break when the user provides a wrong input
    */
    public static int validateInt  (String message, Scanner sc) throws IllegalArgumentException{
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }

        }

    }
}
