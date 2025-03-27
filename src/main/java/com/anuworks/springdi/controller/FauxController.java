package com.anuworks.springdi.controller;

import com.anuworks.springdi.services.datasource.DataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final DataService dataService;

    public FauxController(@Qualifier("data") DataService dataService) {
        this.dataService = dataService;
    }

    public String getData() {
        return dataService.getData();
    }
}
