package com.airtribe.meditrack.entity;

public class MedicineBill extends Bill{

    public MedicineBill (int billId, Patient patient, double medicineBill){
        super(billId, patient, 0 , medicineBill);
    }
}
