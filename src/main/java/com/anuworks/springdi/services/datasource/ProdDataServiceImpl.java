package com.anuworks.springdi.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("data")
public class ProdDataServiceImpl implements DataService {

    @Override
    public String getData() {
        return "This is Prod Data";
    }
}
