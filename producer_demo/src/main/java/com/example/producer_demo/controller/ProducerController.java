package com.example.producer_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @RequestMapping("/producer/produce")
    public String produce() {
        return "The string is sent by producer_demo.";
    }
}
