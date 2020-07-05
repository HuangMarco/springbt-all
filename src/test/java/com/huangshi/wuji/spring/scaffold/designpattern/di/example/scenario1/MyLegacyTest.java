package com.huangshi.wuji.spring.scaffold.designpattern.di.example.scenario1;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.scenario1.*;

public class MyLegacyTest {

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessages("Hi DI pattern", "mydependencyinjectionpattern@abc.com");
    }
}
