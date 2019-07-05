package com.wz.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wz.api.bean.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            
            @Override
            public List<Dept> findDept2(int id) {
                List<Dept> depts = new ArrayList<Dept>();
                Dept dept = new Dept();
                dept.setDbname("----------id=" + id + "出错");
                depts.add(dept);
                
                return depts;
            }
            
            @Override
            public String findDept() {
                // TODO Auto-generated method stub
                return null;
            }
            
            @Override
            public Object discObject() {
                // TODO Auto-generated method stub
                return null;
            }
            
            @Override
            public String addDept() {
                // TODO Auto-generated method stub
                return null;
            }
        };
    }

}
