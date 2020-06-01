package com.example.consumer_demo.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @LoadBalanced
    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/api/v1/demo/get")
    public String consumer() {
        return "Consumer get message: " + restTemplate.getForObject("http://producer_demo/producer/produce", String.class);
    }
}
