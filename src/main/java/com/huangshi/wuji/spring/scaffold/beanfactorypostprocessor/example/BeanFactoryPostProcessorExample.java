package com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example;


import com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example.configuration.BeanFactoryPostProcessorConfig;
import com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example.model.BeanFactoryPostProcessorExampleBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanFactoryPostProcessorExample {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
        BeanFactoryPostProcessorExampleBean bean = context.getBean(BeanFactoryPostProcessorExampleBean.class);
        bean.doSomething();
    }


}
