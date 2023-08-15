package com.geeksforless.tuleninov.factory.abstractfactory;

import com.geeksforless.tuleninov.factory.method.ProductionService;
import com.geeksforless.tuleninov.factory.method.SnickersProductionService;

public class SnickersAbstractFactory extends ProductAbstractFactory {

    @Override
    ProductionService createProduceService() {
        return new SnickersProductionService();
    }

    @Override
    DeliveryService createDeliveryService() {
        return new SnickersDeliveryService();
    }
}
