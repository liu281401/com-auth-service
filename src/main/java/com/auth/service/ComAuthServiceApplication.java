package com.auth.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.*")
@EnableEurekaClient
@MapperScan("com.auth.service.*")
public class ComAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComAuthServiceApplication.class, args);
    }

}
