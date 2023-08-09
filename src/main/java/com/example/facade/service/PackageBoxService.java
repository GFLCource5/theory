package com.example.facade.service;

import com.example.facade.model.MessageBox;
import com.example.facade.model.PackageBox;
import com.example.facade.util.Random;

public class PackageBoxService {

    public static void packaging(MessageBox messageBox) {
        PackageBox packageBox = new PackageBox();
        packageBox.setWeight(Random.generate(1, 20));
        packageBox.setX(Random.generate(5, 20));
        packageBox.setY(Random.generate(5, 20));
        packageBox.setZ(Random.generate(5, 20));
        messageBox.setPackageBox(packageBox);
    }
}
