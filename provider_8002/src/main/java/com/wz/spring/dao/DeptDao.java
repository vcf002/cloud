package com.wz.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wz.api.bean.Dept;

@Mapper
public interface DeptDao {
    
    List<Dept> findDept(int id);
    
    void addDept(Dept dept);
    
}
