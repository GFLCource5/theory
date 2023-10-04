package org.example;

import org.example.model.Passenger;
import org.example.model.Station;

import java.util.Arrays;

public class PublisherImpl implements Publisher{

    private final Station<Passenger> passengers;

    public PublisherImpl(Station<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public void registerPassengers(Passenger... passengers) {
        this.passengers.getInstance().addAll(Arrays.asList(passengers));
    }
}
