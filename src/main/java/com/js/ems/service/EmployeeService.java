package com.js.ems.service;

import com.js.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> list();

    public void save(Employee employee);

    public Employee findById(long employeeID);

    public void deleteById(long employeeID);

}
