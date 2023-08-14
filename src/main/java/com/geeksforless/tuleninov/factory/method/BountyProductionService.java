package com.geeksforless.tuleninov.factory.method;

public class BountyProductionService implements ProductionService {

    @Override
    public void produce() {
        System.out.println("Produce the bounty bar");
    }
}
