package com.js.ems.service.impl;

import com.js.ems.entity.Employee;
import com.js.ems.repository.EmployeeRepository;
import com.js.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findById(long employeeID) {
        return employeeRepository.findById(employeeID).get();
    }

    @Override
    public void deleteById(long employeeID) {
        employeeRepository.deleteById(employeeID);

    }
}
