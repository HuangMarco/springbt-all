package com.huangshi.wuji.spring.scaffold.environment.environmentpostprocessor.controller;

import com.huangshi.wuji.spring.scaffold.constants.SBScaffoldConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= SBScaffoldConstants.API_Environment_Post_Processor)
public class EnvironmentPostProcessorController {

    @Value("${com.huang.environmentpostprocessor.gross.calculation.tax.rate}")
    double taxRate;

    @RequestMapping(value="/query/postprocessor/value", method = RequestMethod.GET)
    public String queryPostProcessorValue(){
        return String.valueOf(taxRate);
    }
}
