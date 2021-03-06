package com.muskteer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MuskteerSpringbootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuskteerSpringbootExampleApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index,welcome to springboot";
    }
}
