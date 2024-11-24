package com.example.microServicesEmployeeServices.service.impl;

import com.example.microServicesEmployeeServices.DTO.Department;
import com.example.microServicesEmployeeServices.DTO.EmployeeDepartment;
import com.example.microServicesEmployeeServices.entity.Employee;
import com.example.microServicesEmployeeServices.repository.EmployeeRepository;
import com.example.microServicesEmployeeServices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeDepartment getEmployeeWithDepartment(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        Department department = restTemplate.getForObject("http://localhost:9090/api/dept/20/"+employee.getDeptId(), Department.class);
        EmployeeDepartment response = new EmployeeDepartment();
        response.setEmployee(employee);
        response.setDepartment(department);
        return response;
    }
}
