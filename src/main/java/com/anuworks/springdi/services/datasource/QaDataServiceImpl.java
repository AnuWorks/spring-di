package com.anuworks.springdi.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("data")
public class QaDataServiceImpl implements DataService {
    @Override
    public String getData() {
        return "This is QA Data";
    }
}
