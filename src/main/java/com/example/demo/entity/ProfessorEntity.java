package com.example.demo.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProfessorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String nId;

    private Date birthDate;

    private String ProfessorNumber;

    private String username;

    private String password;

    private boolean enabled;

    @OneToMany(mappedBy = "professorEntity")
    private List<ClassEntity> classEntities;

}
