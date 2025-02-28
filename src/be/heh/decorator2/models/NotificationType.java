package be.heh.decorator2.models;

public abstract class NotificationType implements Notification {
    private String content;
    public String type;
    public Notification notification;

    public NotificationType(String content, String type,  Notification notification) {
        this.content = content;
        this.type = type;
        this.notification = notification;
    }

    @Override
    public void send() {

    }
}
