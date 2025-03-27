package com.anuworks.springdi.controller;

import com.anuworks.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    //@Qualifier("greetingServiceSetterInjected")
    //@Autowired
    private GreetingService greetingService;

    @Qualifier("greetingServiceSetterInjected")
    @Autowired
    public void setGreetingsService(GreetingService greetingService) {
        System.out.println("In the setter instead of field");
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
