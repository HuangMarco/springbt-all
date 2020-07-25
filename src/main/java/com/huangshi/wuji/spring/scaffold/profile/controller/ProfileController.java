package com.huangshi.wuji.spring.scaffold.profile.controller;

import com.huangshi.wuji.spring.scaffold.constants.SBScaffoldConstants;
import com.huangshi.wuji.spring.scaffold.profile.config.ServerProperties;
import com.huangshi.wuji.spring.scaffold.profile.model.ProfileCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= SBScaffoldConstants.API_Profile)
public class ProfileController {

    @Value("${app.environment}")
    private String environment;

    @Autowired
    private ProfileCity city;

    @Autowired
    private ServerProperties server;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String getEnvironment(){
        return "current application environment is::::" + environment;
    }

    @RequestMapping(value = "/query/city", method = RequestMethod.GET)
    public String getCity(){
        return "current city is::::" + city.getName()+city.getCode();
    }

    @RequestMapping(value = "/query/server", method = RequestMethod.GET)
    public String getServer(){
        StringBuilder sb = new StringBuilder("\"current server is::::\"");
        sb.append(server.getUrl());
        sb.append("-");
        sb.append(server.getApp().getName());
        sb.append("-");
        sb.append(server.getApp().getUsers());
        return  sb.toString();
    }


}
