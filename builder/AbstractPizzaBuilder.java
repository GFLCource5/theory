package builder;

public abstract class AbstractPizzaBuilder {
    private Size size;
    private boolean cheese;
    private boolean sausage;
    private boolean tomatoes;
    private boolean pepper;
    private boolean mushrooms;
    private boolean olives;

    public void setSize(Size size) {
        this.size = size;
    }

    public AbstractPizzaBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public AbstractPizzaBuilder setSausage(boolean sausage) {
        this.sausage = sausage;
        return this;
    }

    public AbstractPizzaBuilder setTomatoes(boolean tomatoes) {
        this.tomatoes = tomatoes;
        return this;
    }

    public AbstractPizzaBuilder setPepper(boolean pepper) {
        this.pepper = pepper;
        return this;
    }

    public AbstractPizzaBuilder setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }

    public AbstractPizzaBuilder setOlives(boolean olives) {
        this.olives = olives;
        return this;
    }

    public Pizza createPizza() {
        Pizza pizza = new Pizza();
        pizza.setSize(this.size);
        pizza.setCheese(this.cheese);
        pizza.setSausage(this.sausage);
        pizza.setTomatoes(this.tomatoes);
        pizza.setPepper(this.pepper);
        pizza.setMushrooms(this.mushrooms);
        pizza.setOlives(this.olives);
        return pizza;
    }
}
