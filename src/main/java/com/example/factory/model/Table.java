package com.example.factory.model;

public abstract class Table extends Furniture{
    public Table() {
    }

    public Table(long id, String modelName) {
        super(id, modelName);
    }

}
