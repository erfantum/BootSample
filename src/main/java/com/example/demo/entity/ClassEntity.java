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
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ProfessorEntity professorEntity;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private CourseEntity courseEntity;

    @OneToMany(mappedBy = "classEntity")
    private List<StudentClassEntity> studentClassEntityList;


    private String classCode;


}
