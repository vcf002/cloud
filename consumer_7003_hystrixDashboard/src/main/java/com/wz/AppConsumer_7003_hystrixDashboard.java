package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class AppConsumer_7003_hystrixDashboard {
    
    public static void main(String[] args) {
        SpringApplication.run(AppConsumer_7003_hystrixDashboard.class, args);
    }
}

