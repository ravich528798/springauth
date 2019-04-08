package com.saix.auth;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication implements ApplicationRunner {

    private static final Logger logger = LogManager.getLogger(LoginApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

    }

}
