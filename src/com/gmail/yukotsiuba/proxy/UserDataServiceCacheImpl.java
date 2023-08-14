package com.gmail.yukotsiuba.proxy;

import java.util.HashMap;
import java.util.Map;

public class UserDataServiceCacheImpl implements UserDataService {
    private static UserDataService userDataService;
    private Map<Integer, UserData> userDataCache;

    public UserDataServiceCacheImpl() {
        userDataService = new UserDataServiceImpl();
        userDataCache = new HashMap<>();
    }

    @Override
    public UserData getUserData(Integer id) {
        if (userDataCache.containsKey(id)) {
            System.out.println("Using cache");
            return userDataCache.get(id);
        }
        UserData userData = userDataService.getUserData(id);
        userDataCache.put(id, userData);
        return userData;
    }
}
