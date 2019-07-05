package com.wz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wz.api.bean.Dept;
import com.wz.spring.dao.DeptDao;

@Service
public class DeptService {
    
    @Autowired
    private DeptDao deptdao;

    @Transactional(readOnly=true)   //加上只读的事务操作，并且在启动类加上@EnableTransactionManagement
    public List<Dept> findDept(int id) {
        List<Dept> depts = deptdao.findDept(id);
        return depts;
    }

    @Transactional(propagation=Propagation.REQUIRED)
    public void addDept(Dept dept) {
        deptdao.addDept(dept);
        
    }
    
}
