package com.example.pubsub.subscriber;

import com.example.pubsub.Message;
import com.example.pubsub.Topic;

public class LightSwitch extends Receiver {
    public LightSwitch(Topic... topics) {
        super(topics);
    }
    @Override
    public void receiveMessage(Topic topic, Message message) {
        System.out.println("light switch " + topic.name() + ", " + message);
    }
}
