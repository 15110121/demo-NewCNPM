package com.democnpm.demo.service;

import com.democnpm.demo.api.dto.EmployeeCreatedDTO;
import com.democnpm.demo.api.dto.EmployeeDTO;
import com.democnpm.demo.api.dto.EmployeeUpdatedDTO;
import com.democnpm.demo.api.mapper.EmployeeMapper;
import com.democnpm.demo.domain.Employee;
import com.democnpm.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   private final EmployeeRepository employeeRepository;
   private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public Set<EmployeeDTO> getAllEmployee() {
        return employeeRepository.findAll().stream().map(employeeMapper::employeeToEmployeeDto).collect(Collectors.toSet());
    }

    @Override
    public EmployeeDTO addEmployee(EmployeeCreatedDTO employeeCreatedDTO) {
         Employee savedEmployee= employeeRepository.save(employeeMapper.employeeCreatedDTOToEmployee(employeeCreatedDTO));
         return employeeMapper.employeeToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeUpdatedDTO employeeUpdatedDTO) {
        Employee updateEmployee = employeeRepository.save(employeeMapper.employeeUpdatedDTOToEmployee(employeeUpdatedDTO));
        return employeeMapper.employeeToEmployeeDto(updateEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
