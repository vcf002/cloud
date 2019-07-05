package com.wz.api.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wz.api.bean.Dept;

//@FeignClient(value="PROVIDE")
@FeignClient(value="PROVIDE", fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping("/findDept")
    public String findDept();

    @RequestMapping(value="/findDept/{id}", method=RequestMethod.GET)
    public List<Dept> findDept2(@PathVariable("id") int id);
    
    @RequestMapping(value="/addDept", method=RequestMethod.GET)
    public String addDept();
    
    @RequestMapping(value="/descovery", method=RequestMethod.GET)
    public Object discObject();
    
}
