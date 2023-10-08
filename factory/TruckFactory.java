package com.example.demo.factory1;

public class TruckFactory extends DeliveryFactoryService{
    @Override
    DeliveryService createDeliveryService() {
        return new TruckDeliveryService();
    }
}
