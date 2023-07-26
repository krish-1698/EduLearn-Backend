package com.example.EduLearn.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String language;
    private String Amount;
    private int credits;
    private float hours;
    private String imgPath;
    private String subject;

//    @JsonBackReference(value ="teacher_course" )
    @JoinColumn(name= "teacher_id", referencedColumnName = "id")
    @ManyToOne
    private Teacher teacher;

//    @JsonManagedReference(value ="course_enrolment" )
    @JsonIgnore
    @OneToMany(mappedBy = "courses")
    private List<Enrolment> enrolment;

    @OneToMany(mappedBy = "topicCourse")
    private Set<SubTopic> subTopic;

    @OneToMany(mappedBy = "ratingCourse")
    private Set<Rating> rating;

    @OneToMany(mappedBy = "wishCourses")
    private Set<Wishlist> wishlist;

    private String updated_date;
    private String state;
}
