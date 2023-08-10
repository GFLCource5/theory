package builder;

import java.util.Objects;

public class Phone {
    private String functional;
    private int battery;
    private int price;

    public Phone(String functional, int battery, int price) {
        this.functional = functional;
        this.battery = battery;
        this.price = price;
    }

    public String getFunctional() {
        return functional;
    }

    public void setFunctional(String functional) {
        this.functional = functional;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone phone)) return false;
        return getBattery() == phone.getBattery() && getPrice() == phone.getPrice() && Objects.equals(getFunctional(), phone.getFunctional());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFunctional(), getBattery(), getPrice());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "functional='" + functional + '\'' +
                ", battery=" + battery +
                ", price=" + price +
                '}';
    }
}
