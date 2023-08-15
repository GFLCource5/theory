package com.geeksforless.tuleninov.factory.abstractfactory;

import com.geeksforless.tuleninov.factory.method.BountyProductionService;
import com.geeksforless.tuleninov.factory.method.ProductionService;

public class BountyAbstractFactory extends ProductAbstractFactory{

    @Override
    ProductionService createProduceService() {
        return new BountyProductionService();
    }

    @Override
    DeliveryService createDeliveryService() {
        return new BountyDeliveryService();
    }
}
