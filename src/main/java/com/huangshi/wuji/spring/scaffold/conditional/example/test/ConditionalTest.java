package com.huangshi.wuji.spring.scaffold.conditional.example.test;

import com.huangshi.wuji.spring.scaffold.conditional.example.configuration.BeanConfig;
import com.huangshi.wuji.spring.scaffold.conditional.example.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalTest {



    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Person.class);
        //下面会显示当前上下文中出现了2个符合条件的Bean，但是我们只需要一个，该怎么办呢？
        System.out.println(context.getBeansOfType(Person.class));
    }


}
