package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    private final userService userService;

    public UserController(com.example.demo.services.userService userService) {
        this.userService = userService;
    }

    @PostMapping (
            value = "/users",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ArrayList<User> createUsers (
            @RequestParam (value = "name") String name,
            @RequestParam (value = "email") String email,
            @RequestParam (value = "password") int password

    ) {
        return userService.createUsers(name, email, password);
    };

    @GetMapping (
            value = "/users",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ArrayList<User> getUsers ( ) {
        return userService.getAllUsers();
    }

    @GetMapping (
            value = "/users/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<?> getUserById (
            @PathVariable (name = "id") int id
    ) {
        return userService.getUserById(id);
    }




}
