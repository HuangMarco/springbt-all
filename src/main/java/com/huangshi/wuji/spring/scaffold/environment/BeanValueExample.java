package com.huangshi.wuji.spring.scaffold.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class BeanValueExample {

    @Bean
    public MyBean myBean () {
        return new MyBean();
    }

    public static class MyBean {
        @Value("${newPropertityAddedByMarco:defaultValue}")
        private String str;


        public void showProp () {
            System.out.println(str);
        }
    }

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanValueExample.class);
        context.getBean(MyBean.class).showProp();
    }


}



