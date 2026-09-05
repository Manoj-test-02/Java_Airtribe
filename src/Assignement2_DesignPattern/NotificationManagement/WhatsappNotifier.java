package Assignement2_DesignPattern.NotificationManagement;

public class WhatsappNotifier implements LibraryNotifier {

    public void SendSubscriptionConfirmation(String message){
        System.out.println("[WhatsApp] Thank you for Subscription. " + message);
    }

    public  void SendBookLending(String message){
        System.out.println("[WhatsApp]- Happy Learning. " + message);
    }

    public void SendBookReturn(String message){
        System.out.println("[WhatsApp] " + message);
    }
}
