package com.example.demo.repository;

import com.example.demo.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<ProfessorEntity,Integer> {

    ProfessorEntity findTeacherById(Integer id);

    @Override
    <S extends ProfessorEntity> S save(S entity);
}
