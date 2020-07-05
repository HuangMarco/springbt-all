package com.huangshi.wuji.spring.scaffold.ioc;

import com.huangshi.wuji.spring.scaffold.ioc.component.MyApplication;
import com.huangshi.wuji.spring.scaffold.ioc.configuration.DIConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);

        app.processMessage("Hi Pankaj", "pankaj@abc.com");

        //close the context
        context.close();
    }

}
