package com.tuempresa.proyecto.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tuempresa.proyecto")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
