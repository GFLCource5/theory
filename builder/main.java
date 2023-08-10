package builder;

public class main {
    public static void main(String[] args) {
        Director director = new Director();
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        director.createPhone(phoneBuilder);
        Phone phone = phoneBuilder.build();
        System.out.println(phone);

       ExpensivePhoneBuilder expensivePhoneBuilder = new ExpensivePhoneBuilder();
       director.createExpensivePhone(expensivePhoneBuilder);
       ExpensivePhone expensivePhone = expensivePhoneBuilder.build();
       System.out.println(expensivePhone);
    }
}
