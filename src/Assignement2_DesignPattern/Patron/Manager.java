package Assignement2_DesignPattern.Patron;

import Assignement2_DesignPattern.NotificationManagement.NotifierFactory;

import java.util.ArrayList;


public class Manager extends NotifierFactory  {

    private static final ArrayList<Patron> patrons = new ArrayList<>();
    private static final ArrayList<Admin> admins = new ArrayList<>();


    public Manager addPatron (Patron patron){
        patrons.add(patron);
        System.out.println(patron.getPatronFirstName() + " added successfully as a patron");
        return this;
    }

    public  static void addAdmin(Admin admin){
        admins.add(admin);
        System.out.println(admin.getAdminfirstName() + "added successfully as Admin.");
    }

    public void sendNotification(Patron patron, boolean status, String[] channel) {
        if (status) {
            for (String c : channel) {
                NotifierFactory.create(c).SendSubscriptionConfirmation(patron.toString());
            }
        } else {
            for (String c : channel) {
                NotifierFactory.create(c).SendSubscriptionConfirmation("Payment Got Failed. Retry after sometime");
            }

        }
    }

}
