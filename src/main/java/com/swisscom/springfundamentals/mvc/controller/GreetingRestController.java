package com.swisscom.springfundamentals.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/greet")
    public GreetingDto greet() {
        return new GreetingDto("Hey", "Joe");
    }
}
