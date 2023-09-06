package com.example.springbootdemoproject.service;

import com.example.springbootdemoproject.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getAllEmployeeById(long id);
}
