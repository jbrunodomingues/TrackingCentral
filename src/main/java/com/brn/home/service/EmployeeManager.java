package com.brn.home.service;

import com.brn.home.entity.EmployeeEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bruno
 * Date: 9/7/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeManager {
    public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}
