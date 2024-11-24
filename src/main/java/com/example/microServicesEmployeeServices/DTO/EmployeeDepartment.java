package com.example.microServicesEmployeeServices.DTO;

import com.example.microServicesEmployeeServices.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDepartment {
    private Employee employee;
    private Department department;
}
