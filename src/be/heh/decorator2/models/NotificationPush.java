package be.heh.decorator2.models;

public class NotificationPush extends NotificationType{
    public NotificationPush(Notification notification) {
        super("Push", notification);
    }
}
