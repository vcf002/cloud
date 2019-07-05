package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEureka_5001 {
    
    public static void main(String[] args) {
        SpringApplication.run(AppEureka_5001.class,  args);
    }
    
}
