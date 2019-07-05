package com.wz.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wz.api.bean.Dept;

@RestController
public class DeptController {
    
    private static final String url = "http://PROVIDE";
    
    @Autowired
    private RestTemplate restTemplate;
    
    @SuppressWarnings("unchecked")
    @RequestMapping(value="/findDept/{id}")
    public List<Dept> findDept(@PathVariable("id") int id) {
        List<Dept> depts = restTemplate.getForObject(url + "/findDept/" + id, List.class);
        return depts;
    }

    @RequestMapping(value="/addDept")
    public String addDept() {
        String result = restTemplate.getForObject(url + "/addDept", String.class);
        return result;
    }
    
}
