package com.huangshi.wuji.spring.scaffold.environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@PropertySource("classpath:app.properties")
public class PropertySourceExample {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PropertySourceExample.class);
        ConfigurableEnvironment env = context.getEnvironment();
        String property = env.getProperty("newPropertityAddedByMarco");
        System.out.println("some-strProp value is " + property);

        //printing all sources
        System.out.println(env.getPropertySources());
    }
}
