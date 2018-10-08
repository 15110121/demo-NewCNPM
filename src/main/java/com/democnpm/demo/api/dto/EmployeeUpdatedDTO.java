package com.democnpm.demo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeUpdatedDTO {

    @NotBlank
    private String name;

    @Email
    private String email;

    private String company;

    private int age;
}
