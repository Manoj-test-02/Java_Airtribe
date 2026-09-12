package com.airtribe.meditrack.notificationmanagement;

public class NotifierFactory {

    public static MediNotifier notify(String channel) {
        return switch (channel.toLowerCase()) {
            case "sms" -> new SMSNotifier();
            case "whatsapp" -> new WhatsappNotifier();
            default -> throw new IllegalArgumentException("There's no such notification channel");
        };
    }
}
