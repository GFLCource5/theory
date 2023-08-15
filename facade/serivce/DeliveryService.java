package facade.serivce;


import facade.model.Delivery;
import facade.model.MessageBox;

public class DeliveryService {

    public static MessageBox deliveryMethod(MessageBox messageBox) {
        Delivery delivery = new Delivery();
        switch (random(1, 3)) {
            case 1:
                delivery.setType("See");
                break;
            case 2:
                delivery.setType("Truck");
                break;
            case 3:
                delivery.setType("Fly");
                break;
        }
        messageBox.setDelivery(delivery);
        return messageBox;
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
