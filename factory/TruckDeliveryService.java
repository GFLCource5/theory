package com.example.demo.factory1;

public class TruckDeliveryService implements DeliveryService{
    @Override
    public void delivery() {
        System.out.println("Deliver by truck");
    }
}
