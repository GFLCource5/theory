package com.example.factory.factory;

import com.example.factory.model.*;

public class ModernFurnitureFactory implements Factory {
    @Override
    public Table createTable() {
        return new ModernTable(Double.doubleToLongBits(Math.random()), "modern table");
    }

    @Override
    public Chair createChair() {
        return new ModernChair(Double.doubleToLongBits(Math.random()),"modern chair");
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa(Double.doubleToLongBits(Math.random()),"modern sofa");
    }
}
