package builder;

public class ExpensivePhoneBuilder implements Builder{
    private String functional;
    private int battery;
    private int price;
    private String extraFunctional;

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


    public void extraFunctional(String extraFunctional) {
        this.extraFunctional = extraFunctional;
    }

    ExpensivePhone build(){
        return new ExpensivePhone(functional, battery, price, extraFunctional);
    }
}
