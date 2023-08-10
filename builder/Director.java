package builder;

public class Director {
    public void createPhone(PhoneBuilder phoneBuilder){
        phoneBuilder.functional("call");
        phoneBuilder.battery(2000);
        phoneBuilder.price(4000);
    }

    public void createExpensivePhone(ExpensivePhoneBuilder expensivePhoneBuilder){
        expensivePhoneBuilder.functional("call");
        expensivePhoneBuilder.battery(2000);
        expensivePhoneBuilder.price(4000);
        expensivePhoneBuilder.extraFunctional("FaceId");
    }
}
