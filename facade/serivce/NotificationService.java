package facade.serivce;



import facade.model.MessageBox;
import facade.model.Notification;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotificationService {
    private static final String status = "Send";

    private static final int min = 1;
    private static final int max = 10;
    private static final DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy.MM.dd") ;

    public static void notify(MessageBox messageBox) {
        Notification notification = new Notification();
        notification.setStatus(status);
        notification.setDeliveryDate(LocalDateTime.now().plusDays(random(min, max)));
        messageBox.setNotification(notification);
        System.out.println("Your message: " + notification.getStatus() + ". delivery date: " + notification.getDeliveryDate().format(date));
    }

    private static long random(int min, int max) {
        return (long) (min + Math.random() * ((max - min) + 1));
    }
}
