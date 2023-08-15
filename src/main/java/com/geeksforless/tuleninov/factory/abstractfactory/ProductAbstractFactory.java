package com.geeksforless.tuleninov.factory.abstractfactory;

import com.geeksforless.tuleninov.factory.method.ProductionService;

public abstract class ProductAbstractFactory {

    public ProductionService produce() {
        ProductionService productionService = createProduceService();
        productionService.produce();
        return productionService;
    }

    public DeliveryService deliver() {
        DeliveryService deliveryService = createDeliveryService();
        deliveryService.deliver();
        return deliveryService;
    }

    abstract ProductionService createProduceService();
    abstract DeliveryService createDeliveryService();

}
