package lombok.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import lombok.model.Greeting;

@Service
@Slf4j
public class GreetingService {
    
    public String getGreeting(final String message) {
        log.info("getGreeting message {} ",  message);
        Greeting greeting = new Greeting();
        greeting.setGreeting(message);
        return greeting.getGreeting();
    }
    
}
