package com.example.pubsub;

import com.example.pubsub.subscriber.Receiver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Server {
    private HashMap<Topic, List<Receiver>> receivers;
    private static Server server;

    private Server() {
        this.receivers = new HashMap<>();
    }

    public static Server getInstance() {
        return server == null ? server = new Server() : server;
    }

    public void registerReceiver(Receiver receiver, Topic topic) {
        if (!receivers.containsKey(topic)) {
            ArrayList<Receiver> rs = new ArrayList<>();
            rs.add(receiver);
            receivers.put(topic, rs);
        } else {
            receivers.get(topic).add(receiver);
        }
    }

    public void sendMessage(Topic topic, Message message) {
        List<Receiver> rs = receivers.get(topic);
        for (Receiver receiver : rs) {
            receiver.receiveMessage(topic, message);
        }
    }
}
