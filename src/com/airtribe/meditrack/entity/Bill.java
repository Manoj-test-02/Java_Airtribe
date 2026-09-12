package com.airtribe.meditrack.entity;

import com.airtribe.meditrack.constants.Constants;

public class Bill {
    private int billID;
    private Patient patient;
    private double consultationFee;
    private double medicineFee;
    private double taxRate;

    public Bill(int billID, Patient patient, double consultationFee, double medicineFee){
        this.billID = billID;
        this.patient = patient;
        this.consultationFee = consultationFee;
        this.medicineFee = medicineFee;
        this.taxRate = Constants.TAX_RATE;
    }

    public double calculatedAmount(){
        return consultationFee+medicineFee;
    }

    public double calculatedTax(){
        return calculatedAmount()*taxRate;
    }

    public double totalAmount(){
        return calculatedAmount() + calculatedTax();
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double getMedicineFee() {
        return medicineFee;
    }

    public void setMedicineFee(double medicineFee) {
        this.medicineFee = medicineFee;
    }

    public BillSummary generateSummary(){
        return new BillSummary(billID, calculatedAmount(), calculatedTax(), totalAmount());
    }
}
