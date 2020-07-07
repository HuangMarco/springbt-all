package com.huangshi.wuji.spring.scaffold.bean.lifecycle.rest;

import com.huangshi.wuji.spring.scaffold.bean.lifecycle.service.IMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class MyController {

    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @Autowired
    IMessageService messageService;

    @RequestMapping(value = "/getMessage")
    public String getMessage() {

        String message = messageService.getMessage();

        return message;
    }

    @PostConstruct
    public void doLog() {
        logger.info("Info message in MyController");
    }
}
