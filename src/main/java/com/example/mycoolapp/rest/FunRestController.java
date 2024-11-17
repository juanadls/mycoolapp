package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping ("/")
    public  String sayHelloWorld(){
        return "Hello World";
    }

    //expose / that returns Hello World
}
