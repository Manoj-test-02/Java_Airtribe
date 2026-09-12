package com.airtribe.meditrack.paymentstrategy;

import com.airtribe.meditrack.entity.Bill;

public interface MediPaymentStrategy {
     boolean payHospitalBill (Bill bill);

}
