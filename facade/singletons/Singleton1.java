package org.example.facade.singletons;

import java.io.Serial;
import java.io.Serializable;

public enum Singleton1 implements Serializable, Cloneable {
  instance;

  public static Singleton1 getInstance() {
    return instance;
  }

  public void print() {
    System.out.println("Action 1");
  }

  @Serial
  private Object readResolve() {
    return instance;
  }
}
