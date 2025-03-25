package com.anuworks.springdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello() {
        System.out.println("In controller");
        return "hello";
    }
}
