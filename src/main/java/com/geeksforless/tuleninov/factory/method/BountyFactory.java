package com.geeksforless.tuleninov.factory.method;

public class BountyFactory extends ProduceFactoryService {

    @Override
    ProductionService createProduceService() {
        return new BountyProductionService();
    }
}
