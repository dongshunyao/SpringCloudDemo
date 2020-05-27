package com.example.producer_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProducerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerDemoApplication.class, args);
    }

}
