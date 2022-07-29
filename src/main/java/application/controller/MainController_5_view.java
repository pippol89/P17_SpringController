package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController_5_view {
    @GetMapping("/jsp")
    public String getJsp() {
        System.out.println("We are in MainController_5_view method");
        return "index";
    }
}
