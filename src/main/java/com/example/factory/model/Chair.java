package com.example.factory.model;


public abstract class Chair extends Furniture {

    public Chair() {
    }

    public Chair(long id, String modelName) {
        super(id, modelName);
    }
}
