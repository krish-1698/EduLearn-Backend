package com.example.EduLearn.repository;

import com.example.EduLearn.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepo extends JpaRepository<Wishlist, Integer> {
}
