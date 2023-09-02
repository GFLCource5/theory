package com.geeksforless.tuleninov.pubsub.homework;

public class SocialPublisher implements Publisher{

    private final Topic topic;

    public SocialPublisher(Topic topic) {
        this.topic = topic;
    }

    @Override
    public void notifySubscribers(Message message) {
        SocialServer.getInstance().notifySubscribers(topic, message);
    }
}
