package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingController {
    @GetMapping (value = "/ping",
                produces = MediaType.APPLICATION_JSON_VALUE)

    @ResponseBody
    public String ping () {
        return "pong";
    }

}
