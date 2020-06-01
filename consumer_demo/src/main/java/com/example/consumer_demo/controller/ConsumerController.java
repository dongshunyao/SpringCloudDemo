package com.example.consumer_demo.controller;

import com.example.consumer_demo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private ConsumerService consumerService;

    @Autowired
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @RequestMapping("/api/v1/demo/get")
    public String consumer() {
        return "Consumer get message: " + consumerService.consumer();
    }
}
