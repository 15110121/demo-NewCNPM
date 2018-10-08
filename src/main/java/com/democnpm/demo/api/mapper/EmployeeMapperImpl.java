package com.democnpm.demo.api.mapper;

import com.democnpm.demo.api.dto.EmployeeCreatedDTO;
import com.democnpm.demo.api.dto.EmployeeDTO;
import com.democnpm.demo.api.dto.EmployeeUpdatedDTO;
import com.democnpm.demo.domain.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public EmployeeDTO employeeToEmployeeDto(Employee employee) {
        if (employee == null) return null;
        else {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employee.getId());
            employeeDTO.setAge(employee.getAge());
            employeeDTO.setCompany(employee.getCompany());
            employeeDTO.setName(employee.getName());
            employeeDTO.setEmail(employee.getEmail());
            return employeeDTO;
        }
    }

    @Override
    public Employee employeeCreatedDTOToEmployee(EmployeeCreatedDTO employeeCreatedDTO) {
        if (employeeCreatedDTO == null) return null;
        else {
            Employee employee = new Employee();
            employee.setName(employeeCreatedDTO.getName());
            employee.setAge(employeeCreatedDTO.getAge());
            employee.setCompany(employeeCreatedDTO.getCompany());
            employee.setEmail(employeeCreatedDTO.getEmail());
            return employee;
        }
    }

    @Override
    public Employee employeeUpdatedDTOToEmployee(EmployeeUpdatedDTO employeeUpdatedDTO) {
        if (employeeUpdatedDTO == null) return null;
        else {
            Employee employee = new Employee();
            employee.setAge(employeeUpdatedDTO.getAge());
            employee.setName(employeeUpdatedDTO.getName());
            employee.setCompany(employeeUpdatedDTO.getCompany());
            employee.setEmail(employeeUpdatedDTO.getEmail());
            return employee;
        }
    }
}
