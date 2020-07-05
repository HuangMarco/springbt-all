package com.huangshi.wuji.spring.scaffold.designpattern.di.example.di;


import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.Consumer;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.injectors.EmailServiceInjector;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.injectors.MessageServiceInjector;

public class MyMessageDITest {

    public static void main(String[] args) {
        String message = "hello! DI!";
        String email = "ht5764@163.com";
        MessageServiceInjector injector = null;
        Consumer consumer = null;

        //运行时指定具体类型
        injector = new EmailServiceInjector();
        consumer = injector.getConsumer();
        consumer.processMessages(message,email);
    }
}
