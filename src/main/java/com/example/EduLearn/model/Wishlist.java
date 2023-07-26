package com.example.EduLearn.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Course wishCourses;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User wishUser;
}
