package com.bellamyphan.microservice_school.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto {

    private String name;
    private String email;
    List<StudentDto> students;
}
