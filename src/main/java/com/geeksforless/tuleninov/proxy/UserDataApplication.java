package com.geeksforless.tuleninov.proxy;


import java.util.List;

public class UserDataApplication {
    public static void main(String[] args) {
        UserDataServiceImpl userDataService = new UserDataServiceImpl();
        UserData userData1 = userDataService.getUserData("First firstName", "First lastName");
        UserData userData2 = userDataService.getUserData("First firstName", "First lastName");
        List<UserData> listOfAllUserDataFromDB = userDataService.getDb().list();
        System.out.println("UserDataServiceImpl:");
        for (UserData variable : listOfAllUserDataFromDB) {
            System.out.println(variable);
        } // users with equals field (firstName, lastName) form DB
        System.out.println();

        // Proxy
        UserDataServiceCacheImpl userDataServiceCache = new UserDataServiceCacheImpl();
        UserData cacheUser3 = userDataServiceCache.getUserData("First firstName", "First lastName");
        UserData cacheUser4 = userDataServiceCache.getUserData("First firstName", "First lastName");
        UserData cacheUser5 = userDataServiceCache.getUserData("Second firstName", "Second lastName");
        List<UserData> proxyListOfAllUserDataFromDB = userDataServiceCache.getDb().list();
        System.out.println("Proxy implementation with additional logic:");
        for (UserData variable : proxyListOfAllUserDataFromDB) {
            System.out.println(variable);
        } // unique users with not equals field (firstName, lastName) form DB
    }
}
