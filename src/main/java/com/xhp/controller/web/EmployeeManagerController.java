package com.xhp.controller.web;

import com.xhp.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by xuhaipeng on 2017/1/9.
 */
@Controller
public class EmployeeManagerController {

    @Autowired
    private  EmployeeDao employeeDao;

    @GetMapping(value = "/hello")
    public String sayHello(Map<String, Object> map){
        map.put("hello", "from TemplateController.helloHtml");
        return "hello";
    }

    @GetMapping(value = "/listEmployee")
    public String listEmployee(Map<String, Object> map){
        map.put("employees", employeeDao.findAll());
        return "listemployee";
    }

}
