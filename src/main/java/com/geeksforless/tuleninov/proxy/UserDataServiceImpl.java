package com.geeksforless.tuleninov.proxy;

public class UserDataServiceImpl implements UserDataService {

    private final DataBase db;
    public UserDataServiceImpl() {
        db = new DataBase();
    }

    @Override
    public UserData getUserData(String firstName, String lastName) {
        UserData user = createUserData(firstName, lastName);
        db.add(user);
        return user;
    }

    private UserData createUserData(String firstName, String lastName) {
        UserData userData = new UserData();
        userData.setFirstName(firstName);
        userData.setLastName(lastName);
        userData.setId(random(1, 100));
        return userData;
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }

    public DataBase getDb() {
        return db;
    }
}
