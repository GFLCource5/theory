package com.geeksforless.tuleninov.controller;

import java.util.List;

public interface UserService {

    UserDTO get(int id);

    List<UserDTO> getAll();

    UserDTO create(UserDTO userDTO);
    List<UserDTO> createAllUsers(List<UserDTO> users);

    void delete(int id);

}
