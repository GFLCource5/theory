package com.geeksforless.tuleninov.factory.method;

public class SnickersFactory extends ProduceFactoryService {

    @Override
    ProductionService createProduceService() {
        return new SnickersProductionService();
    }
}
