package com.example.demo.controllers;

import com.example.demo.models.Client;
import com.example.demo.models.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping (value = "/user",
            produces = MediaType.APPLICATION_JSON_VALUE)

    @ResponseBody
    public User getUser (
            @RequestParam(value = "lastname") String name,
            @RequestParam (value = "lastname") String lastName,
            @RequestParam (value = "email") String email,
            @RequestParam (value = "password") String password,
            @RequestParam (value = "birthday") String birthday,
            @RequestParam (value = "userType") String userType
            ) {
        return new Client (name, lastName, email, password, birthday) ;

    }
}
