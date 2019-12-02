package com.example.springsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping()
    public String sayHello() {
        return "<H1> Hello </H1>";
    }
}
