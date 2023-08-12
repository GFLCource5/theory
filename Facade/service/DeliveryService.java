package Facade.service;

import Facade.model.Delivery;
import Facade.model.MessageBox;

public class DeliveryService {

    public static void deliveryMethod(MessageBox messageBox) {
        Delivery delivery = new Delivery();
        switch (random(1, 3)) {
            case 1 -> delivery.setType("See");
            case 2 -> delivery.setType("Truck");
            case 3 -> delivery.setType("Fly");
        }
        messageBox.setDelivery(delivery);
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
