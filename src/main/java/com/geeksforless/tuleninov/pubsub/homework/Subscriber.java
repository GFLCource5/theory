package com.geeksforless.tuleninov.pubsub.homework;

public interface Subscriber {

    void unRegisterSubscriber(Topic topic);

    void notify(Topic topic, Message message);

}
