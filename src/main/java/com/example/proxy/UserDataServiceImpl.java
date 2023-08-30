package com.example.proxy;

public class UserDataServiceImpl implements UserDataService {

    public UserDataServiceImpl() {
    }

    @Override
    public UserData getUserData(int id) {
        return createUserData(id);
    }

    private UserData createUserData(int id) {
        UserData userData = new UserData();
        userData.setFirstName("FirstName");
        userData.setLastName("LastName");
        userData.setId(id);
        System.out.println(id + " new user");
        return userData;
    }
}
