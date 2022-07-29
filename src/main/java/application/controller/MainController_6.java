package application.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController_6 {
    @GetMapping(value = "/getJson", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getJson() {
        return new User("Bill", 24);
    }

    @GetMapping(value = "/getString", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getString() {
        return "Hello";
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
