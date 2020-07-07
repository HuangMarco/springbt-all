package com.huangshi.wuji.spring.scaffold.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class PropertySourceBeanExample {

    /**
     * 因为该处于BeanExprExample中的myBean方法重合，所以会报错：
     * The bean 'myBean', defined in class path resource [com/huangshi/wuji/spring/scaffold/environment/BeanValueExample.class], could not be registered.
     * A bean with that name has already been defined in class path resource [com/huangshi/wuji/spring/scaffold/environment/BeanExprExample.class] and overriding is disabled.
    @Bean
    public MyBean myBean () {
        return new MyBean();
    }
    **/


    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        PropertySourceBeanExample.class);
        context.getBean(MyBean.class).showProperty();
    }


    public static class MyBean {
        @Autowired
        Environment env;

        public void showProperty () {
            System.out.println(env.getProperty("newPropertityAddedByMarco"));
        }
    }
}
