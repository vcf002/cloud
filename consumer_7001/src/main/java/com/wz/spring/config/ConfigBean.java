package com.wz.spring.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    
    @Bean
    @LoadBalanced   //负载均衡
    public RestTemplate getRestTemplate() {
        
        return new RestTemplate();
    }
    
    //设置负载均衡的 - 算法（如果设置了自定义的算法，就不用这个了）
//    @Bean
//    public IRule myRule() {
//        //return new RandomRule();    //随机算法
//        return new RetryRule();    //轮询算法（经验策略：如果有一个服务宕机了，还是会轮询宕机的服务，访问几次后就不访问宕机的服务）
//    }
    
}
