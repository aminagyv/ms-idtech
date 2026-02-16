package com.example.msidtech.mapper;

import com.example.msidtech.dto.TeacherRequestDto;
import com.example.msidtech.entity.TeacherEntity;

public class TeacherMapper {
    public static TeacherEntity mapTeacherDtoTeacherEntity(TeacherRequestDto dto){
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setTeacherName(dto.getTeacherName());
        teacherEntity.setTeacherSurname(dto.getTeacherSurname());
        teacherEntity.setTeacherEmail(dto.getTeacherEmail());
        teacherEntity.setSpecialty(dto.getSpecialty());
        return teacherEntity;
    }
}
