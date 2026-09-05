package Assignement2_DesignPattern.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy{
    private final String creditCardNumber;

    public CreditCardPayment(String CardNumber){
        this.creditCardNumber = CardNumber;
    }

    public boolean pay(double Amount){
        System.out.println("[CREDIT CARD] - Payment Initiated. Total Amount: " + Amount +
                " Paying through Credit Card ending with "+ creditCardNumber.substring(creditCardNumber.length()-4));
        return true;
    }
}
