package Facade.model;

import java.util.Objects;

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
        if (o == null || getClass() != o.getClass()) return false;
        PackageBox that = (PackageBox) o;
        return x == that.x &&
                y == that.y &&
                z == that.z &&
                weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, weight);
    }
}
