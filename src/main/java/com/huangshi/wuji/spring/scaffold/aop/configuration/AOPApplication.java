package com.huangshi.wuji.spring.scaffold.aop.configuration;

import com.huangshi.wuji.spring.scaffold.aop.service.AOPEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"com.huangshi.wuji.spring.scaffold.aop.model","com.huangshi.wuji.spring.scaffold.aop.service"})
public class AOPApplication {

//    @Bean
//    public AOPEmployeeService getAOPEmployeeService(){
//        return new AOPEmployeeService();
//    }
}
