package com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example.configuration;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactoryPostProcessorConfig {

    @Bean
    BeanFactoryPostProcessorConfigurationBean myConfigBean () {
        return new BeanFactoryPostProcessorConfigurationBean();
    }


    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return factory -> {

            BeanDefinitionRegistry registry = (BeanDefinitionRegistry) factory;

            registry.registerBeanDefinition("AnotherBeanFactoryPostProcessorExampleBean",
                    BeanDefinitionBuilder.genericBeanDefinition(String.class)
                            .addConstructorArgValue("This is myBean")
                            .getBeanDefinition()
            );
        };
    }
}
