package com.example.demo.facade.serivce;

import com.example.demo.facade.model.MessageBox;

import java.util.HashMap;
import java.util.UUID;

public class MessageBoxService {
    private static HashMap<UUID, MessageBox> messageBoxHashMap = new HashMap<>();

    public static void addMessageBox(MessageBox messageBox) {
        messageBoxHashMap.put(UUID.randomUUID(), messageBox);
    }

    public static HashMap<UUID, MessageBox> getAllMessageBox() {
        return messageBoxHashMap;
    }
}
