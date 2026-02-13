package example.controller;

import example.api.UserClient;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class Consumer {

    @Resource
    private UserClient userClient;

    @GetMapping("/hello")
    public String hello() {
        return userClient.hello();
    }
}