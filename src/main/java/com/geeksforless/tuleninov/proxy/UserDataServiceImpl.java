package com.geeksforless.tuleninov.proxy;

public class UserDataServiceImpl implements UserDataService {

    public UserDataServiceImpl() {
    }

    @Override
    public UserData getUserData() {
        return cretaeUserData();
    }

    private UserData cretaeUserData() {
        UserData userData = new UserData();
        userData.setFirstName("FirstName");
        userData.setLastName("LastName");
        userData.setId(random(1, 100));
        return userData;
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
