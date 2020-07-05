package com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.MessageService;

public class MyDIApplicationSetterExample implements Consumer{

    private MessageService svc;

    //setter dependency injection
    public void setService(MessageService service) {
        this.svc = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.svc.sendMessage(msg,rec);
    }
}
