package com.huangshi.wuji.spring.scaffold.conditional.example.controller;

import com.huangshi.wuji.spring.scaffold.conditional.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping(value = "/query/conditional", method = RequestMethod.GET)
    public String queryConditonal(){
        System.out.println(System.getenv("os.name"));
        Person p = (Person)context.getBean("bill");
        return p.getName();
    }



}
