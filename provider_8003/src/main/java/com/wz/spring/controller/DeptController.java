package com.wz.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wz.api.bean.Dept;
import com.wz.spring.service.DeptService;

@RestController
public class DeptController {
    
    @Autowired
    private DeptService deptservice;
    
    @RequestMapping("/findDept")
    public String findDept() {
        int id = 3;
        
        try {
            List<Dept> depts = deptservice.findDept(id);
            System.out.println(depts);
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
        
        return "ok";
    }

    @RequestMapping(value="/findDept/{id}", method=RequestMethod.GET)
    public List<Dept> findDept2(@PathVariable("id") int id){
        
        List<Dept> depts = deptservice.findDept(id);
        return depts;
    }
    
    @RequestMapping(value="/addDept", method=RequestMethod.GET)
    public String addDept() {
        
        Dept dept = new Dept();
        dept.setDbname("b1");
        try {
            deptservice.addDept(dept);
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
        return "ok";
    }
    
    @Autowired
    private DiscoveryClient client;
    
    @RequestMapping(value="/descovery", method=RequestMethod.GET)
    public Object discObject() {
        List<String> list = client.getServices();
        System.out.println("*********" + list);
        
        List<ServiceInstance> srvList = client.getInstances("CONSUMER_7001");
        for(ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + " *** " + element.getHost() + " *** " + element.getPort() + " *** " + element.getUri());
            
        }
        
        return this.client;
    }
    
}
