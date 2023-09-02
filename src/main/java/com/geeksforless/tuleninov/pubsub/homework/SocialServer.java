package com.geeksforless.tuleninov.pubsub.homework;

import java.util.List;

class SocialServer implements ServerAPI {

    private final DataBase dataBase;
    private static SocialServer instance;

    private SocialServer() {
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exists. Use getInstance() method.");
        }
        this.dataBase = new DataBase();
    }

    public static SocialServer getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (SocialServer.class) {
            if (instance == null) {
                instance = new SocialServer();
            }
        }

        return instance;
    }

    @Override
    public void registerSubscriber(Topic topic, Subscriber subscriber) {
        dataBase.register(topic, subscriber);
    }

    @Override
    public void unRegisterSubscriber(Topic topic, Subscriber subscriber) {
        dataBase.unRegister(topic, subscriber);
    }

    @Override
    public void notifySubscribers(Topic topic, Message message) {
        List<Subscriber> subscribers = dataBase.getTopicSub().get(topic);
        subscribers.forEach(s -> s.notify(topic, message));
    }
}
