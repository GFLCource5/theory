package com.geeksforless.tuleninov.facade.serivce;

import com.geeksforless.tuleninov.facade.model.MessageBox;

public class NpShoppingImpl {
    public static void send(MessageBox messageBox) {
        PackageBoxService.packaging(messageBox);
        DeliveryService.deliveryMethod(messageBox);
        NotificationService.notify(messageBox);
        MessageBoxService.addMessageBox(messageBox);
    }
}
