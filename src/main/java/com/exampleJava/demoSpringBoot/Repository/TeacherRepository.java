package com.exampleJava.demoSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.exampleJava.demoSpringBoot.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    Teacher findTeacherById(Long id);
}