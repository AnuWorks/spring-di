package com.anuworks.springdi.controller;

import com.anuworks.springdi.services.GreetingService;

public class SetterInjectedController {

    GreetingService greetingService;

    public void setGreetingsService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
