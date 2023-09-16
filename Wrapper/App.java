package Wrapper;

import Wrapper.wrapper.FrenchTalking;
import Wrapper.wrapper.GermanyTalking;

public class App {

    public static void main(String[] args) {
        Talking talking = new SomeTalking();

        Talking frenchTalking = new FrenchTalking(talking);
        Talking germanyTalking = new GermanyTalking(talking);

        talking.printSayHello();
        System.out.println("******");
        frenchTalking.printSayHello();
        System.out.println("******");
        germanyTalking.printSayHello();
    }
}
