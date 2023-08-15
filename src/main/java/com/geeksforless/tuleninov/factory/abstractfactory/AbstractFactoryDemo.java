package com.geeksforless.tuleninov.factory.abstractfactory;

import com.geeksforless.tuleninov.factory.method.Product;

public class AbstractFactoryDemo {

    private static ProductAbstractFactory productAbstractFactory;

    public static void main(String[] args) {
        configuration(Product.SNICKERS);
        productAbstractFactory.produce();
        productAbstractFactory.deliver();
        configuration(Product.BOUNTY);
        productAbstractFactory.produce();
        productAbstractFactory.deliver();
    }

    private static void configuration(Product product) {
        switch (product) {
            case SNICKERS:
                productAbstractFactory = new SnickersAbstractFactory();
                break;
            case BOUNTY:
                productAbstractFactory = new BountyAbstractFactory();
                break;
        }
    }
}
