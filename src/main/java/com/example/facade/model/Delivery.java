package com.example.facade.model;

public class Delivery {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Delivery delivery)) return false;
        return getType() != null ? getType().equals(delivery.getType()) : delivery.getType() == null;
    }

    @Override
    public int hashCode() {
        return getType() != null ? getType().hashCode() : 0;
    }
}
