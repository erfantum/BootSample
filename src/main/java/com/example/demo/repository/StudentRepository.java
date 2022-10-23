package com.example.demo.repository;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
    StudentEntity findStudentById(Integer integer);

    StudentEntity findStudentByUsername(String username);

    @Override
    <S extends StudentEntity> S save(S entity);
}
