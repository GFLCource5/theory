package com.geeksforless.tuleninov.facade.serivce;

import com.geeksforless.tuleninov.facade.model.MessageBox;
import com.geeksforless.tuleninov.facade.model.Notification;

import java.time.LocalDateTime;

public class NotificationService {

    public static void notify(MessageBox messageBox) {
        String status = "sent";
        int year = random(2023, 2023);
        int month = random(1,12);
        int dayOfMonth = random(1,28);
        int hour = random(0,23);
        int minute = random(0,59);
        int second = random(0,59);

        Notification notification = new Notification();
        notification.setStatus(status);
        notification.setDeliveryDate(LocalDateTime.of(year,month,dayOfMonth,hour,minute,second));

        messageBox.setNotification(notification);

        System.out.println("Status: " + notification.getStatus() + ", date of delivery: " + notification.getDeliveryDate().toString());
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
