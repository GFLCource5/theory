package com.example.proxy;


public class UserDataApplication {
    public static void main(String[] args) {
        UserDataService userDataService= new UserDataServiceImpl();
        UserData user1 = userDataService.getUserData(1);
        UserData user2 = userDataService.getUserData(2);
        UserData user3 = userDataService.getUserData(1);

        System.out.println();

        UserDataService userDataServiceCache = new UserDataServiceCacheImpl();
        UserData cacheUser1 = userDataServiceCache.getUserData(1);
        UserData cacheUser2 = userDataServiceCache.getUserData(2);
        UserData cacheUser3 = userDataServiceCache.getUserData(3);
        UserData cacheUser4 = userDataServiceCache.getUserData(1);
        UserData cacheUser5 = userDataServiceCache.getUserData(3);
    }
}
