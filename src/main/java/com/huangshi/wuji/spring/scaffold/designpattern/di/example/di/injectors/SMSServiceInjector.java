package com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.injectors;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.Consumer;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.MyDIApplication;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
