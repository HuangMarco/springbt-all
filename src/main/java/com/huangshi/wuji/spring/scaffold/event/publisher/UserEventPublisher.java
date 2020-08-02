package com.huangshi.wuji.spring.scaffold.event.publisher;

import com.huangshi.wuji.spring.scaffold.event.UserCreatedEvent;
import com.huangshi.wuji.spring.scaffold.event.event.UserRemovedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserEventPublisher {

    private final ApplicationEventPublisher publisher;

    public void publishEvent(final String name){
        // 发布事件，如果你的事件是继承于ApplicationEvent的
        publisher.publishEvent(new UserCreatedEvent(this, name));
        // 发布事件如果你的Event是一个POJO
        publisher.publishEvent(new UserRemovedEvent(name));
    }


    private final ApplicationContext context;

    @Autowired
    public UserEventPublisher(ApplicationEventPublisher publisher, ApplicationContext context) {
        this.publisher = publisher;
        this.context = context;
    }

    public void publishViaContext(String name){
        System.out.println("通过上下文方式发布事件：：：：：");
        context.publishEvent(new UserCreatedEvent(this,name));
    }


}
