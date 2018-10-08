package com.democnpm.demo.boostrap;

import com.democnpm.demo.domain.Employee;
import com.democnpm.demo.repository.EmployeeRepository;
import com.democnpm.demo.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DataLoader implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    public DataLoader(EmployeeService employeeService, EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = new Employee();
        employee1.setName("Le Dinh Quang");
        employee1.setEmail("quang@gmail.com");
        employee1.setCompany("TMA");
        employee1.setAge(21);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Lam Thanh Tai");
        employee2.setAge(21);
        employee2.setEmail("tai@gmail.com");
        employee2.setCompany("FPT");
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setName("William Mike");
        employee3.setAge(10);
        employee3.setEmail("will@gmail.com");
        employee3.setCompany("SCS");
        employeeRepository.save(employee3);

        Employee employee4 = new Employee();
        employee4.setName("John Thompson");
        employee4.setAge(27);
        employee4.setEmail("john@gmail.com");
        employee4.setCompany("FPT");
        employeeRepository.save(employee4);

        Employee employee5 = new Employee();
        employee5.setName("Justin Mark");
        employee5.setAge(25);
        employee5.setEmail("mark@gmail.com");
        employee5.setCompany("TMA");
        employeeRepository.save(employee5);
    }
}
