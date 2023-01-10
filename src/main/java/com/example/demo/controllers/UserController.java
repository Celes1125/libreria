package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping (
            value = "/users",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<ArrayList<User>> createUsers (
            @RequestBody User newUser
    ) {
        return userService.createUsers(newUser);
    };

    @GetMapping (
            value = "/users",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<ArrayList<User>> getAllUsers ( ) {
        return userService.getAllUsers();
    }

    @GetMapping (
            value = "/users/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<User> getUserById (
            @RequestParam (name = "email") String email
    ) {
        return userService.getUserById(email);
    }

    @PutMapping (
            value = "/users",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<ArrayList<User>> setUsers (
            @RequestBody User user
    ) {
        return new ResponseEntity<>(userService.setUsers(user), HttpStatus.OK);
    };



}
