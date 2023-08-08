package com.example.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main( String[] args ) {
        testThreadSafe();
        testReflectionSafe();
    }

    private static void testThreadSafe() {
        Thread thread1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println("thread 1 " + singleton.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println("thread 2 " + singleton.hashCode());
        });
        System.out.println("starting threads");
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("threads finished\n");
    }

    private static void testReflectionSafe() {
        System.out.println("trying to create new instance using reflection");
        Class<Singleton> clazz = Singleton.class;
        try {
            Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton s = constructor.newInstance();
            System.out.println(s.getClass());
        } catch (NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
