package com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.MessageService;

public class MyDIApplication implements Consumer {

    //引用service接口
    private MessageService messageService;

    public MyDIApplication(MessageService svc) {
        this.messageService = svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.messageService.sendMessage(msg, rec);

    }
}
