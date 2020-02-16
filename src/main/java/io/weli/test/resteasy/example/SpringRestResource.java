package io.weli.test.resteasy.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class SpringRestResource {
    @GetMapping("/")
    public String get() {
        return "Spring is coming!";
    }
}
