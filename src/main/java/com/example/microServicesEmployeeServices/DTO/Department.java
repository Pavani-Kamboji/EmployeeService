package com.example.microServicesEmployeeServices.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

    private Long deptId;
    private String deptName;
    private String deptAddress;
}
