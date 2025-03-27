package com.anuworks.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "This is setter injected service!!";
    }
}
