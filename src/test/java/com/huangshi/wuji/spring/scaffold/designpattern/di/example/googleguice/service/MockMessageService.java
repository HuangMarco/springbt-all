package com.huangshi.wuji.spring.scaffold.designpattern.di.example.googleguice.service;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.service.MessageService;

public class MockMessageService implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("msg = [" + msg + "], rec = [" + rec + "]");
    }
}
