package com.brn.home.controller;

import com.brn.home.entity.EmployeeEntity;
import com.brn.home.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: bruno
 * Date: 9/7/13
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class EditEmployeeController {

    private EmployeeManager employeeManager;

    @Autowired
    public EditEmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listEmployees(ModelMap map) {
        map.addAttribute("employee", new EmployeeEntity());
        map.addAttribute("employeeList", employeeManager.getAllEmployees());

        return "editEmployeeList";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute(value = "employee") EmployeeEntity employee, BindingResult result) {
        employeeManager.addEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/delete/{employeeId}")
    public String deleteEmplyee(@PathVariable("employeeId") Integer employeeId) {
        employeeManager.deleteEmployee(employeeId);
        return "redirect:/";
    }

    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
}
