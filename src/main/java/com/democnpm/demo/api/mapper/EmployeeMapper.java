package com.democnpm.demo.api.mapper;

import com.democnpm.demo.api.dto.EmployeeCreatedDTO;
import com.democnpm.demo.api.dto.EmployeeDTO;
import com.democnpm.demo.api.dto.EmployeeUpdatedDTO;
import com.democnpm.demo.domain.Employee;

public interface EmployeeMapper {
    EmployeeDTO employeeToEmployeeDto(Employee employee);

    Employee employeeCreatedDTOToEmployee(EmployeeCreatedDTO employeeCreatedDTO);

    Employee employeeUpdatedDTOToEmployee(EmployeeUpdatedDTO employeeUpdatedDTO);
}
