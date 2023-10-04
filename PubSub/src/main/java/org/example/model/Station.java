package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Station<T extends Passenger> extends ArrayList implements List {

    private Station<T> instance;

    public synchronized Station<T> getInstance(){
        if (instance == null){
            instance = new Station<>();
        }
        return instance;
    }

}
