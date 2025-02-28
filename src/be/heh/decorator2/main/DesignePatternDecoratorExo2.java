package be.heh.decorator2.main;

import be.heh.decorator2.kernels.NotificationBase;
import be.heh.decorator2.models.Notification;
import be.heh.decorator2.models.NotificationEmail;
import be.heh.decorator2.models.NotificationPush;
import be.heh.decorator2.models.NotificationSMS;

public class DesignePatternDecoratorExo2 {
    public static void main(String[] args) {
        System.out.println("=== Test 1 : Email only ===");
        Notification notif1 = new NotificationEmail(new NotificationBase());
        notif1.send("Your order has been shipped.");

        System.out.println("\n=== Test 2 : SMS + Push ===");
        Notification notif2 = new NotificationPush(new NotificationSMS(new NotificationBase()));
        notif2.send("You have received a new message.")

        System.out.println("\n=== Test 3 : Email + SMS + Push ===");
        Notification notif3 = new NotificationPush(new NotificationSMS(new NotificationEmail(new NotificationBase())));
        notif3.send("Security Alert : Suspicious login detected")
    }
}