package com.gmail.yukotsiuba.facade.serivce;

import com.gmail.yukotsiuba.facade.model.MessageBox;

public class NpShoppingImpl {
    public static void send(MessageBox messageBox) {
        PackageBoxService.packaging(messageBox);
        DeliveryService.deliveryMethod(messageBox);
        MessageBoxService.addMessageBox(messageBox);
        NotificationService.notify(messageBox);
    }
}
