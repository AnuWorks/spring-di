package com.anuworks.springdi.controller;

import com.anuworks.springdi.services.GreetingService;
import com.anuworks.springdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String hello() {
        System.out.println("In controller");
        return greetingService.sayGreeting();
    }
}
