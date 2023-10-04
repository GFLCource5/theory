package org.example.service;

import org.example.model.Passenger;

import java.util.List;
import java.util.stream.Collectors;

public class SingleTaxi implements Taxi {

    @Override
    public void ride(List<Passenger> passengers) {

        String collect = passengers.stream().map(Passenger::getName).collect(Collectors.joining());
        System.out.println("Taxi transport" + collect);

    }
}
