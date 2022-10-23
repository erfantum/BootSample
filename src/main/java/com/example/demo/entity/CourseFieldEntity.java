package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseFieldEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private FieldEntity fieldEntity;



    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private CourseEntity courseEntity;



}
