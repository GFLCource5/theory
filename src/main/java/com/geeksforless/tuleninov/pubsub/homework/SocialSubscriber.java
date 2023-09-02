package com.geeksforless.tuleninov.pubsub.homework;

public class SocialSubscriber implements Subscriber {
    private final String name;

    public SocialSubscriber(String name, Topic... topics) {
        this.name = name;
        for (Topic t : topics) {
            SocialServer.getInstance().registerSubscriber(t, this);
        }
    }

    @Override
    public void unRegisterSubscriber(Topic topic) {
        SocialServer.getInstance().unRegisterSubscriber(topic, this);
    }

    @Override
    public void notify(Topic topic, Message message) {
        System.out.println("Subscriber: " + name+ ", topic: " + topic + ", message: " + message.getMessage());
    }

    @Override
    public String toString() {
        return name;
    }
}
