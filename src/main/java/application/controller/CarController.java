package application.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("/getCars")
    public String getCars() {
        return "BMW Volkswagen";
    }

    @GetMapping(value = {"/getCarById/{id}", "/getCarById"})
    public String getCarById(@PathVariable(value = "id", required = false) String id) {
        System.out.println("PathVariable id: " + id);

        if ("1".equals(id)) {
            return "BMW";
        } else if ("2".equals(id)) {
            return "Volkswagen";
        }
        return "We don't have car we such id";
    }

    @GetMapping("/getCarByIdTwo")
    public String getCarByIdTwo(@RequestParam(value = "id", required = false) String id) {
        System.out.println("RequestParam id: " + id);

        if ("1".equals(id)) {
            return "BMW two";
        } else if ("2".equals(id)) {
            return "Volkswagen two";
        }
        return "We don't have car we such id two";
    }

    @PostMapping("/add")
    public void addNewCar(@RequestParam("mark") String mark, @RequestParam("speed") String speed) {
        System.out.println("We add new car: mark: " + mark + ", speed: " + speed);
    }
}
