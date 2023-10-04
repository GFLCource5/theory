package org.example;

import org.example.model.Passenger;
import org.example.model.Station;

import java.util.Arrays;
import java.util.List;

public class PublisherImpl implements Publisher{

    private final List<Passenger> passengers;

    public PublisherImpl(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public void registerPassengers(Passenger... passengers) {
        this.passengers.addAll(Arrays.asList(passengers));
    }
}
