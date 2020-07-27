package com.huangshi.wuji.spring.scaffold.rest.aop.controller;


import com.huangshi.wuji.spring.scaffold.constants.SBScaffoldConstants;
import com.huangshi.wuji.spring.scaffold.rest.aop.model.RestEmployee;
import com.huangshi.wuji.spring.scaffold.rest.aop.service.RestEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SBScaffoldConstants.API_SB_AOP)
public class SpringBootAopController {

    @Autowired
    private RestEmployeeService employeeService;

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public RestEmployee addEmployee(@RequestParam("name") String name, @RequestParam("empId") String empId) {

        return employeeService.createEmployee(name, empId);

    }

    @RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
    public String removeEmployee( @RequestParam("empId") String empId) {

        employeeService.deleteEmployee(empId);

        return "Employee removed";
    }

}
