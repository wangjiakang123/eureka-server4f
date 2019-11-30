package com.test4f02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestServer02 {

    public static void main(String[] args) {
        SpringApplication.run(TestServer02.class);
    }

}
