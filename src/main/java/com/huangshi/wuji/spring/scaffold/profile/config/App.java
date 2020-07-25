package com.huangshi.wuji.spring.scaffold.profile.config;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class App {

    private String name;
    private int threadCount;
    private List<String> users = new ArrayList<>();

}
