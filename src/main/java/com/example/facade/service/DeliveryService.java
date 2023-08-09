package com.example.facade.service;

import com.example.facade.model.Delivery;
import com.example.facade.model.MessageBox;
import com.example.facade.util.Random;

public class DeliveryService {

    public static void deliveryMethod(MessageBox messageBox) {
        Delivery delivery = new Delivery();
        switch (Random.generate(1, 3)) {
            case 1:
                delivery.setType("Sea");
                break;
            case 2:
                delivery.setType("Truck");
                break;
            case 3:
                delivery.setType("Fly");
                break;
        }
        messageBox.setDelivery(delivery);
    }


}
