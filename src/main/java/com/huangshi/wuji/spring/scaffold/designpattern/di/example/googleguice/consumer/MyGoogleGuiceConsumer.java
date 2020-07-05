package com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.consumer;

import com.google.inject.Inject;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.MessageService;

public class MyGoogleGuiceConsumer {

    private MessageService svc;

//    @Inject
//    public MyGoogleGuiceConsumer(MessageService svc) {
//        this.svc = svc;
//    }

    @Inject
    public void setService(MessageService svc){
        this.svc = svc;
    }

    public void sendMessage(String msg, String rec){
        //some business logic here
        this.svc.sendMessage(msg, rec);
    }

}
