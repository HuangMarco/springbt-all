package com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.injectors;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.Consumer;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.MyDIApplication;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector{

    @Override
    public Consumer getConsumer() {

        return new MyDIApplication(new EmailServiceImpl());
    }
}
