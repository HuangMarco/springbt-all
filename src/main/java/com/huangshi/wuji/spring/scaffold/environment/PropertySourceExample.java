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
        System.out.println("newPropertityAddedByMarco value is " + property);

        printSources(env);
        //printing all sources
        System.out.println(env.getPropertySources());
    }


    private static void printSources (ConfigurableEnvironment env) {
        System.out.println("---- property sources ----");
        for (org.springframework.core.env.PropertySource<?> propertySource : env.getPropertySources()) {
            System.out.println("name =  " + propertySource.getName() + "\nsource = " + propertySource
                    .getSource().getClass()+"\n");
        }
    }
}
