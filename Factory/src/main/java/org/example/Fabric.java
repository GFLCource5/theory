package org.example; 

public interface Fabric<T extends Object> {
  T getClazz(Class clazz);
  void clear();
}
