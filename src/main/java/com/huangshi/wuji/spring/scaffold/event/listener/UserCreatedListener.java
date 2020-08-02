package com.huangshi.wuji.spring.scaffold.event.listener;

import com.huangshi.wuji.spring.scaffold.event.UserCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

    @Override
    public void onApplicationEvent(UserCreatedEvent userCreatedEvent) {
        System.out.println(String.format("该用户被创建: %s", userCreatedEvent.getName()));
    }





}
