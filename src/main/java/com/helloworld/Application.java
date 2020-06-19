package com.helloworld;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Application.class);

    private String name = "demoApplicationName";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
