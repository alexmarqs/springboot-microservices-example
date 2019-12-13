package com.example.usersmicroservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UsersRestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getHelloWorld() {
        return "Hello World from Users Microservice";
    }

}
