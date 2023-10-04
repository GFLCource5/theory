package org.example;

import org.example.model.Passenger;
import org.example.service.BusTaxi;
import org.example.service.SingleTaxi;
import org.example.service.Taxi;
import org.example.service.TaxiWithWind;

import java.util.List;
import java.util.stream.Collectors;

public class SubscriberImpl implements Subscriber{

    private final List<Passenger> passengers;

    public SubscriberImpl(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public void transportPassengers() {

        if (!passengers.isEmpty()) {
            transportAllGockingsWithWind();
            if (passengers.size() == 1){
                transportPassengersSingleTaxi();
            } else {
                transportPassengersBusTaxi();
            }

        }

    }

    private void transportPassengersBusTaxi() {
        getBusTaxi().ride(passengers);
        passengers.clear();
    }

    private void transportPassengersSingleTaxi() {
        getSingleTaxi().ride(passengers);
        passengers.clear();
    }

    private void transportAllGockingsWithWind() {
        List<Passenger> gockings = passengers.stream().filter(s -> s.getName().contains("Gockings")).collect(Collectors.toList());
        passengers.removeAll(gockings);
        getTaxiWithWind().ride(gockings);
    }

    private Taxi getTaxiWithWind() {
        return  new TaxiWithWind();
    }

    private Taxi getSingleTaxi(){
        return new SingleTaxi();
    }

    private Taxi getBusTaxi() {
        return new BusTaxi();
    }

}
