package org.example.builder;

public interface FactoryBuilder<T extends Builder<T>> {

    Builder<T> getBuilder(Class<T> builderClass)
        throws InstantiationException, IllegalAccessException;

}
