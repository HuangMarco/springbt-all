package com.huangshi.wuji.spring.scaffold.applicationcontext.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public Course(){}
}
