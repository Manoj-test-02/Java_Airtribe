package com.airtribe.meditrack.entity;

import java.time.LocalDate;

public class Appointment {

    private final Patient patient;
    private final Doctor doctor;
    private final LocalDate bookingDate;
    private final LocalDate appointmentDate;
    private final String appointmentTiming;
    private final AppointmentStatus appointmentStatus;

    public Appointment(Patient patient, Doctor doctor, LocalDate bookingDate, LocalDate appointmentDate, String appointmentTiming, AppointmentStatus appointmentStatus) {
        this.patient = patient;
        this.doctor = doctor;
        this.bookingDate = bookingDate;
        this.appointmentDate = appointmentDate;
        this.appointmentTiming = appointmentTiming;
        this.appointmentStatus = appointmentStatus;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public LocalDate getBookingDate() {
        return this.bookingDate;
    }

    public LocalDate getAppointmentDate() {
        return this.appointmentDate;
    }

    public String getAppointmentTiming() {
        return this.appointmentTiming;
    }

    public AppointmentStatus getAppointmentStatus() {return this.appointmentStatus;}

    @Override
    public String toString() {
        return "Appointment: " +
                "Patient=" + this.patient.getFirstName() +
                ", Doctor=" + this.doctor.getFirstName() +
                ", Department=" + this.doctor.getSpeciality() +
                ", bookingDate=" + this.bookingDate +
                ", appointmentDate=" + this.appointmentDate +
                ", appointmentTiming='" + this.appointmentTiming +
                ", appointmentStatus=" + this.appointmentStatus +'\'' +
                '}';
    }
}
