package singleton;

public class Singleton {
    private String type;
    private static Singleton instance;

    private Singleton(String type) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.type = type;
    }

    public static Singleton getInstance(String type) {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(type);
            }
        }
        return instance;
    }

    public String getType() {
        return type;
    }
}