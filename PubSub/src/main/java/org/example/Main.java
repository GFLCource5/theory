package org.example;

import org.example.model.Passenger;
import org.example.model.Station;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bus station start work!");
        Publisher publisher = new PublisherImpl(Station.getInstance());
        Subscriber subscriber = new SubscriberImpl(Station.getInstance());

        publisher.registerPassengers(new Passenger("Team Cleski"));
        subscriber.transportPassengers();
        System.out.println("\n\n");

        publisher.registerPassengers(new Passenger("Team Cleski Junior"), new Passenger("Sten Gockings"));
        subscriber.transportPassengers();
        System.out.println("\n\n");


        publisher.registerPassengers(new Passenger("Team Cleski"), new Passenger("Team Cleski Junior"), new Passenger("Sten Gockings"));
        subscriber.transportPassengers();
        System.out.println("\n\n");

        publisher.registerPassengers(new Passenger("Martha Gockings"), new Passenger("Team Cleski"), new Passenger("Team Cleski Junior"), new Passenger("Sten Gockings"));
        subscriber.transportPassengers();
        System.out.println("\n\n");

    }
}