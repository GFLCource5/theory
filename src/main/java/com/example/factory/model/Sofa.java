package com.example.factory.model;

public abstract class Sofa extends Furniture{
    public Sofa() {
    }

    public Sofa(long id, String modelName) {
        super(id, modelName);
    }
}
