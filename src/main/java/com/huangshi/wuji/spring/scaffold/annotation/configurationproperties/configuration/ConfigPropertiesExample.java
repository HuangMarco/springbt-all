package com.huangshi.wuji.spring.scaffold.annotation.configurationproperties.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

@Component
@Getter
@Setter
@Validated
@ConfigurationProperties(prefix="mail",ignoreInvalidFields = true, ignoreUnknownFields = false)
public class ConfigPropertiesExample {

    private String host;
    private int port;
    private String from;
    private List<String> defaultRecipients;
    private Map<String, String> additionalHeaders;


}
