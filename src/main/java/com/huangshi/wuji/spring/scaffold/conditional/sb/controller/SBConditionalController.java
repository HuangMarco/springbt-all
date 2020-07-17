package com.huangshi.wuji.spring.scaffold.conditional.sb.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBConditionalController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping(value = "/query/sb/conditional")
    public String querySBConditional(){
        if(((BeanFactory)context).containsBean("SBConditionalBean")){
            return "ok";
        }

        return "non-exist";
    }
}
