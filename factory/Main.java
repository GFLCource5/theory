package factory;

public class Main {

    public static void main(String[] args) {
        Singleton singletonA = SingletonFactory.createSingleton("A");
        Singleton singletonB = SingletonFactory.createSingleton("B");

        singletonA.doSomething();
        singletonB.doSomething();
    }

}
