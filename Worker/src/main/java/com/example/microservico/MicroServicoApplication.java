package com.example.microservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServicoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicoApplication.class, args);
    }

}
