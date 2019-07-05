package com.wz.spring.config;

import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * druid的性能监控
 * url: ip:port/druid
 * @author Administrator
 *
 */
@Configuration
public class DruidConfig {
    
    @Bean
    public ServletRegistrationBean<HttpServlet> myServlet() {
        ServletRegistrationBean<HttpServlet> registration = new ServletRegistrationBean<HttpServlet>();
        
        registration.setServlet(new StatViewServlet());
        registration.setUrlMappings(Arrays.asList("/druid/*"));
        // 白名单
        registration.addInitParameter("allow", "120.0.0.1, 0.0.0.0, 192.168.206.130");  
        //黑名单
        registration.addInitParameter("deny", "120.l.1.1");  
        //安全用户
        registration.addInitParameter("loginUsername", "root"); 
        registration.addInitParameter("loginPassword", "mima002"); 
        //是否可以重置数据源
        registration.addInitParameter("resetEnable", "false"); 
        
        return registration;
    }
    
    @Bean
    public FilterRegistrationBean<Filter> myFilter() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        
        registration.setFilter(new WebStatFilter());
        registration.setUrlPatterns(Arrays.asList("/*"));
        //排除过滤的路径
        registration.addInitParameter("exclusions", "*.js, *.gif, *.jpg, *.css, /druid/*");
        registration.setOrder(1);
        
        return registration;
        
    }
    
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
    
}
