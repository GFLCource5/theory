package org.example.singleton;

import java.io.Serial;
import java.io.Serializable;

public enum Singleton implements Serializable, Cloneable {
  instance;
  public static Singleton getInstance(){
    return instance;
  }

  @Serial
  private Object readResolve() {
    return instance;
  }
}
