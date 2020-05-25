package com.example.devrelief.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//annotation
@RestController
public class Hello {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World :D";
    }

//    @GetMapping("/users")
//    public String findUsers(){
//        return "I have found the users";
//    }




}
