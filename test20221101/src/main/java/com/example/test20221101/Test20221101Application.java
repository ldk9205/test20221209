package com.example.test20221101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class Test20221101Application {

    public static void main(String[] args) {
        SpringApplication.run(Test20221101Application.class, args);
    }

}
