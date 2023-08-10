package builder;

import java.util.Objects;

public class ExpensivePhone {
    private String functional;
    private int battery;
    private int price;
    private String extraFunctional;

    public ExpensivePhone(String functional, int battery, int price, String extraFunctional) {
        this.functional = functional;
        this.battery = battery;
        this.price = price;
        this.extraFunctional = extraFunctional;
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

    public String getExtraFunctional() {
        return extraFunctional;
    }

    public void setExtraFunctional(String extraFunctional) {
        this.extraFunctional = extraFunctional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExpensivePhone that)) return false;
        return getBattery() == that.getBattery() && getPrice() == that.getPrice() && Objects.equals(getFunctional(), that.getFunctional()) && Objects.equals(getExtraFunctional(), that.getExtraFunctional());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFunctional(), getBattery(), getPrice(), getExtraFunctional());
    }

    @Override
    public String toString() {
        return "ExpensivePhone{" +
                "functional='" + functional + '\'' +
                ", battery=" + battery +
                ", price=" + price +
                ", extraFunctional='" + extraFunctional + '\'' +
                '}';
    }
}
