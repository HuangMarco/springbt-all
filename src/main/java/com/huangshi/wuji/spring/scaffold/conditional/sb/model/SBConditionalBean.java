package com.huangshi.wuji.spring.scaffold.conditional.sb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value="conditional.mybean.enabled", havingValue = "true", matchIfMissing = true)
@Getter
@Setter
public class SBConditionalBean {
    private String beanAttr;

}
