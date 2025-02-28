package be.heh.decorator2.models;

public class NotificationSMS extends NotificationType{
    public NotificationSMS(Notification notification) {
        super("SMS", notification);
    }
}
