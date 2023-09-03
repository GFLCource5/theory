package com.gmail.yukotsiuba.pubsub;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Server {
    private Hashtable<Shop, List<Subscriber>> subscriberHashtable;
    private static Server server;

    private Server() {
        this.subscriberHashtable = new Hashtable<>();
    }

    public static Server getInstance() {
        if (server == null) {
            server = new Server();
        }
        return server;
    }

    public void registerSubscriber(Subscriber subscriber, Shop shop) {
        if (!subscriberHashtable.containsKey(shop)) {
            ArrayList<Subscriber> subscribers = new ArrayList<>();
            subscribers.add(subscriber);
            subscriberHashtable.put(shop, subscribers);
        } else {
            subscriberHashtable.get(shop).add(subscriber);
        }
    }

    public void removeSubscriber(Subscriber subscriber, Shop shop) {
        if (subscriberHashtable.containsKey(shop)) {
            subscriberHashtable.get(shop).remove(subscriber);
        } else {
            System.err.println("Shop not found.");
        }
    }

    public void sendMessage(Shop shop, Message message) {
        List<Subscriber> subscribers = subscriberHashtable.get(shop);
        for (Subscriber s : subscribers) {
            s.onMessageReceived(shop, message);
        }
    }
}
