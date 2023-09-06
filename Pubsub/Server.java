package Pubsub;

import Pubsub.message.Message;
import Pubsub.message.Topic;
import Pubsub.pubsub.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static volatile Server server;
    private final ConcurrentHashMap<Topic, List<Subscriber>> subscriberHashtable;

    private Server() {
        this.subscriberHashtable = new ConcurrentHashMap<>();
    }

    public static Server getInstance() {
        if (server == null) {
            synchronized (Server.class) {
                if (server == null) {
                    server = new Server();
                }
            }
        }
        return server;
    }

    public void registerSubscriber(Subscriber subscriber, Topic topic) {
        if (!subscriberHashtable.containsKey(topic)) {
            subscriberHashtable.computeIfAbsent(topic, s -> new ArrayList<>()).add(subscriber);
        } else {
            subscriberHashtable.get(topic).add(subscriber);
        }
    }

    public void sendMessage(Topic topic, Message message) {
        List<Subscriber> subscribers = subscriberHashtable.get(topic);
        for (Subscriber s : subscribers) {
            s.receivedMessage(topic, message);
        }
    }
}