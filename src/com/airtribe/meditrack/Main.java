package com.airtribe.meditrack;

import Assignement2_DesignPattern.PaymentStrategy.PaymentMethod;
import com.airtribe.meditrack.entity.*;
import com.airtribe.meditrack.paymentstrategy.CreditCardPayment;
import com.airtribe.meditrack.paymentstrategy.MediPaymentMethod;
import com.airtribe.meditrack.paymentstrategy.UPIPayment;
import com.airtribe.meditrack.service.AppointmentService;
import com.airtribe.meditrack.service.DoctorService;
import com.airtribe.meditrack.service.PatientService;
import com.airtribe.meditrack.util.IdGenerator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        String[] channel = {"sms", "whatsapp"};
        IdGenerator instance = IdGenerator.getInstance();
        MediPaymentMethod paymentMethod = new MediPaymentMethod();

        Patient p1 = new Patient(instance.generatePatientId(), "Alex", "Max","test@tets.com", "76363467", "feaver");
        Patient p2 = new Patient(instance.generatePatientId(), "Marry", "Will","test12@tets.com", "763667867", "cold");
        Patient p3 = new Patient(instance.generatePatientId(), "Tech", "vinayak", "tech@gmail.com", "76578990", "Vomit");

        Doctor d1 = new Doctor(instance.getDoctorId(), "Vasanth", "thomas",
                "vst@gmail.com", "653537", "UCD123", Speciality.CARDIOLOGIST);
        Doctor d2 = new Doctor(instance.getDoctorId(), "Bala", "dass",
                "bast@gmail.com", "656337", "UCD1278", Speciality.GENERALMEDICINE);
        Doctor d3 = new Doctor(instance.getDoctorId(), "Moorthy", "kumar",
                "mike@gmail.com", "63683991", "UCD5678", Speciality.PEDIATRICIAN);

        System.out.println("----------------Adding Patients Details--------------------------");
        System.out.println();

        PatientService.addPatient(p1);
        PatientService.addPatient(p2);
        PatientService.addPatient(p3);

        System.out.println();
        System.out.println("----------------Adding Doctor Details--------------------------");
        System.out.println();

        DoctorService.addDoctor(d1);
        DoctorService.addDoctor(d2);
        DoctorService.addDoctor(d3);

        System.out.println();
        System.out.println("----------------Creating CSV File for Doctor Details--------------------------");
        System.out.println();

        DoctorService.saveDoctorstoCSV();

        System.out.println();
        System.out.println("----------------Appointment booking--------------------------");
        System.out.println("----------------Payment  Strategy & Notification--------------------------");
        System.out.println();

        Bill consulationfee = new ConsultBill(instance.getBillId(), p1, 550);
        paymentMethod.setMediPaymentMethod(new UPIPayment("test@okicic"));
        boolean status = paymentMethod.payHospitalBill(consulationfee);
        if(status){
            Appointment a1 = new Appointment(p1, d1, LocalDate.now(),
                    LocalDate.now(),"11:00 AM", AppointmentStatus.CONFIRMED);
            AppointmentService.createAppointment(a1);
            AppointmentService.sendPatientNotification(a1, channel, status);
        } else {
            System.out.println("Unable to create the Appointment.");
        }

        Bill medicalfee = new MedicineBill(instance.getBillId(), p1, 2500);
        paymentMethod.setMediPaymentMethod(new CreditCardPayment("76534574"));
        paymentMethod.payHospitalBill(medicalfee);

    }
}
