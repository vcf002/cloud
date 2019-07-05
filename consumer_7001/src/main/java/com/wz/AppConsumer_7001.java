package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.rule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="PROVIDE", configuration=MySelfRule.class)
public class AppConsumer_7001 {
    
    public static void main(String[] args) {
        SpringApplication.run(AppConsumer_7001.class, args);
    }
    
}
