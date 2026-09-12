package com.airtribe.meditrack.entity;

public class BillFactory {

    public static Bill createBill(String billType, int billId, Patient patients, double amount){
        return switch (billType.toLowerCase()){
            case "consultationfee" -> new ConsultBill(billId, patients, amount);
            case "medicinefee" -> new MedicineBill(billId, patients, amount);
            default -> throw  new IllegalArgumentException("Bill type is not present");
        };
    }
}
