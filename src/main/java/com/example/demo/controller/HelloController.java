package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Environment env;

    public HelloController(Environment env) {
        this.env = env;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/health")
    public String status(){
        return String.format("It's working in Demo PJT on PORT %s", env.getProperty("server.port")
                + ", port(local.server.port) = " + env.getProperty("local.server.port")
        );
    }
}
