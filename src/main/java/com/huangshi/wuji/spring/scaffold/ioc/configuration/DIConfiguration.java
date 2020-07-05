package com.huangshi.wuji.spring.scaffold.ioc.configuration;

import com.huangshi.wuji.spring.scaffold.ioc.service.EmailServiceImpl;
import com.huangshi.wuji.spring.scaffold.ioc.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"com.huangshi.wuji.spring.scaffold.ioc.component"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService(){
        return new EmailServiceImpl();
    }

}
