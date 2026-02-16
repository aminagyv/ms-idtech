package com.example.msidtech.service;

import com.example.msidtech.dto.TeacherRequestDto;
import com.example.msidtech.entity.TeacherEntity;
import com.example.msidtech.mapper.TeacherMapper;
import com.example.msidtech.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherEntity addTeacher(TeacherRequestDto teacherRequestDto) {
        var teacherEntity= TeacherMapper.mapTeacherDtoTeacherEntity(teacherRequestDto);
        return teacherRepository.save(teacherEntity);
    }
}
