package com.samedov.polyathlon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public void registerUser() {

    }

    @RequestMapping("/login")
    public void login() {

    }
}
