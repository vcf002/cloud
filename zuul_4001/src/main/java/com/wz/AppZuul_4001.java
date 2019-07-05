package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient     //本服务启动后，自动注册进eureka服务中
@EnableDiscoveryClient  //首页服务列表发现
@EnableZuulProxy
public class AppZuul_4001 {
    
    public static void main(String[] args) {
        SpringApplication.run(AppZuul_4001.class, args);
    }
    
}




