package com.huangshi.wuji.spring.scaffold.externalized.configuration.controller;

import com.huangshi.wuji.spring.scaffold.externalized.configuration.model.ExternalizedMyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalizedController {

    @Autowired
    private ExternalizedMyBean myBean;

    @RequestMapping(value = "/query/employee", method = RequestMethod.GET)
    public String queryExternalizedMyBean(@RequestParam("name") String name) {

        return myBean.getName();

    }

}
