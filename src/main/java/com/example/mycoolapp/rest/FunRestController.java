package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping ("/")
    public  String sayHelloWorld(){
        //expose "/"  that returns "Hello World"
        return "Hello World";
    }
    //exposes a new endpoint for workout
    @GetMapping ("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping ("/fortune")
        public String getDailyFortune(){
            return "Today is your lucky day";
    }

}
