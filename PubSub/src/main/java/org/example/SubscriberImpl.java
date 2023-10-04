package org.example;

import org.example.model.Passenger;
import org.example.model.Station;
import org.example.service.BusTaxi;
import org.example.service.SingleTaxi;
import org.example.service.Taxi;
import org.example.service.TaxiWithWind;

import java.util.List;
import java.util.stream.Collectors;

public class SubscriberImpl implements Subscriber{

    private final Station<Passenger> passengers;

    public SubscriberImpl(Station<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public void transportPassengers() {

        if (!passengers.getInstance().isEmpty()) {
            transportAllGockingsWithWind();
            if (passengers.getInstance().size() == 1){
                transportPassengersSingleTaxi();
            } else {
                transportPassengersBusTaxi();
            }

        }

    }

    private void transportPassengersBusTaxi() {
        getBusTaxi().ride(passengers.getInstance());
        passengers.getInstance().clear();
    }

    private void transportPassengersSingleTaxi() {
        getSingleTaxi().ride(passengers.getInstance());
        passengers.getInstance().clear();
    }

    private void transportAllGockingsWithWind() {
        List<Passenger> gockings = passengers.getInstance().stream().filter(s -> s.getName().contains("Gockings")).collect(Collectors.toList());
        passengers.getInstance().removeAll(gockings);
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
