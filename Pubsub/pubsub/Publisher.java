package Pubsub.pubsub;


import Pubsub.Server;
import Pubsub.message.Message;
import Pubsub.message.Topic;

public class Publisher {

    private final Topic topic;

    public Publisher(Topic topic) {
        this.topic = topic;
    }

    public void sendMessage(Message message) {
        Server.getInstance().sendMessage(topic, message);
    }
}
