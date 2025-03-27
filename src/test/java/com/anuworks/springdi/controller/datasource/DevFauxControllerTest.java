package com.anuworks.springdi.controller.datasource;

import com.anuworks.springdi.controller.FauxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class DevFauxControllerTest {

    @Autowired
   private FauxController controller;

    @Test
    void getData() {
        System.out.println(controller.getData());
    }
}