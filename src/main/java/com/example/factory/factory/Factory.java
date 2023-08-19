package com.example.factory.factory;

import com.example.factory.model.Chair;
import com.example.factory.model.Sofa;
import com.example.factory.model.Table;

public interface Factory {
    Table createTable();

    Chair createChair();

    Sofa createSofa();
}
