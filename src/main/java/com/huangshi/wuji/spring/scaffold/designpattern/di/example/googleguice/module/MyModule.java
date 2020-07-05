package com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.module;

import com.google.inject.AbstractModule;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.MessageService;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.service.FacebookService;

public class MyModule extends AbstractModule {
//module就是injector

    @Override
    protected void configure() {
        //把具体要注入的service绑定给MessageService接口
        bind(MessageService.class).to(FacebookService.class);
    }
}
