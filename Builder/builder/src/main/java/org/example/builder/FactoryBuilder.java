package org.example.builder;

public interface FactoryBuilder<T extends Builder<T>> {

    public Builder<T> getBuilder(Class<T> builderClass);

}
