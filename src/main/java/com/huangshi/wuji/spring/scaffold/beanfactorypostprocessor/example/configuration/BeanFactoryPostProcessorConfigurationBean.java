package com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example.configuration;

import com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example.model.BeanFactoryPostProcessorExampleBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class BeanFactoryPostProcessorConfigurationBean implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory (
            ConfigurableListableBeanFactory beanFactory)
            throws BeansException {

        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(BeanFactoryPostProcessorExampleBean.class);
        bd.getPropertyValues().add("strProp", "my " +
                "" +
                " property");

        ((DefaultListableBeanFactory) beanFactory)
                .registerBeanDefinition("myBeanName", bd);
    }
}
