package com.geeksforless.tuleninov.pubsub.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DataBase {

    private final ConcurrentMap<Topic, List<Subscriber>> topicSub;

    public DataBase() {
        this.topicSub = new ConcurrentHashMap<>();
    }

    public ConcurrentMap<Topic, List<Subscriber>> getTopicSub() {
        return topicSub;
    }

    public void register(Topic topic, Subscriber subscriber) {
        if (!topicSub.containsKey(topic)) {
            List<Subscriber> sub = new ArrayList<>();
            sub.add(subscriber);
            topicSub.put(topic, sub);
        } else {
            topicSub.get(topic).add(subscriber);
        }
    }

    public void unRegister(Topic topic, Subscriber subscriber) {
        List<Subscriber> subscribers = topicSub.get(topic);
        subscribers.remove(subscriber);
    }
}
