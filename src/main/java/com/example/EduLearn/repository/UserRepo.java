package com.example.EduLearn.repository;

import com.example.EduLearn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User getUserById(int id);
    User findUserByEmailAndPassword(String email,String password);
}
