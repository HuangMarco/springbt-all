package com.huangshi.wuji.spring.scaffold;

import com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example1.model.BenzCar;
import com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example1.model.Engine;
import com.huangshi.wuji.spring.scaffold.beanfactorypostprocessor.example1.proxy.SpecialBeanForEngine;
import com.huangshi.wuji.spring.scaffold.commandlinerunner.service.HelloService;
import com.huangshi.wuji.spring.scaffold.performance.logging.service.PerformanceEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringScaffoldApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringScaffoldApplication.class);

	public static void main(String[] args) {
		System.out.println("The service is to start.");
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringScaffoldApplication.class, args);
		HelloService hello = ctx.getBean(HelloService.class);
		logger.info(hello.sayHello());
		System.out.println("The service has started.");
	}

	@Autowired
	private PerformanceEmployeeService performanceEmployeeService;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

			logger.info("Start to deal with Performance Logging time calculation exmaple...");

			System.out.println(performanceEmployeeService.getEmployeeById(1L));

			logger.info("End of deal with Performance Logging time calculation exmaple...");

		};
	}


//	@Bean(initMethod="start")
//	BenzCar benzCar(Engine engine){
//		BenzCar car = new BenzCar();
//		car.engine = engine;
//		return car ;
//	}
//
//	@Bean
//	SpecialBeanForEngine specialBeanForEngine(){
//		return new SpecialBeanForEngine();
//	}

}
