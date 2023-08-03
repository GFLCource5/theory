package com.geeksforless.tuleninov.singleton;

public class Singleton {

    private String type;
    private static Singleton instance;

    private Singleton(String type) {
        // Check if an instance already exists
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exists. Use getInstance() method.");
        }

        sleep();
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

    public void setType(String type) {
        this.type = type;
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
