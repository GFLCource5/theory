package Singleton;

public class Singleton {

    private volatile static Singleton instance;
    private String type;

    private Singleton(String type) {
        this.type = type;
    }

    public static Singleton getInstance(String type) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(type);
                }
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
