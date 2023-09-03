package com.gmail.yukotsiuba.pubsub;

public class Main {

    public static void main(String[] args) {
        Shop schoolShop = new Shop("School shop");
        schoolShop.addItem("Book");
        schoolShop.addItem("Pen");
        schoolShop.addItem("Magazine");

        Shop deviceShop = new Shop("Device shop");
        deviceShop.addItem("Laptop");
        deviceShop.addItem("PC");
        deviceShop.addItem("Router");

        Subscriber subscriber1 = new ShopSubscriber("SUB_1");
        Subscriber subscriber2 = new ShopSubscriber("SUB_2");
        Subscriber subscriber3 = new ShopSubscriber("SUB_3");

        Publisher schoolShopPub = new ShopPublisher(schoolShop);
        schoolShopPub.subscribe(subscriber1);
        schoolShopPub.subscribe(subscriber2);

        Publisher deviceShopPub = new ShopPublisher(deviceShop);
        deviceShopPub.subscribe(subscriber2);
        deviceShopPub.subscribe(subscriber3);

        schoolShopPub.sendMessage();
        deviceShopPub.sendMessage();

        deviceShopPub.unSubscribe(subscriber3);
        deviceShop.addItem("GPU");

        deviceShopPub.sendMessage();
    }
}
