package com.huangshi.wuji.spring.scaffold.bean.lifecycle.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService implements IMessageService {

    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);

    @Value(value = "${my.msg}")
    private String message;

    @Override
    public String getMessage() {

        return message;
    }

    @PostConstruct
    public void doLog() {
        logger.info("Info message in MessageService");
    }


}
