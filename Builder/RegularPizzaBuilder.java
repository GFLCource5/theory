package com.ykotsiuba.soloveibot.homework;

public class RegularPizzaBuilder implements PizzaBuilder {
    private String cheese;
    private String crust;
    private String sauce;
    private String toppings;

    @Override
    public void cheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public void crust(String crust) {
        this.crust = crust;
    }

    @Override
    public void sause(String sause) {
        this.sauce = sause;
    }

    @Override
    public void topings(String topings) {
        this.toppings = topings;
    }

    @Override
    public Pizza build() {
        return new Pizza(cheese, crust, sauce, toppings);
    }
    
}
