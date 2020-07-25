package com.huangshi.wuji.spring.scaffold.profile.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("server")
@Getter
@Setter
public class ServerProperties {

    private String url;

    private App app = new App();

}
