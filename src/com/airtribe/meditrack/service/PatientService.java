package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.util.CSVUtil;

import java.io.IOException;
import java.util.ArrayList;

public class PatientService {

    private static final ArrayList<Patient> patients = new ArrayList<>();

    public static void addPatient(Patient patient) throws Exception{
        if(patient == null){
            throw  new Exception("Patient details should not be empty");
        }
        patients.add(patient);
        System.out.println("Patient added successfully to the system. Patient Name: " + patient.getFirstName());
    }

    public static String searchPatient (String name){
        for(Patient p : patients){
            if((p.getFirstName()).equals(name)){
                return p.toString();
            }
        }
        return "Unable to get the Patient details for " + name;

    }

    public static String searchPatient (int id){
        for(Patient p : patients){
            if(p.getId()==id){
                return p.toString();
            }
        }
        return "Unable to get the Patient details for patient id: " + id;

    }

    public static void updatePatientName(int id , String name) throws Exception{
        for(Patient p : patients){
            if(p.getId()==id){
                p.setFirstName(name);
                System.out.println("Patient Name updated successfully");
                return;
            }
        }
        throw new Exception("Unable to find the Patient with ID: " +id);

    }

    public static void updatePatientPhone(int id, String mobileNo) throws Exception{
        for(Patient p : patients){
            if(p.getId()==id){
                p.setPhoneNo(mobileNo);
                System.out.println("Patient Mobile number updated successfully");
                return;
            }
        }
        throw new Exception("Unable to find the Patient with ID: " +id);
    }

    public static void savePatientstoCSV () throws IOException {
        CSVUtil.createPatientData(patients);
    }
}
