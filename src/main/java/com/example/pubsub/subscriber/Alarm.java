package com.example.pubsub.subscriber;

import com.example.pubsub.Message;
import com.example.pubsub.Topic;

public class Alarm extends Receiver{
    public Alarm(Topic... topics) {
        super(topics);
    }
    @Override
    public void receiveMessage(Topic topic, Message message) {
        System.out.println("alarm " + topic.name() + " "  + message);
    }
}
