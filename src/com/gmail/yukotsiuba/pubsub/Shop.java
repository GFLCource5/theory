package com.gmail.yukotsiuba.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String name;
    private List<String> items;

    public String getName() {
        return name;
    }

    public Shop(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    public void removeItem(String item){
        items.remove(item);
    }


}
