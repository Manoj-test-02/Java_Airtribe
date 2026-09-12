package Assignement2_DesignPattern.PaymentStrategy;

public class UPIPayment implements PaymentStrategy{

    private final String UPIID;
    public UPIPayment(String upi){
        this.UPIID = upi;
    }

    public boolean pay(double Amount){
        System.out.println("[UPI PAYMENT] - Payment Initiated. Total Amount: " + Amount +
                " paying through UPI ID: "+ UPIID);
        return true;
    }
}
