package com.example.msidtech.service;

import com.example.msidtech.dto.CourseRequestDto;
import com.example.msidtech.dto.CourseResponseDto;
import com.example.msidtech.entity.CourseEntity;
import com.example.msidtech.exception.NotFoundException;
import com.example.msidtech.repository.CoursesRepository;
import com.example.msidtech.mapper.CourseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CoursesRepository courseRepository;

    public CourseEntity addCourse(CourseRequestDto courseRequestDto) {
        var courseEntity = CourseMapper.mapCourseDtoCourseEntity(courseRequestDto);
        return courseRepository.save(courseEntity);
    }

    public CourseResponseDto getCourseById(Long id) {
        var courseEntity = courseRepository.findById(id).orElseThrow(()->new NotFoundException("Course not found"));
        var response = CourseMapper.mapCourseDtoCourseResponseDto(courseEntity);
        return response;
    }

    public void deleteCourseById(Long id) {
       var course= courseRepository.findById(id).orElseThrow(()->new NotFoundException("Course Not Found"));
        courseRepository.delete(course);
    }


    public CourseEntity getUpdateCourseById(Long id, CourseRequestDto courseRequestDto) {
        var courseEntity = courseRepository.findById(id).orElse(null);
        CourseMapper.updateCourse(courseRequestDto,courseEntity);
       return courseRepository.save(courseEntity);
    }

}
