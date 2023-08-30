package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FabricImpl<T extends Object> implements Fabric {

  private static Map<Class, Object> map = new ConcurrentHashMap<>();

  @Override
  public Object getClazz(Class clazz) {
    if (isImplemetationSingleton(clazz)) {
      return map.merge(Singleton.class, getInstanceClazz(clazz), (clazzOld, clazzNew) -> clazzOld);
    } else {

      Singleton singleton = new Singleton() {
        @Override
        public String text() {
          return "default class";
        }
      };
      return map.merge(Singleton.class, singleton, (clazzOld, clazzNew) -> clazzOld);
    }

  }

  private boolean isImplemetationSingleton(Class clazz) {
    Class[] interfaces = clazz.getInterfaces();
    for (Class interfaze : interfaces) {
      if (interfaze.equals(Singleton.class)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void clear() {
    map = new ConcurrentHashMap<>();
    System.out.println("insert new map!!\n");
  }

  private Object getInstanceClazz(Class<T> clazz) {
    if (clazz.equals(SingletonImpl.class)) {
      return (Singleton) new SingletonImpl();
    } else if (clazz.equals(SingletonImplTwo.class)) {
      return (Singleton) new SingletonImplTwo();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
