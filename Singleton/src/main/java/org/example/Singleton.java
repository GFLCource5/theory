package org.example;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {

  private final static Object object = new Object();

  public static Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

  @Serial
  protected Object readResolve() throws ObjectStreamException {
    return SingletonHolder.INSTANCE;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Not permitted to clone Singleton");
  }

  private static class SingletonHolder {

    private static final Singleton INSTANCE = new Singleton();

    private SingletonHolder() {
      if (SingletonHolder.INSTANCE != null) {
        synchronized (object) {
          if (SingletonHolder.INSTANCE != null) {
            throw new UnsupportedOperationException("Say no to reflection");
          }
        }
      } else {
        throw new UnsupportedOperationException("Say no to reflection");
      }
    }

  }

}
