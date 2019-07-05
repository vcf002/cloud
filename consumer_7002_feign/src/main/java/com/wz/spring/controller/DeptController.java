package com.wz.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wz.api.bean.Dept;
import com.wz.api.service.DeptClientService;

@RestController
public class DeptController {
    
    @Autowired
    private DeptClientService service;
    
    @RequestMapping(value="/findDept/{id}")
    public List<Dept> findDept(@PathVariable("id") int id) {
        List<Dept> depts = service.findDept2(id);
        return depts;
    }

    @RequestMapping(value="/addDept")
    public String addDept() {
        String result = service.addDept();
        return result;
    }
    
}
