package Facade.service;

import Facade.model.MessageBox;
import Facade.model.PackageBox;

public class PackageBoxService {

    public static void packaging(MessageBox messageBox) {
        PackageBox packageBox = new PackageBox();
        packageBox.setWeight(random(1, 20));
        packageBox.setX(random(5, 10));
        packageBox.setY(random(5, 20));
        packageBox.setZ(random(5, 20));
        messageBox.setPackageBox(packageBox);
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
