package lombok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.service.GreetingService;

@RestController
public class HelloController {

    @Autowired
    GreetingService greetingService;
    
    @RequestMapping("/")
    public String index() {
        String message = "Greetings from Spring Boot, Swagger 3, Java 11 and Lombok!";
        message = message  + "La ".repeat(2) + "Land";
        return greetingService.getGreeting(message);
    }

}