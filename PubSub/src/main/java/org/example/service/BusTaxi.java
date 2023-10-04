package org.example.service;

import org.example.model.Passenger;

import java.util.List;
import java.util.stream.Collectors;

public class BusTaxi implements Taxi{
    @Override
    public void ride(List<Passenger> passengers) {
        if (!passengers.isEmpty()) {
            String collect = passengers.stream().map(Passenger::getName).collect(Collectors.joining());
            System.out.println("Bus taxi transport: " + collect);
        }
    }
}
