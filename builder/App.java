package builder;

public class App {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        SmallPizzaBuilder small = new SmallPizzaBuilder();
        MediumPizzaBuilder medium = new MediumPizzaBuilder();
        LargePizzaBuilder large = new LargePizzaBuilder();

        director.setPizzaBuilder(small);
        Pizza pepperoni = director.makePepperoni();
        System.out.println(pepperoni);

        director.setPizzaBuilder(medium);
        Pizza manhattan = director.makeManhattan();
        System.out.println(manhattan);

        director.setPizzaBuilder(large);
        Pizza spicy = director.makeSpicy();
        System.out.println(spicy);
    }
}
