package com.example;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        helloService.helloWorld();
        return "success";
    }
}