package com.example.facade.service;

import com.example.facade.model.Delivery;
import com.example.facade.model.MessageBox;

public class DeliveryService {

    public static void deliveryMethod(MessageBox messageBox) {
        Delivery delivery = new Delivery();
        int weight = messageBox.getPackageBox().getWeight();
        delivery.setType(weight < 11 ? "Plane" : (weight < 21 ? "Truck" : "Ship"));
        messageBox.setDelivery(delivery);
    }
}
