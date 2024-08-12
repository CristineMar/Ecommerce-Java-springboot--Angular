package com.java.angular.tutorial.ecommerce_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
