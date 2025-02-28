package be.heh.decorator2.models;

public class NotificationEmail extends NotificationType{
    public NotificationEmail(String content, String type, Notification notification) {
        super(content, type, notification);
    }
}
