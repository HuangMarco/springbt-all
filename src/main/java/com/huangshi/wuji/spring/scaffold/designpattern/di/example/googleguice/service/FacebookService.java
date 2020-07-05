package com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.service;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.MessageService;

public class FacebookService implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        //some complex code to send Facebook message
        System.out.println("Message sent to Facebook user "+rec+" with message="+msg);
    }
}
