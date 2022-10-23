package com.example.demo.entity;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String nId;

    private String studentNumber;

    private Date birthDate;

    private Date enteredYera;

    private String username;

    private String password;

    private boolean enabled;



    @Lob
    @Type(type = "org.hibernate.type.ImageType")
    private byte[] image;


    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private FieldEntity fieldEntity;

    @OneToMany(mappedBy = "studentEntity")
    private List<StudentClassEntity> studentClassEntityList;
}
