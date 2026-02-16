package com.example.msidtech.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherRequestDto {
    private String teacherName;
    private String teacherSurname;
    private String teacherEmail;
    private String specialty;
    private LocalDate brithDay;
}
