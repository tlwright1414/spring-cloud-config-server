package com.trta.contenttech.tamconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.security.Security;

@SpringBootApplication
@EnableConfigServer
public class TamConfigServiceApplication {

    public static void main(String[] args) {
        //Security.setProperty("crypto.policy", "unlimited");
        SpringApplication.run(TamConfigServiceApplication.class, args);
    }
}
