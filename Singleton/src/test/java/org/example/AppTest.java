package org.example;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

public class AppTest {


    @Test
    public void singleInstance() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertEquals(singleton1, singleton);
        assertEquals(singleton1, singleton2);
        assertEquals(singleton2, singleton);
    }

    @Test(expected = CloneNotSupportedException.class)
    public void exceptionWhenClone() throws CloneNotSupportedException {
        Singleton singleton = Singleton.getInstance();
        singleton.clone();
    }

    @Test
    public void deserialization() throws FileNotFoundException {
        Singleton serialized = Singleton.getInstance();
        String filename = "singleton.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(serialized);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Singleton deserialized = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            deserialized = ((Singleton) ois.readObject());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(serialized, deserialized);
    }

}
