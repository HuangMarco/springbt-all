package com.huangshi.wuji.spring.scaffold.applicationrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
@Order(3)
public class ApplicationRunnerBean implements ApplicationRunner {
    public static final Logger logger = LoggerFactory.getLogger(ApplicationRunnerBean.class);

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        String args = Arrays.stream(arg0.getSourceArgs()).collect(Collectors.joining("|"));
        logger.info("Application started with arguments:" + args + ", and also stars with order: 3");
    }
}
