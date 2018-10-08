package com.democnpm.demo.service;

import com.democnpm.demo.api.dto.EmployeeCreatedDTO;
import com.democnpm.demo.api.dto.EmployeeDTO;
import com.democnpm.demo.api.dto.EmployeeUpdatedDTO;

import java.util.Set;

public interface EmployeeService {
    Set<EmployeeDTO> getAllEmployee();

    EmployeeDTO addEmployee(EmployeeCreatedDTO employeeCreatedDTO);

    EmployeeDTO updateEmployee(EmployeeUpdatedDTO employeeUpdatedDTO);

    void deleteEmployee(Long id);
}
