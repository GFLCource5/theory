package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Station<T extends Passenger>{

    private List<Passenger> instance;

    public synchronized List<Passenger> getInstance(){
        if (instance == null){
            instance = new ArrayList<>();
        }
        return instance;
    }

}
