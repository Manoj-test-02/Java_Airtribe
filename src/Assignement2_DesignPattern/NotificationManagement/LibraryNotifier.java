package Assignement2_DesignPattern.NotificationManagement;

 public interface LibraryNotifier {

    void SendSubscriptionConfirmation(String Message);
    void SendBookLending(String Message);
    void SendBookReturn (String Message);
}
