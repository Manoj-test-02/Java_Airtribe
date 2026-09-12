package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.entity.Speciality;
import com.airtribe.meditrack.util.CSVUtil;

import java.util.ArrayList;

public class DoctorService {

    private static final ArrayList<Doctor> doctors = new ArrayList<>();

    public static void addDoctor(Doctor doctor) throws Exception{
        if(doctor == null){
            throw new Exception("Doctor Details should not be null");
        }
        doctors.add(doctor);
        System.out.println("Doctor added successfully to the system. Doctor Name: " + doctor.getFirstName()
        + " Department: " +doctor.getSpeciality());
    }

    public static  void removeDoctor (String doctorName){
        for(Doctor d : doctors){
            if((d.getFirstName().contains(doctorName))){
                doctors.remove(d);
                System.out.println("Removed the doctor from the System.");
                return;
            }
        }
        System.out.println("Unable to find the doctor's name.");
    }

    public static String findDoctor(String doctorName){
        for(Doctor d : doctors){
            if((d.getFirstName().contains(doctorName))){
                return d.toString();
            }
        }
        return "Unable to find the Doctor Name.";
    }

    public static ArrayList<Doctor> findDoctor(Speciality speciality){
        ArrayList<Doctor> foundDoctor = new ArrayList<>();
        for(Doctor d : doctors){
            if ((d.getSpeciality()).equals(speciality)) {
                foundDoctor.add(d);
            }
        }
        return  foundDoctor;
    }

    public static void saveDoctorstoCSV(){
        CSVUtil.createDoctorData(doctors);
    }

}
