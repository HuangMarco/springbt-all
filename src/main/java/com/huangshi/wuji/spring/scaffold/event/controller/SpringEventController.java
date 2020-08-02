package com.huangshi.wuji.spring.scaffold.event.controller;

import com.huangshi.wuji.spring.scaffold.constants.SBScaffoldConstants;
import com.huangshi.wuji.spring.scaffold.event.publisher.UserEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = SBScaffoldConstants.API_Event)
public class SpringEventController {

    @Autowired
    UserEventPublisher publisher;

    @RequestMapping(value = "/publishe/event",method = RequestMethod.GET)
    public void publishEvent(){
        publisher.publishEvent("007");
        publisher.publishViaContext("009");
    }
}
