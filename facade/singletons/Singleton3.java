package org.example.facade.singletons;

import java.io.Serial;
import java.io.Serializable;

public enum Singleton3 implements Serializable, Cloneable {
  instance;

  public static Singleton3 getInstance() {
    return instance;
  }

  public void print() {
    System.out.println("Action 3");
  }

  @Serial
  private Object readResolve() {
    return instance;
  }
}