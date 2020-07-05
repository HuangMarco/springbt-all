package com.huangshi.wuji.spring.scaffold.designpattern.di.example.scenario2;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.scenario1.EmailService;

public class MyApplication {

    private EmailService email = null;

    public MyApplication(EmailService svc){
        this.email=svc;
    }

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }
}
