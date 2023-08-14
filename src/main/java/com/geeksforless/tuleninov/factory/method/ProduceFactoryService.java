package com.geeksforless.tuleninov.factory.method;

public abstract class ProduceFactoryService {

    public ProductionService produce() {
        ProductionService productionService = createProduceService();
        productionService.produce();
        return productionService;
    }

    abstract ProductionService createProduceService();
}
