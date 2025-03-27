package com.anuworks.springdi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new SetterInjectedController();
//        controller.setGreetingsService(new GreetingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}