package com.example.EduLearn.repository;

import com.example.EduLearn.model.Doubt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoubtRepo extends JpaRepository<Doubt, Integer> {
}
