package Facade.service;

import Facade.model.MessageBox;

import java.util.HashMap;
import java.util.UUID;

public class MessageBoxService {

    private static final HashMap<UUID, MessageBox> messageBoxHashMap = new HashMap<>();

    public static void addMessageBox(MessageBox messageBox) {
        messageBoxHashMap.put(UUID.randomUUID(), messageBox);
    }

    public static HashMap<UUID, MessageBox> getAllMessageBox() {
        return messageBoxHashMap;
    }
}
