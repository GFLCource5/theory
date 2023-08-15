package com.geeksforless.tuleninov.factory.abstractfactory;

public class BountyDeliveryService implements DeliveryService {

    @Override
    public void deliver() {
        System.out.println("Deliver the bounty bar");
    }
}
