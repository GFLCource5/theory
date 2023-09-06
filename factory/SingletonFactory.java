package factory;

public class SingletonFactory {

    public static Singleton createSingleton(String type) {
        if ("A".equalsIgnoreCase(type)) {
            return SingletonA.getInstance();
        } else if ("B".equalsIgnoreCase(type)) {
            return SingletonB.getInstance();
        } else {
            throw new IllegalArgumentException("Unsupported Singleton type: " + type);
        }
    }

}
