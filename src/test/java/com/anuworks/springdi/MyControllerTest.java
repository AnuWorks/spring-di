package com.anuworks.springdi;

import com.anuworks.springdi.controller.MyController;
import org.junit.jupiter.api.Test;

public class MyControllerTest {

    @Test
    void sayGreeting() {
        MyController myController = new MyController();
        System.out.println(myController.hello());
    }

}
