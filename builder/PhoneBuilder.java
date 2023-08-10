package builder;

public class PhoneBuilder implements Builder {
    private String functional;
    private int battery;
    private int price;

    @Override
    public void functional(String functional) {
        this.functional = functional;
    }

    @Override
    public void battery(int battery) {
        this.battery = battery;
    }

    @Override
    public void price(int price) {
        this.price = price;
    }

    Phone build(){
        return new Phone(functional, battery, price);
    }
}
