package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Equal MainController_1
@Controller
public class MainController_3 {
    @GetMapping("/main3")
    public @ResponseBody String printMainInfo() {
        System.out.println("We are in main 3 method");
        return "Hello from MainController_3";
    }
}
