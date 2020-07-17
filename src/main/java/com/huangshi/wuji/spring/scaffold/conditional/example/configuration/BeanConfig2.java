package com.huangshi.wuji.spring.scaffold.conditional.example.configuration;

import com.huangshi.wuji.spring.scaffold.conditional.example.condition.LinuxCondition;
import com.huangshi.wuji.spring.scaffold.conditional.example.condition.WindowsCondition;
import com.huangshi.wuji.spring.scaffold.conditional.example.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {

    //只有一个类时，大括号可以省略
    //如果WindowsCondition的实现方法返回true，则注入这个bean

    @Conditional({WindowsCondition.class})
    @Bean(name = "billt")
    public Person person1(){
        return new Person("Bill Gates",62);
    }

    //如果LinuxCondition的实现方法返回true，则注入这个bean
    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person2(){
        return new Person("Linus",48);
    }



}
