package com.anuworks.springdi.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("data")
public class UatDataServiceImpl implements DataService {
    @Override
    public String getData() {
        return "This is UAT Data";
    }
}
