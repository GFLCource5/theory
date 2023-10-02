package org.example;

public class Main {
    public static void main(String[] args) {

        Screamer screamer = new Signaling();
        System.out.println(screamer.scream());

        System.out.println("\n");

        Screamer proxy = new ScreamerWithThunder(screamer);
        System.out.println(proxy.scream());

    }
}