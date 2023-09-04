package com.example.pubsub.subscriber;

import com.example.pubsub.Message;
import com.example.pubsub.Topic;

public class SecurityReceiver extends Receiver{
    public SecurityReceiver(Topic... topics) {
        super(topics);
    }
    @Override
    public void receiveMessage(Topic topic, Message message) {
        System.out.println("security " + topic.name() + " " + message);
    }
}
