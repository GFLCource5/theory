package factory;

public class SingletonB implements Singleton{

    private static SingletonB instance = new SingletonB();

    private SingletonB() {
    }

    public static SingletonB getInstance() {
        return instance;
    }

    @Override
    public void doSomething() {
        System.out.println("SingletonB is doing something.");
    }

}
