package com.huangshi.wuji.spring.scaffold.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class InvalidInitExampleBean {

    @Autowired
    private Environment env;

    public InvalidInitExampleBean() {
        env.getActiveProfiles();
    }
}
