package org.example.builder;

public interface Builder<T> {
  T build();
  Builder<T> setProperty(String name, Object value) throws Exception;
}
