package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Appointment;
import com.airtribe.meditrack.notificationmanagement.NotifierFactory;

import java.util.ArrayList;

public class AppointmentService {

    private static final ArrayList<Appointment> appointments = new ArrayList<>();

    public static void createAppointment (Appointment appointment) throws  Exception {
        if(appointment == null){
            throw new Exception("Appointment should not be null");
        }
        appointments.add(appointment);
        System.out.println("Appointment Created successfully." + '\n' + "Patient: " + appointment.getPatient().getFirstName()
        + '\n' + "Doctor: " + appointment.getDoctor().getFirstName() + '\n' +
                "Appointment Timing: "+ appointment.getAppointmentTiming());
    }

    public static ArrayList<Appointment> getAllAppointments(){
        return appointments;
    }

    public static ArrayList<Appointment> getAppointmentsByPatient(String patientName) throws Exception{
        ArrayList<Appointment> patientAppointment = new ArrayList<>();
        if(patientName.isEmpty()){
            throw new Exception("Patient Name should not be empty");
        }
        for(Appointment a : appointments){
            if((a.getPatient().getFirstName()).contains(patientName)){
                patientAppointment.add(a);
            }
        }
        return patientAppointment;
    }

    public static ArrayList<Appointment> getAppointmentsByDoctor (String doctorName) throws Exception {
        ArrayList<Appointment> foundAppointments = new ArrayList<>();
        if(doctorName.isEmpty()){
            throw new Exception("Doctor name should not be empty");
        }
        for(Appointment a : appointments){
            if ((a.getDoctor().getFirstName()).contains(doctorName)) {
                foundAppointments.add(a);
            }
        }
        return  foundAppointments;
    }

    public static void sendPatientNotification(Appointment appointment, String[] channel, boolean status){
        if(status){
            for(String c: channel) {
                NotifierFactory.notify(c).sendNotification(appointment.toString());
            }
        } else {
            System.out.println("Appointment Failed. Please try again");
        }
    }
}
