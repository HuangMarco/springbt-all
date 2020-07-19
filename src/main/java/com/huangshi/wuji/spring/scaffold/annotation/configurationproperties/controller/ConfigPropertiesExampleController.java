package com.huangshi.wuji.spring.scaffold.annotation.configurationproperties.controller;

import com.huangshi.wuji.spring.scaffold.annotation.configurationproperties.configuration.ConfigPropertiesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesExampleController {

    @Autowired
    private ConfigPropertiesExample example;

    @RequestMapping(value = "/query/configuration", method = RequestMethod.GET)
    public String getConfigPropertiesExample(){
        return example.getAdditionalHeaders().toString();
    }
}
