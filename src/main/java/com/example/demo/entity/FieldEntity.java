package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class FieldEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fieldCode;

    @OneToMany(mappedBy = "fieldEntity")
    private Set<StudentEntity> studentEntitySet;

}
