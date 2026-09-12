package com.airtribe.meditrack.util;

import com.airtribe.meditrack.constants.Constants;
import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.entity.Patient;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVUtil {

    public static void createDoctorData (ArrayList<Doctor> doctors){
        try(PrintWriter writer = new PrintWriter(new FileWriter(Constants.DOCTOR_CSV_PATH))) {
            writer.println("id,firstName,lastName,mailId,phoneNo,speciality");
            for(Doctor doctor : doctors){
                writer.println(doctor.getId() + "," +
                        doctor.getFirstName() + "," +
                        doctor.getLastName() + "," +
                        doctor.getMailId() + "," +
                        doctor.getPhoneNo() + "," +
                        doctor.getSpeciality());
            }
            System.out.println("Doctor CSV File Created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating Doctors csv file. " + e.getMessage());
        }
    }

    public static  void createPatientData (ArrayList<Patient> patients){
        try(PrintWriter writer = new PrintWriter(new FileWriter(Constants.PATIENT_CSV_PATH))){
            writer.println("id,firstName,lastName,mailId,phoneNo");
            for(Patient patient : patients){
                writer.println(patient.getId() + "," +
                                patient.getFirstName() + "," +
                                patient.getLastName() + "," +
                                patient.getMailId() + "," +
                                patient.getPhoneNo()
                );
            }

        } catch (Exception e) {
           System.out.println("Error creating patients csv file. " + e.getMessage());
        }
    }
}
