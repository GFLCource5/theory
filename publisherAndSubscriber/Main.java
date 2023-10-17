package publisherAndSubscriber;

public class Main {
    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new ConcreteSubscriber("Підписник 1");
        Subscriber subscriber2 = new ConcreteSubscriber("Підписник 2");

        publisher.attach(subscriber1);
        publisher.attach(subscriber2);

        publisher.notifySubscribers("Нове повідомлення!");

        publisher.detach(subscriber2);

        publisher.notifySubscribers("Ще одне повідомлення!");
    }
}
