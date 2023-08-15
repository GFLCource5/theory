package facade.serivce;


import facade.model.MessageBox;
import facade.model.PackageBox;

public class PackageBoxService {

    public static MessageBox packaging(MessageBox messageBox) {
        PackageBox packageBox = new PackageBox();
        packageBox.setWeight(random(1, 20));
        packageBox.setX(random(5, 20));
        packageBox.setY(random(5, 20));
        packageBox.setZ(random(5, 20));
        messageBox.setPackageBox(packageBox);
        return messageBox;
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
