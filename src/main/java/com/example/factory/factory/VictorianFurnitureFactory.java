package com.example.factory.factory;

import com.example.factory.model.*;

public class VictorianFurnitureFactory implements Factory{
    @Override
    public Table createTable() {
        return new VictorianTable(Double.doubleToLongBits(Math.random()), "victorian table");
    }


 @Override
    public Chair createChair() {
        return new VictorianChair(Double.doubleToLongBits(Math.random()), "victorian chair");
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa(Double.doubleToLongBits(Math.random()), "victorian sofa");
    }

}
