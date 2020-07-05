package com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.injectors;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.Consumer;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.MyDIApplication;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.MyDIApplicationSetterExample;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.EmailServiceImpl;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.scenario1.MyApplication;

public class EmailServiceSetterExampleInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplicationSetterExample app = new MyDIApplicationSetterExample();
        app.setService(new EmailServiceImpl());
        return app;
    }
}
