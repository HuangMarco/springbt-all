package com.huangshi.wuji.spring.scaffold.event.event;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class UserRemovedEvent {

    private String name;

    public UserRemovedEvent(String name) {
        this.name = name;
    }

    public UserRemovedEvent(){}
}
