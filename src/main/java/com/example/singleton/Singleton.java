package com.example.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Not permitted to construct with reflection");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
