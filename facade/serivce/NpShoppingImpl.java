package facade.serivce;


import facade.model.MessageBox;

public class NpShoppingImpl {
    public static void send(MessageBox messageBox) {
        PackageBoxService.packaging(messageBox);
        DeliveryService.deliveryMethod(messageBox);
        MessageBoxService.addMessageBox(messageBox);
        NotificationService.notify(messageBox);
    }
}
