package com.huangshi.wuji.spring.scaffold.aop.service;


import com.huangshi.wuji.spring.scaffold.aop.model.AOPEmployee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class AOPEmployeeService {

    @Autowired
    private AOPEmployee employee;

    public AOPEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(AOPEmployee employee) {
        this.employee = employee;
    }
}
