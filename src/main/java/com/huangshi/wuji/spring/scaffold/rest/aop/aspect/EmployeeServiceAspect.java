package com.huangshi.wuji.spring.scaffold.rest.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

    @Before(value = "execution(* com.huangshi.wuji.spring.scaffold.rest.aop.service..*(..)) and args(name,empId)")
    public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating Employee with name - " + name + " and id - " + empId);
    }

    @After(value = "execution(* com.huangshi.wuji.spring.scaffold.rest.aop.service..*(..)) and args(name,empId)")
    public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
    }
}
