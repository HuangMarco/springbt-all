package com.huangshi.wuji.spring.scaffold.externalized.configuration;

import com.huangshi.wuji.spring.scaffold.externalized.configuration.config.ExternalizedConfig;
import com.huangshi.wuji.spring.scaffold.externalized.configuration.model.ExternalizedMyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExternalizedTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ExternalizedMyBean.class);

        //下面这种方式不会打印出application.properties中的配置值：externalized.name=marco
        //因为application.properties只有在SB应用启动的时候，才会被扫描，加载
        System.out.println(ctx.getBean(ExternalizedMyBean.class).getName());

    }
}
