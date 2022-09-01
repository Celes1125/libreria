package com.example.demo.controllers;

import com.example.demo.models.Client;
import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping (value = "/user",
            produces = MediaType.APPLICATION_JSON_VALUE)

    @ResponseBody
    public User getUser (
            @RequestParam(value = "lastname") String name,
            @RequestParam (value = "lastname") String lastName,
            @RequestParam (value = "email") String email,
            @RequestParam (value = "password") String password,
            @RequestParam (value = "birthday") String birthday

            ) {
        return new Client (name, lastName, email, password, birthday) ;

    }

    @GetMapping (
            value="/user/{id}"
    )

    @ResponseBody
    public ResponseEntity<?> getUserById(
            @PathVariable(name="id") int id
    ) {
        return userService.getUserById(id);
    }


}
