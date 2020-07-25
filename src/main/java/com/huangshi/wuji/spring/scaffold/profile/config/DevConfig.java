package com.huangshi.wuji.spring.scaffold.profile.config;

import com.huangshi.wuji.spring.scaffold.profile.model.ProfileCity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public ProfileCity city(){
        return new ProfileCity("Shanghai", "20000");
    }

}
