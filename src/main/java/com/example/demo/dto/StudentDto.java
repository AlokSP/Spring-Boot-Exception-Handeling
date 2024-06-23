package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDto {

    int rollNo;

    @NotEmpty(message = "Student first name should not be null")
    private String firstName;

    @NotEmpty(message = "Student last name should not be null")
    private String lastName;

    @NotEmpty(message = "Student email should not be null")
    @Email(message = "Email should be valid")
    private String email;

}
