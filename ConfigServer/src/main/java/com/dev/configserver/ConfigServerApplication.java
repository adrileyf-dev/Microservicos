package com.dev.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication

public class ConfigServerApplication {


    private String username;


    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }


}
