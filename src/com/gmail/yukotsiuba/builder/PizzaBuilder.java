package com.gmail.yukotsiuba.builder;

public interface PizzaBuilder {
    void cheese(String cheese);

    void crust(String crust);

    void sause(String sause);

    void topings(String topings);

    Pizza build();
}
