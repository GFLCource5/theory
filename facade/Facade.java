package facade;

public class Facade {
    private Singleton1 singleton1;
    private Singleton2 singleton2;
    private Singleton3 singleton3;

    public Facade() {
        singleton1 = Singleton1.getInstance();
        singleton2 = Singleton2.getInstance();
        singleton3 = Singleton3.getInstance();
    }

    public void performAction() {
        singleton1.performAction();
        singleton2.performAction();
        singleton3.performAction();
    }
}
