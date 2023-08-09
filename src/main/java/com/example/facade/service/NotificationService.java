package com.example.facade.service;

import com.example.facade.model.MessageBox;
import com.example.facade.model.Notification;
import com.example.facade.util.Random;

import java.time.LocalDateTime;

public class NotificationService {
    public static void notification(MessageBox messageBox) {
        Notification notification = new Notification();
        notification.setStatus("Sent");
        notification.setDeliveryDate(LocalDateTime.now().plusMinutes(Random.generate(1000, 15000)));
        messageBox.setNotification(notification);
    }
}
