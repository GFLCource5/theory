package com.geeksforless.tuleninov.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final List<UserDTO> dataBase = new ArrayList<>();

    @Override
    public UserDTO get(int id) {
        return dataBase.get(id - 1);
    }

    @Override
    public List<UserDTO> getAll() {
        return dataBase;
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        userDTO.setId(dataBase.size() + 1);
        dataBase.add(userDTO);
        return userDTO;
    }

    @Override
    public List<UserDTO> createAllUsers(List<UserDTO> users) {
        for (UserDTO user : users) {
            user.setId(dataBase.size() + 1);
            dataBase.add(user);
        }
        return dataBase;
    }

    @Override
    public void delete(int id) {
        dataBase.remove(id - 1);
    }
}
