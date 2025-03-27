package com.anuworks.springdi.services.i18n;

import com.anuworks.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetings implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there";
    }
}
