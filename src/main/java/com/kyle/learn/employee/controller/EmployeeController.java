package com.kyle.learn.employee.controller;

import org.springframework.web.bind.annotation.*;

import com.kyle.learn.employee.model.Employee;
import com.kyle.learn.employee.services.EmployeeService;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees/")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}