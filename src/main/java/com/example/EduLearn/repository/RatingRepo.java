package com.example.EduLearn.repository;

import com.example.EduLearn.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating, Integer> {
}
