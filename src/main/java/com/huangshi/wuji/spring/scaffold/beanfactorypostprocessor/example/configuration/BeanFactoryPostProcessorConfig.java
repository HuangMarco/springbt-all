package com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactoryPostProcessorConfig {

    @Bean
    BeanFactoryPostProcessorConfigurationBean myConfigBean () {
        return new BeanFactoryPostProcessorConfigurationBean();
    }

}
