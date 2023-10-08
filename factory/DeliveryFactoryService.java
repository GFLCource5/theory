package com.example.demo.factory1;

public abstract class DeliveryFactoryService {
    public DeliveryService delivery(){
        DeliveryService deliveryService = createDeliveryService();
        deliveryService.delivery();
        return deliveryService;
    }
     abstract DeliveryService createDeliveryService();
}
