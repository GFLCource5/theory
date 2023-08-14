package com.geeksforless.tuleninov.proxy;

import java.util.HashMap;
import java.util.Map;

public class UserDataServiceCacheImpl implements UserDataService {
    private UserDataService userDataService;
    private UserData userData;
    private final Map<Integer, UserData> cache = new HashMap<>();

    @Override
    public UserData getUserData() {
        userDataService = new UserDataServiceImpl();
        userData = userDataService.getUserData();
        int userId = userData.getId();

        if (cache.containsKey(userId)) {
            return cache.get(userId);
        }

        cache.put(userId, userData);
        return userData;
    }
}
