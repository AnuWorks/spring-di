package com.anuworks.springdi.controller;

import com.anuworks.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    GreetingService greetingService;

    public ConstructorInjectedController( @Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
