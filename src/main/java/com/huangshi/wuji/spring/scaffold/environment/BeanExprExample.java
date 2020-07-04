package com.huangshi.wuji.spring.scaffold.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
public class BeanExprExample {

    @Bean
    public MyBean myBean () {
        return new MyBean();
    }

    public static class MyBean {
        @Value("#{app.properties['newPropertityAddedByMarco']}")
        private String userHome;

        public void showProp () {
            System.out.println(userHome);
        }
    }

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanExprExample.class);
        context.getBean(MyBean.class)
                .showProp();
    }

}
