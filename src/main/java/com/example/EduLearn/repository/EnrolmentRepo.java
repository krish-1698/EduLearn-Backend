package com.example.EduLearn.repository;

import com.example.EduLearn.model.Enrolment;
import com.example.EduLearn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrolmentRepo extends JpaRepository<Enrolment, Integer> {

    @Query("SELECT COUNT(c) FROM Enrolment c where c.courses.id = :courseId")
    public int getTheNumOfUsers(@Param("courseId") Integer courseId);
}
