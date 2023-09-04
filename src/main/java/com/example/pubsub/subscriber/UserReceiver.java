package com.example.pubsub.subscriber;

import com.example.pubsub.Message;
import com.example.pubsub.Topic;

public class UserReceiver extends Receiver{
    public UserReceiver(Topic... topics) {
        super(topics);
    }
    @Override
    public void receiveMessage(Topic topic, Message message) {
        System.out.println("user " + topic.name() + " "  + message);
    }
}
