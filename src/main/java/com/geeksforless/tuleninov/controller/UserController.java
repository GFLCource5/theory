package com.geeksforless.tuleninov.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // localhost:8080/api/user/1
    @GetMapping(path = "/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(userService.get(id));
    }
    // localhost:8080/api/user?id=1
//    @GetMapping
//    public ResponseEntity<UserDTO> getUser(@RequestParam(value = "id") Integer id) {
//        return ResponseEntity.ok(userService.get(id));
//    }

    // localhost:8080/api/user/1
    @GetMapping(path = "/all")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody @Valid UserDTO userDTO) {
        return ResponseEntity.ok(userService.create(userDTO));
    }

    @PostMapping(path = "/all")
    public ResponseEntity<List<UserDTO>> createAllUsers(@RequestBody @Valid List<UserDTO> users) {
        return ResponseEntity.ok(userService.createAllUsers(users));
    }

    @DeleteMapping(path = "/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.delete(id);
    }
}
