package com.example.msidtech.controller;

import com.example.msidtech.dto.TeacherRequestDto;
import com.example.msidtech.entity.TeacherEntity;
import com.example.msidtech.repository.TeacherRepository;
import com.example.msidtech.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService  teacherService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TeacherEntity addTeacher(@RequestBody TeacherRequestDto teacherRequestDto) {
        return  teacherService.addTeacher(teacherRequestDto);
    }
}
