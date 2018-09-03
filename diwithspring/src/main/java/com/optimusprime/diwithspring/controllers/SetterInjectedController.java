package com.optimusprime.diwithspring.controllers;

import com.optimusprime.diwithspring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /*
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingServiceImpl")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    */
}
