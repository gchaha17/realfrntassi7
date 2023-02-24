package com.example.assignnment4;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2


public class Assignnment4Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignnment4Application.class, args);
    }

}
