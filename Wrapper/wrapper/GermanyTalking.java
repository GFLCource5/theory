package Wrapper.wrapper;

import Wrapper.Talking;

public class GermanyTalking extends AbsTalking{

    private final String hello = "Hallo";

    public String getHello() {
        return hello;
    }

    public GermanyTalking(Talking talking) {
        super(talking);
    }

    @Override
    public void printSayHello() {
        super.printSayHello();
        System.out.println("Hello in German will be - " + hello + ".");
    }
}
