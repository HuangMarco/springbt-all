package com.huangshi.wuji.spring.scaffold.profile.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Configuration
@ConfigurationProperties
//@EnableConfigurationProperties
public class YamlConfig {

    private String name;
    private String environment;
    private List<String> servers = new ArrayList<>();

}
