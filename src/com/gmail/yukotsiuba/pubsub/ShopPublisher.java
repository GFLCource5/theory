package com.gmail.yukotsiuba.pubsub;

public class ShopPublisher implements Publisher{
    private Shop shop;

    public ShopPublisher(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        Server.getInstance().registerSubscriber(subscriber, shop);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        Server.getInstance().removeSubscriber(subscriber, shop);
    }

    public void sendMessage() {
        Message message = new Message();
        message.setContent("New items:" + shop.getItems() +
                "\n====================================\n");
        Server.getInstance().sendMessage(shop, message);
    }
}
