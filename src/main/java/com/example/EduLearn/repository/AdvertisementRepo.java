package com.example.EduLearn.repository;

import com.example.EduLearn.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertisementRepo extends JpaRepository<Advertisement, Integer> {
}
