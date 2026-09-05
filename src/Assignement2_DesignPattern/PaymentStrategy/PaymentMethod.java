package Assignement2_DesignPattern.PaymentStrategy;


public class PaymentMethod {

    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public boolean checkout(Double amount){
        return paymentStrategy.pay(amount);
    }

}
