package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient     //本服务启动后，自动注册进eureka服务中
@EnableDiscoveryClient  //服务发现
@EnableTransactionManagement
public class AppProvide_8002 {
    
    public static void main(String[] args) {
        SpringApplication.run(AppProvide_8002.class, args);
    }
    
}


