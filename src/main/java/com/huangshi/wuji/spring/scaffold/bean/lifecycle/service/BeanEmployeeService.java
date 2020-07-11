package com.huangshi.wuji.spring.scaffold.bean.lifecycle.service;

import com.huangshi.wuji.spring.scaffold.bean.lifecycle.model.BeanEmployee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Service
public class BeanEmployeeService implements InitializingBean, DisposableBean {

    @Autowired
    private BeanEmployee employee;

    public BeanEmployeeService(){
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
