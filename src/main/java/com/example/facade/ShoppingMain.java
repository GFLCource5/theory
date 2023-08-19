package com.example.facade;

import com.example.facade.model.MessageBox;
import com.example.facade.service.MessageBoxService;
import com.example.facade.service.NpShoppingImpl;

import java.util.HashMap;
import java.util.UUID;

public class ShoppingMain {

    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox();
        messageBox.setType("Phone");
        messageBox.setFrom("Artem");
        messageBox.setTo("Taras");
        messageBox.setId("kasjdbcjb");
        MessageBox messageBox2 = new MessageBox();
        messageBox2.setType("Phone");
        messageBox2.setFrom("Artem");
        messageBox2.setTo("Taras");
        messageBox2.setId("kasjdbcjb");
        MessageBox messageBox3 = new MessageBox();
        messageBox3.setType("Phone");
        messageBox3.setFrom("Artem");
        messageBox3.setTo("Taras");
        messageBox3.setId("kasjdbcjb");

        NpShoppingImpl.send(messageBox);
        NpShoppingImpl.send(messageBox2);
        NpShoppingImpl.send(messageBox3);

        printResult();
    }

    private static void printResult() {
        HashMap<UUID, MessageBox> allMessageBox = MessageBoxService.getAllMessageBox();
        allMessageBox.forEach((key, value) -> System.out.println("id: " + key + "   "
                + "delivery type: " + value.getDelivery().getType() + "   "
                + "delivery weight: " + value.getPackageBox().getWeight() + "   "
                + "delivery date: " + value.getNotification().getDeliveryDate().toLocalDate()));
    }
}
