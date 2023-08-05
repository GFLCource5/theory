package Singleton;

public class LazySingleton {

    private static LazySingleton instance;
    private String type;

    private LazySingleton(String type) {
        this.type = type;
    }

    public static LazySingleton getInstance(String type) {
        synchronized (LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton(type);
            }
        }
        return instance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
