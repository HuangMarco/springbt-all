package com.huangshi.wuji.spring.scaffold.event.event;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class AfterUserRemovedEvent {

    private String message;

    public AfterUserRemovedEvent(String message) {
        this.message = message;
    }

    public AfterUserRemovedEvent(){}
}
