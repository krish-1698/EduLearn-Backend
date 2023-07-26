package com.example.EduLearn.repository;

import com.example.EduLearn.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepo extends JpaRepository<Answer, Integer> {
}
