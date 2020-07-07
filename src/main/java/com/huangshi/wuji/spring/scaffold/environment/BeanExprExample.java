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
        //Spring EL表达式应该应用下面被注释掉的这行，之所以注释掉是因为底下的EL路径没有匹配上
        //为了能让项目正常运行，所以注释掉了，如果用EL，请改回并取消23行
//        @Value("#{app.properties['newPropertityAddedByMarco']}")
        @Value("${newPropertityAddedByMarco:defaultValue}")
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
