package com.example.demo.facade.serivce;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.example.demo.facade.model.MessageBox;
import com.example.demo.facade.model.Notification;

public class NotificationService {

    private static final int MIN_DAYS = 5;
    private static final int MAX_DAYS = 12;
    private static final String STATUS = "SENT";
    private static final  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void notify(MessageBox messageBox) {
        Notification notification = new Notification();
        notification.setStatus(STATUS);
        notification.setDeliveryDate(LocalDateTime.now().plusDays(random(MIN_DAYS, MAX_DAYS)));

        messageBox.setNotification(notification);
        System.out.println("Your message sent, expected delivery time  " + notification.getDeliveryDate().format(formatter));
    }

    private static long random(int min, int max) {
        return (long) (min + Math.random() * ((max - min) + 1));
    }
}
