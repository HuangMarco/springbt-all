package com.huangshi.wuji.spring.scaffold.applicationcontext.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {

    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void destroy() {
        System.out.println("Student(no: " + no + ") is destroyed");
    }

    public Student(){}
}
