package com.wz.api.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable {
    
    private int deptno;
    
    private String deptname;
    
    private String dbname;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    @Override
    public String toString() {
        return "Dept [deptno=" + deptno + ", deptname=" + deptname + ", dbname=" + dbname + "]";
    }
    
}
