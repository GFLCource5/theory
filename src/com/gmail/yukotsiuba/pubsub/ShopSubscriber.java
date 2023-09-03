package com.gmail.yukotsiuba.pubsub;

public class ShopSubscriber implements Subscriber{
    private final String name;

    public ShopSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onMessageReceived(Shop shop, Message message) {
        System.out.printf("Subscrider %s received message from shop %s: %s", this.name, shop.getName(), message.getContent());
    }
}
