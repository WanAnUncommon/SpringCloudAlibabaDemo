package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@SpringBootApplication
public class RocketMQConsumer1Application {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQConsumer1Application.class, args);
    }

    @Bean
    public Consumer<Message<String>> consumer() {
        return msg -> System.out.println(Thread.currentThread().getName() + " Consumer1 Receive New Messages: " + msg.getPayload());
    }
}