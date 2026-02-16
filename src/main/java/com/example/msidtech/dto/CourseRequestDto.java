package com.example.msidtech.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseRequestDto {
    private String courseName;
    private Double price;
    private String description;
    private String level;
    private String status;
}
