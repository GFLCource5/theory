package com.gmail.yukotsiuba.builder;

public class Director {
    
    public void prepareRegularPizza(PizzaBuilder builder) {
        builder.cheese("Mozzarella");
        builder.crust("Thin crust");
        builder.sause("Tomato sauce");
        builder.topings("Mushrooms");
    }

    public void prepareFancyPizza(FancyPizzaBuilder builder) {
        builder.cheese("Parmezan");
        builder.crust("Thick crust");
        builder.sause("Pesto sauce");
        builder.topings("Spinach");
        builder.extraIngredient("Prosciutto");
    }
}
