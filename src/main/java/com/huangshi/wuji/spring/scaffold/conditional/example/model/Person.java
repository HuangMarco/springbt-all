package com.huangshi.wuji.spring.scaffold.conditional.example.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {

    private String name;
    private Integer age;

    @Value(value = "${conditional.attr}")
    private String attribute;

    //必须要有空的构造方法！否则上下文初始化会失败,SB不知道运用哪个去构造
    public Person(){}

    //构造方法与@Component起冲突

    public Person(String name, Integer age, String attribute) {
        this.name = name;
        this.age = age;
        this.attribute = attribute;
    }
}
