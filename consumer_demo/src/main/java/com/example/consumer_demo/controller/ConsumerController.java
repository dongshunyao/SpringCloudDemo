package com.example.consumer_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/api/v1/demo/get")
    public String consumer() {
        return "Consumer get message: " + restTemplate.getForObject("http://localhost:8077/producer/produce", String.class);
    }
}
