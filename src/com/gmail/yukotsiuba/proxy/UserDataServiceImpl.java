package com.gmail.yukotsiuba.proxy;

public class UserDataServiceImpl implements UserDataService {

    public UserDataServiceImpl() {
    }

    @Override
    public UserData getUserData(Integer id) {
        return cretaeUserData(id);
    }

    private UserData cretaeUserData(Integer id) {
        UserData userData = new UserData();
        userData.setFirstName("FirstNameInteger id");
        userData.setLastName("LastName");
        userData.setId(id);
        return userData;
    }
}
