package com.airtribe.meditrack.entity;

public class ConsultBill extends Bill{

    public ConsultBill(int billId, Patient patient, double consultationFee){
        super(billId, patient, consultationFee, 0);
    }
}
