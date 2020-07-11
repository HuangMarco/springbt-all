package com.huangshi.wuji.spring.scaffold.bean.lifecycle.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class BeanEmployee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
