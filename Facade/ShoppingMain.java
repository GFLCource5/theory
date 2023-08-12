package Facade;

import Facade.model.MessageBox;
import Facade.service.MessageBoxService;
import Facade.service.NpShoppingImpl;

import java.util.HashMap;
import java.util.UUID;

public class ShoppingMain {

    public static void main(String[] args) {
        MessageBox firstMessageBox = createFirstMessageBox();
        MessageBox secondMessageBox = createSecondMessageBox();
        NpShoppingImpl.send(firstMessageBox);
        NpShoppingImpl.send(secondMessageBox);

        HashMap<UUID, MessageBox> allMessageBox = MessageBoxService.getAllMessageBox();
        for (MessageBox messageBox : allMessageBox.values()) {
            System.out.println(messageBox);
        }
    }

    private static MessageBox createFirstMessageBox() {
        MessageBox messageBox = new MessageBox();
        messageBox.setType("Phone");
        messageBox.setFrom("Artem");
        messageBox.setTo("Taras");
        return messageBox;
    }

    private static MessageBox createSecondMessageBox() {
        MessageBox messageBox = new MessageBox();
        messageBox.setType("Pen");
        messageBox.setFrom("Taras");
        messageBox.setTo("Artem");
        return messageBox;
    }
}
