package com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example1.proxy;

import com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example1.model.Engine;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SpecialBeanForEngine implements BeanFactoryPostProcessor, BeanNameAware {

    String name;

    @Override
    public void setBeanName(String name) {
        this.name =name;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinitionRegistry bdr = (BeanDefinitionRegistry)configurableListableBeanFactory;
        GenericBeanDefinition gbd = new GenericBeanDefinition();
        gbd.setBeanClass(EngineFactory.class);
        gbd.setScope(BeanDefinition.SCOPE_SINGLETON);
        gbd.setAutowireCandidate(true);
        bdr.registerBeanDefinition("engine01-gbd", gbd);
    }


    public static class EngineFactory implements FactoryBean<Engine>, BeanNameAware, InvocationHandler {

        String name;

        @Override
        public Engine getObject() throws Exception {
            System.out.println("EngineFactory  to build Engine01 , EngineFactory :"+ name);
            Engine prox = (Engine) Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{Engine.class}, this);
            return prox;
        }

        @Override
        public Class<?> getObjectType() {
            return Engine.class;
        }

        @Override
        public boolean isSingleton() {
            return true;
        }

        @Override
        public void setBeanName(String name) {
            this.name = name;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("here is invoke  engine:"+method.getName());
            return proxy;
        }
    }



}
