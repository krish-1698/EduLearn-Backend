package com.example.EduLearn.repository;

import com.example.EduLearn.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
