package com.huangshi.wuji.spring.scaffold.applicationcontext.test;

import com.huangshi.wuji.spring.scaffold.applicationcontext.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "classpathxmlapplicationcontext-example.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());

        ConfigurableApplicationContext cofigurableContext = new ClassPathXmlApplicationContext(
                "classpathxmlapplicationcontext-example.xml");

        Student student2 = (Student) cofigurableContext.getBean("student");

        System.out.println(student2.getNo());

        cofigurableContext.registerShutdownHook();
    }
}
