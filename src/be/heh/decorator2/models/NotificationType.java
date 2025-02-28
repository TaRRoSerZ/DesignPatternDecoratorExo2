package be.heh.decorator2.models;

public abstract class NotificationType implements Notification {
    private String type;
    private Notification notification;

    public NotificationType(String type, Notification notification) {
        this.notification = notification;
        this.type = type;
    }

    @Override
    public String send() {
        String message = notification.send();
        System.out.println(this.type + " sent " + message);
        return message;
    }
}
