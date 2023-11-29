package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(2)
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {

        System.out.println("Start main");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("End main");

    }
    public void run(String... args) throws Exception {
        System.out.println("Hello world from Spring Boot IM-13");
    }

}
