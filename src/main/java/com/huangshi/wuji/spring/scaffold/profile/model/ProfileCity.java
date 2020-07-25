package com.huangshi.wuji.spring.scaffold.profile.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileCity {

    private String name;
    private String code;

    public ProfileCity(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public ProfileCity(){}
}
