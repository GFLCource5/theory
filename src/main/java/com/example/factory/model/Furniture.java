package com.example.factory.model;

import java.util.Objects;

public abstract class Furniture {
    private long id;
    private String modelName;

    public Furniture() {
    }

    public Furniture(long id, String modelName) {
        this.id = id;
        this.modelName = modelName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return id == furniture.id && Objects.equals(modelName, furniture.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelName);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "id=" + id +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
