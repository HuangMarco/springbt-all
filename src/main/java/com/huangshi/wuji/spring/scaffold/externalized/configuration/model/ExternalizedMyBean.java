package com.huangshi.wuji.spring.scaffold.externalized.configuration.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ExternalizedMyBean {

    @Value(value ="${externalized.name}")
    private String name;

}
