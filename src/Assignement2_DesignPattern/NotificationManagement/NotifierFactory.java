package Assignement2_DesignPattern.NotificationManagement;

public  class NotifierFactory {
    public static LibraryNotifier create(String method){
        return switch (method.toLowerCase()){
            case "sms" -> new SMSNotifier();
            case "whatsapp" -> new WhatsappNotifier();
            default -> throw new IllegalArgumentException("Unknown channel: " + method);
        };
    }
}
