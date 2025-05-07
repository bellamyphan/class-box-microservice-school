package com.bellamyphan.microservice_school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok annotation to generate getters, setters, and other utility methods
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Long schoolId;
}
