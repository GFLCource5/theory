package org.example;

import org.example.model.Passenger;
import org.example.model.Station;

public class SubscriberImpl implements Subscriber{

    private final Station<Passenger> passengers;

    public SubscriberImpl(Station<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public void transportPassengers() {

    }
}
