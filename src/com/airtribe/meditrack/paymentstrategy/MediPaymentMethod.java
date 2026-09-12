package com.airtribe.meditrack.paymentstrategy;

import com.airtribe.meditrack.entity.Bill;

public class MediPaymentMethod {
    private MediPaymentStrategy mediPaymentStrategy;
    public void setMediPaymentMethod (MediPaymentStrategy mediPaymentStrategy){
        this.mediPaymentStrategy = mediPaymentStrategy;
    }

    public boolean payHospitalBill(Bill bill){
        return mediPaymentStrategy.payHospitalBill(bill);
    }
}
