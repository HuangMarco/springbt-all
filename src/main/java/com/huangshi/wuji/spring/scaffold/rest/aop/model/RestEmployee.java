package com.huangshi.wuji.spring.scaffold.rest.aop.model;

public class RestEmployee {

    private String empId;
    private String name;

    public RestEmployee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
