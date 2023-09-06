package Pubsub;

import Pubsub.message.Message;
import Pubsub.message.Topic;
import Pubsub.pubsub.Subscriber;
import Pubsub.pubsub.Publisher;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final Topic[] TYPES = {Topic.INFO, Topic.WARNING, Topic.ERROR, Topic.NOTICE, Topic.ALERT};

    public static void main(String[] args) {
        Application application = new Application();
        application.createSubscriberList();
        List<Publisher> publishers = application.createPublisherList();

        for (Publisher publisher : publishers) {
            publisher.sendMessage(new Message(publisher.toString()));
        }
    }

    private void createSubscriberList() {
        new Subscriber(Topic.INFO, Topic.WARNING);
        new Subscriber(Topic.WARNING, Topic.NOTICE);
        new Subscriber(Topic.ERROR, Topic.INFO, Topic.ALERT);
        new Subscriber(Topic.ALERT);
    }

    private List<Publisher> createPublisherList() {
        List<Publisher> publishers = new ArrayList<>(TYPES.length);
        for (Topic type : TYPES) {
            publishers.add(new Publisher(type));
        }
        return publishers;
    }
}
