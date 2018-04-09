package cz.unit.black.magic.unitbackend.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world";
    }
}
