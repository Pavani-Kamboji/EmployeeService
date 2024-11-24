package com.example.microServicesEmployeeServices.service;

import com.example.microServicesEmployeeServices.DTO.EmployeeDepartment;
import com.example.microServicesEmployeeServices.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    EmployeeDepartment getEmployeeWithDepartment(Long id);
}
