package com.example.EduLearn.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private String level;
    private Date rateAdded;

    @ManyToOne
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Course ratingCourse;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User ratingUser;

}
