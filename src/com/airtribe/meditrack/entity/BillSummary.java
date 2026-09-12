package com.airtribe.meditrack.entity;

public class BillSummary {

    private final int billID;
    private final double calculatedAmount;
    private final double taxRate;
    private final double totalAmount;

    public BillSummary(int billID, double calculatedAmount,  double taxRate, double totalAmount) {
        this.billID = billID;
        this.calculatedAmount = calculatedAmount;
        this.taxRate = taxRate;
        this.totalAmount = totalAmount;
    }

    public int getBillID() {
        return billID;
    }

    public double getCalculatedAmount() {
        return calculatedAmount;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotalAmount(){
        return totalAmount;
    }
}
