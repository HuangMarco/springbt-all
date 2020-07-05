package com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.injectors;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.Consumer;

public interface MessageServiceInjector {

    public Consumer getConsumer();
}
