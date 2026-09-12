package Assignement2_DesignPattern.NotificationManagement;

public class SMSNotifier implements LibraryNotifier {

    public void SendSubscriptionConfirmation(String message){
        System.out.println("[SMS] Thank you for Subscription." + message);
    }

    public  void SendBookLending(String message){
        System.out.println("[SMS] - Happy Learning. " + message);
    }

    public void SendBookReturn(String message){
        System.out.println("[SMS] " + message);
    }
}
