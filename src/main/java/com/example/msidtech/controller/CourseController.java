package com.example.msidtech.controller;

import com.example.msidtech.dto.CourseRequestDto;
import com.example.msidtech.entity.CourseEntity;
import com.example.msidtech.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CourseEntity addCurse(@RequestBody CourseRequestDto courseRequestDto) {
       return courseService.addCourse(courseRequestDto);
    }

    @GetMapping("/{id}")
    public void getCourseById(@PathVariable Long id) {

        courseService.getCourseById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable Long id) {
        courseService.deleteCourseById(id);
    }

    @PutMapping("/{id}")
    public CourseEntity getUpdateCourseByCourseId(@PathVariable Long id, @RequestBody
    CourseRequestDto courseRequestDto) {
       return courseService.getUpdateCourseById(id, courseRequestDto);
    }
}
