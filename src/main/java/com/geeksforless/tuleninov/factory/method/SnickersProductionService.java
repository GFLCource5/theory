package com.geeksforless.tuleninov.factory.method;

public class SnickersProductionService implements ProductionService {

    @Override
    public void produce() {
        System.out.println("Produce the snickers bar");
    }
}
