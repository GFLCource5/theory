package org.example;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Test;

public class AppTest {

  private Singleton singleton = Singleton.getInstance();

  @Test
  public void singleInstance() {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    assertEquals(singleton1, singleton);
    assertEquals(singleton1, singleton2);
    assertEquals(singleton2, singleton);
  }

  @Test(expected = CloneNotSupportedException.class)
  public void exceptionWhenClone() throws CloneNotSupportedException {
    singleton.clone();
  }

  @Test
  public void deserialization() throws FileNotFoundException {
    String filename = "singleton.dat";
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
      oos.writeObject(singleton);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    Singleton deserialized = null;
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
      deserialized = ((Singleton) ois.readObject());
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    assertEquals(singleton, deserialized);
  }


  @Test(expected = InvocationTargetException.class)
  public void reflectSingleton() throws Exception {
      Class<?> innerClass = Singleton.class.getDeclaredClasses()[0];
      Constructor<?> constructor = innerClass.getDeclaredConstructor(null);
      constructor.setAccessible(true);
      Object o = constructor.newInstance();
  }

}
