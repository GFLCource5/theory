package com.geeksforless.tuleninov.factory.method;

public class FactoryMethodDemo {

    private static ProduceFactoryService produceFactoryService;

    public static void main(String[] args) {
        configuration(Product.SNICKERS);
        produceFactoryService.produce();
        configuration(Product.BOUNTY);
        produceFactoryService.produce();
    }

    private static void configuration(Product product) {
        switch (product) {
            case SNICKERS:
                produceFactoryService = new SnickersFactory();
                break;
            case BOUNTY:
                produceFactoryService = new BountyFactory();
                break;
        }
    }
}
