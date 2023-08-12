package Facade.service;

import Facade.model.MessageBox;
import Facade.model.Notification;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class NotificationService {

    public static void addNotification(MessageBox messageBox) {
        Notification notification = new Notification();
        switch (random(1, 3)) {
            case 1:
                notification.setStatus("Packed.");
            case 2:
                notification.setStatus("Waiting for packing.");
            case 3:
                notification.setStatus("Sent.");
        }
        notification.setDeliveryDate(LocalDateTime.now().plus(2, ChronoUnit.DAYS));
        messageBox.setNotification(notification);
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
