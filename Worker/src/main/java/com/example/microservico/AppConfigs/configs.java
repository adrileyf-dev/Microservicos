package com.example.microservico.AppConfigs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configs {

    @Value("{$worker.config}")
    public String WorkConfig;
}
