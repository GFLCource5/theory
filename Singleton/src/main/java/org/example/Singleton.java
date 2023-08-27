package org.example;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {

  private Singleton() {

  }

  public static Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

  protected Object readResolve() throws ObjectStreamException {
    return SingletonHolder.INSTANCE;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Not permitted to clone Singleton");
  }

  private static class SingletonHolder {

    private static final Singleton INSTANCE = new Singleton();

  }


}
