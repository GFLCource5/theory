package com.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class UserDataServiceCacheImpl implements UserDataService {
    private static UserDataService userDataService = new UserDataServiceImpl();
    private final Map<Integer, UserData> cache = new HashMap<>();

    @Override
    public UserData getUserData(int id) {
        UserData userData;
        if (cache.containsKey(id)) {
            userData = cache.get(id);
            System.out.println(id + " from cache");
        } else {
            userData = userDataService.getUserData(id);
            cache.put(userData.getId(), userData);
        }

        return userData;
    }
}
