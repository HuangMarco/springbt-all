package com.huangshi.wuji.spring.scaffold.bean.lifecycle.service;

import com.huangshi.wuji.spring.scaffold.bean.lifecycle.model.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Service
public class EmployeeService implements InitializingBean, DisposableBean {

    @Autowired
    private Employee employee;

    public EmployeeService(){
        System.out.println("EmployeeService no-args constructor called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("EmployeeService Closing resources");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("EmployeeService initializing to dummy value");
        if(employee.getName() == null){
            employee.setName("Marco");
        }

    }
}
