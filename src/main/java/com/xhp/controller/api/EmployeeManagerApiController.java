package com.xhp.controller.api;

import com.xhp.dao.EmployeeDao;
import com.xhp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by xuhaipeng on 2017/1/9.
 */
@RestController
@RequestMapping(value = "/api/em")
public class EmployeeManagerApiController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return "This is a api of employees";
    }

    @GetMapping(value = "/employees")
    public List<Employee> listEmployee(){
        System.out.println("Hello out");
        return null;
    }

    @RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        System.out.println("Hello out1111");
        List<Employee> ls = employeeDao.findAll();
        System.out.println("Hello out2222");
        return ls;
    }
}
