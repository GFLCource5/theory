package com.ykotsiuba.soloveibot.homework;

public class Domain {
    
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder regularPizzaBuilder = new RegularPizzaBuilder();
        director.prepareRegularPizza(regularPizzaBuilder);
        Pizza regularPizza = regularPizzaBuilder.build();

        FancyPizzaBuilder fancyPizzaBuilder = new FancyPizzaBuilder();
        director.prepareFancyPizza(fancyPizzaBuilder);
        FancyPizza fancyPizza = fancyPizzaBuilder.build();
        
        System.out.println(regularPizza);
        System.out.println(fancyPizza);

    }
}
