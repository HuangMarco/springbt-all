package com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.consumer.MyGoogleGuiceConsumer;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.module.MyModule;

public class ClientApplication {

    public static void main(String[] args) {
        //module就是injector
        Injector injector = Guice.createInjector(new MyModule());

        MyGoogleGuiceConsumer app = injector.getInstance(MyGoogleGuiceConsumer.class);

        app.sendMessage("hello! Google Guice DI!", "ht5764750@163.com");

    }
}
