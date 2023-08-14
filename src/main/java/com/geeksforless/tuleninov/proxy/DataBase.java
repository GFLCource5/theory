package com.geeksforless.tuleninov.proxy;

import java.util.*;

public class DataBase {

    private final Map<UUID, UserData> db;

    public DataBase() {
        db = new HashMap();
    }

    public UserData add(UserData user) {
        db.put(UUID.randomUUID(), user);
        return user;
    }

    public List<UserData> list() {
        return new ArrayList<>(db.values());
    }
}
