package com.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {
    
    @Bean
    public IRule myRule() {
        RoundRobinRule rr;
        return new RandomRule();
    }
    
}