package com.geeksforless.tuleninov.pubsub.homework;

import com.geeksforless.tuleninov.pubsub.homework.Topic;

public interface ServerAPI {

    void registerSubscriber(Topic topic, Subscriber subscriber);

    void unRegisterSubscriber(Topic topic, Subscriber subscriber);

    void notifySubscribers(Topic topic, Message message);

}
