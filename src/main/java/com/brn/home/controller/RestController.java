package com.brn.home.controller;

import com.brn.home.entity.EmployeeEntity;
import com.brn.home.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bruno
 * Date: 9/15/13
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("api")
public class RestController {

    private EmployeeManager employeeManager;

    @Autowired
    public RestController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @RequestMapping("employe/{id}")
    @ResponseBody
    public List<EmployeeEntity> getEmployeById(@PathVariable Long id) {
        return employeeManager.getAllEmployees();
    }
}
