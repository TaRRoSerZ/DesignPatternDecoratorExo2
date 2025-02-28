package be.heh.decorator2.models;

public class NotificationEmail extends NotificationType{
    public NotificationEmail(Notification notification) {
        super("Email", notification);
    }
}
