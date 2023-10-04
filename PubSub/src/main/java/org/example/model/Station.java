package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Station<T extends Passenger> extends ArrayList implements List{

    private static List<Passenger> instance;

    public static synchronized List<Passenger> getInstance(){
        if (instance == null){
            instance = new Station<>();
        }
        return instance;
    }

}
