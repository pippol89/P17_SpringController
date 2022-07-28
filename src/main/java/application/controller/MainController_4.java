package application.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController_4 {
    @GetMapping(value = "/consumeJson",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.TEXT_PLAIN_VALUE)
    public String getJSON() {
        System.out.println("We are in getJSON()");
        return "Hello from MainController_4";
    }
}
