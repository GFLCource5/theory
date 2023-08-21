package org.example.facade.singletons;

import java.io.Serial;
import java.io.Serializable;

public enum Singleton2 implements Serializable, Cloneable {
  instance;

  public static Singleton2 getInstance() {
    return instance;
  }

  @Serial
  private Object readResolve() {
    return instance;
  }

  public void print() {
    System.out.println("Action 2");
  }
}