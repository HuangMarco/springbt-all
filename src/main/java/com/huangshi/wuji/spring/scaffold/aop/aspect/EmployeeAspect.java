package com.huangshi.wuji.spring.scaffold.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }

    //所有com.huangshi.wuji.spring.scaffold.aop.service目录下的所有get打头的方法执行前都会被执行getAllAdvice方法
    @Before("execution(* com.huangshi.wuji.spring.scaffold.aop.service.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }

}
