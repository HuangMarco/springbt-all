package com.huangshi.wuji.spring.scaffold.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

import java.util.Map;

public class DefaultSystemSourcesExample {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment env = ctx.getEnvironment();

        printSources(env);
        System.out.println("---- System properties -----");
        printMap(env.getSystemProperties());
        System.out.println("---- System Env properties -----");
        printMap(env.getSystemEnvironment());

    }

    private static void printSources (ConfigurableEnvironment env) {
        System.out.println("---- property sources ----");
        for (PropertySource<?> propertySource : env.getPropertySources()) {
            System.out.println("name =  " + propertySource.getName() + "\nsource = " + propertySource
                    .getSource().getClass()+"\n");
        }
    }

    private static void printMap (Map<?, ?> map) {
        map.entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

    }
}
