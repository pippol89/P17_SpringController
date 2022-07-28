package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController_0 {
    @GetMapping("/main0")
    public void printMainInfo() {
        System.out.println("We are in main 0 method");
    }
}
