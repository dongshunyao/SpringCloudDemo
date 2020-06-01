package com.example.consumer_demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "producer-demo")
public interface ConsumerService {
    @RequestMapping("/producer/produce")
    public String consumer();
}
