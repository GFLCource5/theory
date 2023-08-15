package com.geeksforless.tuleninov.factory.abstractfactory;

public class SnickersDeliveryService implements DeliveryService {

    @Override
    public void deliver() {
        System.out.println("Deliver the snickers bar");
    }
}
