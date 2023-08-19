package com.example.factory;

import com.example.factory.factory.Factory;
import com.example.factory.factory.ModernFurnitureFactory;
import com.example.factory.factory.VictorianFurnitureFactory;

public class App {
    public static void main(String[] args) {
        Factory factory = new ModernFurnitureFactory();

        System.out.println(factory.createTable());
        System.out.println(factory.createChair());
        System.out.println(factory.createSofa());


        factory = new VictorianFurnitureFactory();

        System.out.println(factory.createTable());
        System.out.println(factory.createChair());
        System.out.println(factory.createSofa());
    }
}
