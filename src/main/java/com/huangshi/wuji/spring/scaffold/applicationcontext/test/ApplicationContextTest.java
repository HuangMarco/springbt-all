package com.huangshi.wuji.spring.scaffold.applicationcontext.test;

import com.huangshi.wuji.spring.scaffold.applicationcontext.model.Course;
import com.huangshi.wuji.spring.scaffold.applicationcontext.model.Student;
import com.huangshi.wuji.spring.scaffold.applicationcontext.model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Locale;

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



        MessageSource resources
                = new ClassPathXmlApplicationContext(
                "classpathxmlapplicationcontext-example.xml");

        String enHello = resources.getMessage(
                "hello", null, "Default", Locale.ENGLISH);
        String enYou = resources.getMessage(
                "you", null, Locale.ENGLISH);
        String enThanks = resources.getMessage(
                "thanks", new Object[] { enYou }, Locale.ENGLISH);

        System.out.println(enHello+enYou+enThanks);

        String chHello = resources.getMessage(
                "hello", null, "Default", Locale.SIMPLIFIED_CHINESE);
        String chYou = resources.getMessage(
                "you", null, Locale.SIMPLIFIED_CHINESE);
        String chThanks = resources.getMessage(
                "thanks", new Object[] { chYou }, Locale.SIMPLIFIED_CHINESE);

        System.out.println(chHello+chYou+chThanks);








        Teacher teacher = context.getBean("teacher", Teacher.class);
        List<Course> courses = teacher.getCourses();

        System.out.println(courses.size());

    }
}
