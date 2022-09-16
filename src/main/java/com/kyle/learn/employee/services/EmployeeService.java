package com.kyle.learn.employee.services;

import java.util.List;

import com.kyle.learn.employee.model.Employee;

public interface EmployeeService {
    
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

}
