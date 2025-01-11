package edu.wgu.d387_sample_code.rest;


import edu.wgu.d387_sample_code.locale.WelcomeMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WelcomeController {
    private WelcomeMessageService welcomeMessageService;

    public WelcomeController() {
        this.welcomeMessageService = new WelcomeMessageService();
    }


    @GetMapping("/welcomeMessages")
    public List<String> getWelcomeMessages() {
        return welcomeMessageService.getWelcomeMessages();
    }

}
