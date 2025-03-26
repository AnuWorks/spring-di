package com.anuworks.springdi.services;


public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "This is greeting service";
    }
}
