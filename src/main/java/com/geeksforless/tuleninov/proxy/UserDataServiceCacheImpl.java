package com.geeksforless.tuleninov.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserDataServiceCacheImpl implements UserDataService {
    private UserDataService userDataService;
    private UserData user;
    private final Map<UUID, UserData> cache;
    private final DataBase db;

    public UserDataServiceCacheImpl() {
        cache = new HashMap<>();
        db = new DataBase();
    }

    @Override
    public UserData getUserData(String firstName, String lastName) {
        userDataService = new UserDataServiceImpl();
        user = userDataService.getUserData(firstName, lastName);

        if (cache.containsValue(user)) {
            UUID key = getUuidFromCache();
            return cache.get(key);
        }

        cache.put(UUID.randomUUID(), user);
        db.add(user);
        return user;
    }

    private UUID getUuidFromCache() {
        return cache.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(user))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public DataBase getDb() {
        return db;
    }
}
