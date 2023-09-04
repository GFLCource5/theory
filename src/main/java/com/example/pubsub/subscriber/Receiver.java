package com.example.pubsub.subscriber;

import com.example.pubsub.Message;
import com.example.pubsub.Server;
import com.example.pubsub.Topic;

public abstract class Receiver {

     public Receiver(Topic... topics) {
        for (Topic t : topics) {
            Server.getInstance().registerReceiver(this, t);
        }
     }

    public abstract void receiveMessage(Topic topic, Message message);
}
