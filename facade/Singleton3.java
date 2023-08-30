package facade;

public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {}

    public static Singleton3 getInstance() {
        return instance;
    }

    public void performAction() {
        System.out.println("Action 3");
    }
}
