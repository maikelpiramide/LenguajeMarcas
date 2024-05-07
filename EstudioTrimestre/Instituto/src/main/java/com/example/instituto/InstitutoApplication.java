package com.example.instituto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.DriverManager;

@SpringBootApplication
public class InstitutoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(InstitutoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DriverManager.drivers().forEach(driver -> {
            System.out.println(driver.getClass().getName());
        });
    }
}
