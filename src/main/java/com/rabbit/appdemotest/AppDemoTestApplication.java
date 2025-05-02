package com.rabbit.appdemotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/api/test")
@RestController
public class AppDemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDemoTestApplication.class, args);
    }

    @GetMapping
    public String test() {
        return "test" + System.currentTimeMillis();
    }
}
