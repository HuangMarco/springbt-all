package com.huangshi.wuji.spring.scaffold.conditional.example.configuration;

import com.huangshi.wuji.spring.scaffold.conditional.example.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "bill1")
    public Person person1(){
        return new Person("Bill Gates",62);
    }

    @Bean("linus1")
    public Person person2(){
        return new Person("Linus",48);
    }
}
