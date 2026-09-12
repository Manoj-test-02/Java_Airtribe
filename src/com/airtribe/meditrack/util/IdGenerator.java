package com.airtribe.meditrack.util;

public class IdGenerator {

    private static IdGenerator instance;
    private int patientId = 0;
    private int doctorId = 0;
    private int billId = 0;

    private IdGenerator() {}

    public static IdGenerator getInstance(){
        if(instance == null){
        synchronized (IdGenerator.class) {
            if (instance == null) {
                return new IdGenerator();
            }
        }
        }
        return instance;
    }

    public int generatePatientId() {
        return ++patientId;
    }

    public int getDoctorId(){
        return ++doctorId;
    }
    public int getBillId() {return ++billId;}
}
