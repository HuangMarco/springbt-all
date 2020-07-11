package com.huangshi.wuji.spring.scaffold.aop;


import com.huangshi.wuji.spring.scaffold.aop.configuration.AOPApplication;
import com.huangshi.wuji.spring.scaffold.aop.service.AOPEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPApplication.class);

//        Employee employee = new Employee();
//        employee.setName("Marco");

        AOPEmployeeService employeeService = context.getBean(AOPEmployeeService.class);

//        employeeService.setEmployee(employee);
        System.out.println(employeeService.toString());
        System.out.println(employeeService.getEmployee());
        System.out.println(employeeService.getEmployee().getName());

        employeeService.getEmployee().setName("Pankaj");

        employeeService.getEmployee();

        context.close();
    }
}
