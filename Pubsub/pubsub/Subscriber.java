package Pubsub.pubsub;

import Pubsub.Server;
import Pubsub.message.Message;
import Pubsub.message.Topic;

public class Subscriber {

    public Subscriber(Topic... topics) {
        for (Topic t : topics) {
            Server.getInstance().registerSubscriber(this, t);
        }
    }

    public void receivedMessage(Topic topic, Message message) {
        switch (topic) {
            case INFO -> System.out.println("Info topic - " + message.getMessage());
            case WARNING -> System.out.println("Warning topic - " + message.getMessage());
            case ERROR -> System.out.println("Error topic - " + message.getMessage());
            case NOTICE -> System.out.println("Notice topic - " + message.getMessage());
            case ALERT -> System.out.println("Alert topic - " + message.getMessage());
        }
    }
}
