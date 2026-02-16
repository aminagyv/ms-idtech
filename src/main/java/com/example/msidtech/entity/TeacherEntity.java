package com.example.msidtech.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Data
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "teacher_surname")
    private String teacherSurname;

    @Column(name = "teacher_email")
    private String teacherEmail;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "brith_day")
    private LocalDate brithDay;
}
