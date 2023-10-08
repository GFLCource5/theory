package com.example.demo.factory1;

import com.example.demo.factory.*;

public class ApplicationFactoryMethod {
    private static DeliveryFactoryService deliveryFactoryService;

    public static void main(String[] args) {
        configuration(DeliveryType.BUS);
        deliveryFactoryService.delivery();
    }

    private static void configuration(DeliveryType deliveryType) {
        switch (deliveryType) {
            case TRUCK:
               deliveryFactoryService = new TruckFactory();
            case BUS:
                deliveryFactoryService = new BusFactory();
                break;

        }
    }
}
