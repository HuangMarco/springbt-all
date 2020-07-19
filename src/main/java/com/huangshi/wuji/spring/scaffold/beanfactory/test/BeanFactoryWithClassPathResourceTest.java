package com.huangshi.wuji.spring.scaffold.beanfactory.test;

import com.huangshi.wuji.spring.scaffold.beanfactory.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryWithClassPathResourceTest {

    public static void main(String[] args) {
        Resource res = new ClassPathResource("beanfactory-example.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Employee emp = (Employee) factory.getBean("employee");

        System.out.println(emp.getAge());
    }


}
