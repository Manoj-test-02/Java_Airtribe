package com.airtribe.meditrack.notificationmanagement;

public class SMSNotifier implements MediNotifier{

    public void sendNotification(String message){
        System.out.println("[SMS] -> " + message);
    }

}
