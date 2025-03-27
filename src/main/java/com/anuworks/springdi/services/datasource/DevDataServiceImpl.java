package com.anuworks.springdi.services.datasource;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("data")
public class DevDataServiceImpl implements DataService {
    @Override
    public String getData() {
        return "This is Dev Data";
    }
}
