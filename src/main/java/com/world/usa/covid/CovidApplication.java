package com.world.usa.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CovidApplication {

    public static void main(String[] args) {
        System.out.println("Application started");

        SpringApplication.run(CovidApplication.class, args);
    }

}
