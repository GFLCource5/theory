package factory;

public class SingletonA implements Singleton{
    private static SingletonA instance = new SingletonA();

    private SingletonA() {
    }

    public static SingletonA getInstance() {
        return instance;
    }

    @Override
    public void doSomething() {
        System.out.println("SingletonA is doing something.");
    }
}
