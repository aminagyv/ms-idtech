package com.example.msidtech.mapper;

import com.example.msidtech.dto.CourseRequestDto;
import com.example.msidtech.dto.CourseResponseDto;
import com.example.msidtech.entity.CourseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CourseMapper {
    public static CourseEntity mapCourseDtoCourseEntity(CourseRequestDto dto) {
        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setCourseName(dto.getCourseName());
        courseEntity.setPrice(dto.getPrice());
        courseEntity.setDescription(dto.getDescription());
        courseEntity.setLevel(dto.getLevel());
        courseEntity.setStatus(dto.getStatus());
        courseEntity.setCreatedAt(LocalDateTime.now());
        courseEntity.setUpdatedAt(LocalDateTime.now());
        return courseEntity;
    }

    public static CourseResponseDto mapCourseDtoCourseResponseDto(CourseEntity entity) {
        CourseResponseDto dto = new CourseResponseDto();
        dto.setCourseName(entity.getCourseName());
        dto.setPrice(entity.getPrice());
        dto.setDescription(entity.getDescription());
        dto.setLevel(entity.getLevel());
        dto.setStatus(entity.getStatus());
        dto.setUpdatedAt(LocalDate.now());
        dto.setCreatedAt(LocalDate.now());
        return dto;
    }
    public static void updateCourse(CourseRequestDto dto, CourseEntity courseEntity) {
        courseEntity.setCourseName(dto.getCourseName());
        courseEntity.setPrice(dto.getPrice());
        courseEntity.setDescription(dto.getDescription());
        courseEntity.setLevel(dto.getLevel());
        courseEntity.setStatus(dto.getStatus());
    }
}
