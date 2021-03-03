package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final String welcomeMessage;

    public WelcomeController(@Value("${WELCOME.MESSAGE}") String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
//commented for observation
//    @Value("${WELCOME.MESSAGE}")
//    public String WelcomeController(String welcomeMessage) {
//        return welcomeMessage;
//    }

    @GetMapping("/")
    public String sayHello() {
        return welcomeMessage;
    }
}