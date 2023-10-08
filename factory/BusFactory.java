package com.example.demo.factory1;

public class BusFactory extends DeliveryFactoryService{
    @Override
    DeliveryService createDeliveryService() {
        return new BusDeliveryService();
    }
}
