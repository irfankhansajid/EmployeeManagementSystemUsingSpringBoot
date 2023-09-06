package com.example.springbootdemoproject.repository;

import com.example.springbootdemoproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
