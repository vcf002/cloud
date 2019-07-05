package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.rule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.wz.api", "com.wz.spring"})
@ComponentScan({"com.wz.api", "com.wz.spring"})
@RibbonClient(name="PROVIDE", configuration=MySelfRule.class)
public class AppConsumer_7002_feign {
    
    public static void main(String[] args) {
        SpringApplication.run(AppConsumer_7002_feign.class, args);
    }
    
}

