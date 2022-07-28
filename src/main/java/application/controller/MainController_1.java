package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController_1 {
    @GetMapping("/main1")
    public String printMainInfo() {
        System.out.println("We are in main 1 method");
        return "Hello from MainController_1";
    }
}
