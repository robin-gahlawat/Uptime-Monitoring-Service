package com.cdc.uptime.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //Without this component, this class will be simply treated as POJO instead of spring's component
public class BootstrapController implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to the Spring Boot Application!");
        performOperations();
    }

    private void performOperations() {
        // Sample interaction
    }

}
