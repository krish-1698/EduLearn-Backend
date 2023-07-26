package com.example.EduLearn.repository;

import com.example.EduLearn.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
