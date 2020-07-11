package com.huangshi.wuji.spring.scaffold.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.util.Arrays;

@Aspect
public class EmployeeAspectJoinPoint {

    @Before("execution(public void com.huangshi.wuji.spring.scaffold.aop.model..set*(*))")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("Before running loggingAdvice on method="+joinPoint.toString());

        System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

    }

    /**
     * args()表达式是一个内置的表达式，可以直接使用
     * 在pointcut中可以使用该表达式，只要任意一个方法的参数类型能匹配的上，就能用args(参数名)表达式来获取传递到目标对象方法的参数
     * 如下，只要有bean有方法参数是String类型的，且参数名为name的，那么就会被捕获到
     * **/
    //Advice arguments, will be applied to bean methods with single String argument
    @Before("args(name)")
    public void logStringArguments(String name){
        System.out.println("String argument passed="+name);
    }
}
