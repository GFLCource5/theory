package com.geeksforless.tuleninov.facade.model;

public class PackageBox {
    private int x;
    private int y;
    private int z;
    private int weight;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackageBox)) return false;

        PackageBox that = (PackageBox) o;

        if (getX() != that.getX()) return false;
        if (getY() != that.getY()) return false;
        if (getZ() != that.getZ()) return false;
        return getWeight() == that.getWeight();
    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        result = 31 * result + getZ();
        result = 31 * result + getWeight();
        return result;
    }
}
