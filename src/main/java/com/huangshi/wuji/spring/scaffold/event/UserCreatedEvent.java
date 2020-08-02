package com.huangshi.wuji.spring.scaffold.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


@Data
public class UserCreatedEvent extends ApplicationEvent{

    private String name;

    public UserCreatedEvent(Object source,String name) {
        super(source);
        this.name = name;
    }

}
