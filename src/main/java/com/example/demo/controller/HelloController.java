package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/send/{content}" )
    public String send(@PathVariable String content){
        return "받은 데이터는 " + content + "입니다!";
    }

}
