package com.huangshi.wuji.spring.scaffold.rest.aop.service;


import com.huangshi.wuji.spring.scaffold.rest.aop.model.RestEmployee;
import org.springframework.stereotype.Service;

@Service
public class RestEmployeeService {

    public RestEmployee createEmployee(String name, String empId) {

        RestEmployee emp = new RestEmployee();
        emp.setName(name);
        emp.setEmpId(empId);
        return emp;
    }

    public void deleteEmployee(String empId) {

    }
}
