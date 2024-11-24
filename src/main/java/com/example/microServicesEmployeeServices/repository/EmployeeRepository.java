package com.example.microServicesEmployeeServices.repository;

import com.example.microServicesEmployeeServices.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
