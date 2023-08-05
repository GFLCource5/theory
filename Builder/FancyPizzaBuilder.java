package com.ykotsiuba.soloveibot.homework;

public class FancyPizzaBuilder implements PizzaBuilder{
    private String cheese;
    private String crust;
    private String sauce;
    private String toppings;
    private String extraIngredient;

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

    public void extraIngredient(String extraIngredient) {
        this.extraIngredient = extraIngredient;
    }

    @Override
    public FancyPizza build() {
        return new FancyPizza(cheese, crust, sauce, toppings, extraIngredient);
    }
}
