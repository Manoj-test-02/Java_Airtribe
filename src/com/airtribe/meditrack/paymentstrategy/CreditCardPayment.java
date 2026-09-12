package com.airtribe.meditrack.paymentstrategy;

import com.airtribe.meditrack.entity.Bill;
import com.airtribe.meditrack.entity.BillSummary;

public class CreditCardPayment implements MediPaymentStrategy{

    private final String creditCardNumber;

    public CreditCardPayment(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public boolean payHospitalBill (Bill bill){
        BillSummary bills = bill.generateSummary();

        System.out.println("[CREDIT CARD PAYMENT] - Amount Paid Successfully." + '\n' +
                "Bill id        : " + bills.getBillID() + '\n' +
                "Bill Amount    : " + bills.getCalculatedAmount() + '\n' +
                "Tax Amount     : " + bills.getTaxRate() + '\n' +
                "Total Amount   :" + bills.getTotalAmount());
        return  true;
    }

}
