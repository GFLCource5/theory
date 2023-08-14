package com.gmail.yukotsiuba.singletone;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Using constructor of Singleton is not allowed.");
        }
    }

    public static synchronized Singleton getInstanse() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of Singleton is not allowed.");
    }

    protected Object readResolve() {
        return instance;
    }
}