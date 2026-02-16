package com.example.msidtech.repository;

import com.example.msidtech.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<CourseEntity, Long> {
}
