package com.javawebservices.javawebservices.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "string")
    public String test()
    {
        return "String";
    }
}
