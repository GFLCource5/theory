package com.example.builder;

public class PizzaDirector {
    private AbstractPizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(AbstractPizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePepperoni() {
        return pizzaBuilder.setCheese(true).setSausage(true)
                .setTomatoes(true).createPizza();
    }

    public Pizza makeManhattan() {
        return pizzaBuilder.setCheese(true).setSausage(true)
                .setMushrooms(true).setOlives(true).createPizza();
    }

    public Pizza makeSpicy() {
        return pizzaBuilder.setCheese(true).setSausage(true)
                .setTomatoes(true).setPepper(true).createPizza();
    }
}
