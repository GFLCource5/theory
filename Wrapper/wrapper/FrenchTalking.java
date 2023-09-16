package Wrapper.wrapper;

import Wrapper.Talking;

public class FrenchTalking extends AbsTalking {

    private final String hello = "Bonjour";

    public String getHello() {
        return hello;
    }

    public FrenchTalking(Talking talking) {
        super(talking);
    }

    @Override
    public void printSayHello() {
        super.printSayHello();
        System.out.println("Hello in French will be - " + hello + ".");
    }
}
