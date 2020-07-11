package com.huangshi.wuji.spring.scaffold;

import com.huangshi.wuji.spring.scaffold.commandlinerunner.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringScaffoldApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringScaffoldApplication.class);

	public static void main(String[] args) {
		System.out.println("The service is to start.");
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringScaffoldApplication.class, args);
		HelloService hello = ctx.getBean(HelloService.class);
		logger.info(hello.sayHello());
		System.out.println("The service has started.");
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
}
