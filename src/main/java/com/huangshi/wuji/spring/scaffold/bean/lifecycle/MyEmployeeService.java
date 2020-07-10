package com.huangshi.wuji.spring.scaffold.bean.lifecycle;

import com.huangshi.wuji.spring.scaffold.bean.lifecycle.model.Employee;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class MyEmployeeService {


    @PostConstruct
    public void init(){
        System.out.println("MyService init method called");
    }

    public MyEmployeeService(){
        System.out.println("MyService no-args constructor called");
    }

    @PreDestroy
    public void destory(){
        System.out.println("MyService destroy method called");
    }
}
