package com.example.pubsub.publisher;

import com.example.pubsub.Message;
import com.example.pubsub.Server;
import com.example.pubsub.Topic;

public abstract class Sensor {
    private final Topic topic;

    public Sensor(Topic topic) {
        this.topic = topic;
    }

    public void sendMessage(Message message) {
        Server.getInstance().sendMessage(topic, message);
    }
}
