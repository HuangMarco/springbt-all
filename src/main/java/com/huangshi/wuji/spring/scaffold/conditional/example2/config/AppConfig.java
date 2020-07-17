package com.huangshi.wuji.spring.scaffold.conditional.example2.config;

import com.huangshi.wuji.spring.scaffold.conditional.example2.MongoDBDatabaseTypeCondition;
import com.huangshi.wuji.spring.scaffold.conditional.example2.PostgreSQLDatabaseTypeCondition;
import com.huangshi.wuji.spring.scaffold.conditional.example2.dao.JdbcUserDAO;
import com.huangshi.wuji.spring.scaffold.conditional.example2.dao.MongoUserDAO;
import com.huangshi.wuji.spring.scaffold.conditional.example2.dao.UserDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Conditional(PostgreSQLDatabaseTypeCondition.class)
    public UserDAO jdbcUserDAO(){
        return new JdbcUserDAO();
    }

    @Bean
    @Conditional(MongoDBDatabaseTypeCondition.class)
    public UserDAO mongoUserDAO(){
        return new MongoUserDAO();
    }
}
