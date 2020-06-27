package com.huangshi.wuji.spring.scaffold.commandlinerunner.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
@Order(2)
public class CommandLineRunnerBeanTwo implements CommandLineRunner {
    public static final Logger logger = LoggerFactory.getLogger(CommandLineRunnerBeanTwo.class);

    @Override
    public void run(String... args) throws Exception {
        String strArgs = Arrays.stream(args).collect(Collectors.joining("|"));
        logger.info("Application started with arguments:" + strArgs+ ", and also stars with order: 2");
    }
}
