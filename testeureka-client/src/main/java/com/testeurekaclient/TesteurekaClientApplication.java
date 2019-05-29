package com.testeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TesteurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteurekaClientApplication.class, args);
    }

}
