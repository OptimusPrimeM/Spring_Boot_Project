package com.optimusprime.diwithspring.controllers;

import com.optimusprime.diwithspring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("")
    public GreetingService greetingService;

     public String sayHello(){
         return greetingService.sayGreeting();
     }
}
