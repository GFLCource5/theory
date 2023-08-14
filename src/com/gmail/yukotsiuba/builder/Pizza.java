package com.gmail.yukotsiuba.builder;

public class Pizza {
    private String cheese;
    private String crust;
    private String sauce;
    private String toppings;

    public Pizza(String cheese, String crust, String sauce, String toppings) {
        this.cheese = cheese;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "Crust='" + crust + '\'' +
                ", Sauce='" + sauce + '\'' +
                ", Toppings='" + toppings + '\'' +
                ", Cheese='" + cheese + '\'';
    }
}
