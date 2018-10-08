package com.democnpm.demo.controller;

import com.democnpm.demo.api.dto.EmployeeCreatedDTO;
import com.democnpm.demo.api.dto.EmployeeDTO;
import com.democnpm.demo.api.dto.EmployeeUpdatedDTO;
import com.democnpm.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping({"","/employee"})
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Set<EmployeeDTO> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeDTO addEmployee(@RequestBody EmployeeCreatedDTO employeeCreatedDTO){
        return employeeService.addEmployee(employeeCreatedDTO);
    }

    @PutMapping("/add/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeDTO updateEmployee(@RequestBody EmployeeUpdatedDTO employeeUpdatedDTO){
        return employeeService.updateEmployee(employeeUpdatedDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}
