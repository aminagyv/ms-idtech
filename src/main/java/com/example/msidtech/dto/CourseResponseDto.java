package com.example.msidtech.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseResponseDto {
    private String courseName;
    private Double price;
    private String description;
    private String level;
    private String status;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
