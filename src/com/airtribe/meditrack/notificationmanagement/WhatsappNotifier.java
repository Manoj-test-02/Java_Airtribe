package com.airtribe.meditrack.notificationmanagement;

public class WhatsappNotifier implements MediNotifier{
    public void sendNotification(String message){
        System.out.println("[WHATSAPP] -> " + message);
    }
}
