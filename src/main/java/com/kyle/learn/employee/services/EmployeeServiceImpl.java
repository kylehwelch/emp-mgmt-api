package com.kyle.learn.employee.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.kyle.learn.employee.entities.EmployeeEntity;
import com.kyle.learn.employee.model.Employee;
import com.kyle.learn.employee.respository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = null;

        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }

}
