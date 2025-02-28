package be.heh.decorator2.kernels;

import be.heh.decorator2.models.Notification;

public class NotificationBase implements Notification {
    private String content;

    public NotificationBase(String content) {
        this.content = content;
    }

    @Override
    public String send() {
        System.out.println(content);
        return content;
    }
}
