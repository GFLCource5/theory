package org.example.builder;

import java.util.HashMap;
import java.util.function.Function;

public class FactoryBuilderImpl<T> implements FactoryBuilder {

  private static HashMap<Class, Builder> builders = new HashMap();

  public Builder<T> getBuilder(final Class builderClass) {

    return builders.computeIfAbsent(builderClass, s -> reflectBuilder(builderClass));


  }

  private Builder<T> reflectBuilder(Class builderClass) {
    return null;
  }
}
