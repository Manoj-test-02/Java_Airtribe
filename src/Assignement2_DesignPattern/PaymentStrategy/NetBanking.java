package Assignement2_DesignPattern.PaymentStrategy;

public class NetBanking implements PaymentStrategy{

    private  final String netBankingNumber;

    public NetBanking(String bankNumber){
        this.netBankingNumber = bankNumber;
    }

    public boolean pay(double Amount){
        System.out.println("[NET BANKING] - Payment Initiated. Total Amount: " + Amount +
                " Paying through Bank account number ends with "+ netBankingNumber.substring(netBankingNumber.length()-4));
        return true;
    }
}
