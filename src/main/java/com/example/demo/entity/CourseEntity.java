package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseCode;

    private String courseName;

    @OneToMany(mappedBy = "courseEntity")
    private List<CourseFieldEntity> courseFieldEntities;

    @OneToMany(mappedBy = "courseEntity")
    private List<ClassEntity> classEntities;

}
