package com.huangshi.wuji.spring.scaffold.annotation.configurationproperties.controller;

import com.huangshi.wuji.spring.scaffold.annotation.configurationproperties.configuration.ConfigPropertiesExample;
import com.huangshi.wuji.spring.scaffold.constants.SBScaffoldConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= SBScaffoldConstants.API_Config_Properties)
public class ConfigPropertiesExampleController {

    @Autowired
    private ConfigPropertiesExample example;

    @RequestMapping(value = "/query/configuration", method = RequestMethod.GET)
    public String getConfigPropertiesExample(){
        return example.getAdditionalHeaders().toString();
    }
}
