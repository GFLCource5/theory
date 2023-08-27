package org.example.builder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FactoryBuilderImpl<T> implements FactoryBuilder {

  public FactoryBuilderImpl() {
  }

  @Override
  public Builder getBuilder(Class builderClass)
      throws InstantiationException, IllegalAccessException {
    return new ReflectBuilder<T>(builderClass);
  }

  public static class ReflectBuilder<T> implements Builder<T> {

    private final T instance;

    public ReflectBuilder(Class<T> clazz) throws InstantiationException,
        IllegalAccessException {
      super();
      this.clazz = clazz;
      this.instance = clazz.newInstance();
    }

    private final Class<?> clazz;

    public Builder<T> setProperty(String name, Object value) throws Exception {
      Method method = clazz.getMethod("set"
              + name.substring(0, 1).toUpperCase() + name.substring(1),
          value.getClass());
      method.invoke(instance, value);
      return this;
    }

    @Override
    public T build() {
      return instance;
    }
  }
}
