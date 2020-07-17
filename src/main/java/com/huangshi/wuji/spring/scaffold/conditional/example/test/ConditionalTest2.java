package com.huangshi.wuji.spring.scaffold.conditional.example.test;

import com.huangshi.wuji.spring.scaffold.conditional.example.configuration.BeanConfig2;
import com.huangshi.wuji.spring.scaffold.conditional.example.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConditionalTest2 {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);
        String osName = context.getEnvironment().getProperty("os.name");
        System.out.println("当前系统为：" + osName);
        Map<String, Person> map = context.getBeansOfType(Person.class);

        System.out.println(map);

        System.out.println(context.getBean(Person.class).getName());

    }

}
