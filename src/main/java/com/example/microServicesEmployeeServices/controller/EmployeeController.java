package com.example.microServicesEmployeeServices.controller;

import com.example.microServicesEmployeeServices.DTO.EmployeeDepartment;
import com.example.microServicesEmployeeServices.entity.Employee;
import com.example.microServicesEmployeeServices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}/dept")
    public EmployeeDepartment getEmployeeByDepartment(@PathVariable("id") Long deptId){
        return employeeService.getEmployeeWithDepartment(deptId);
    }
}
