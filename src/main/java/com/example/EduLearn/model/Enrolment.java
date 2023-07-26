package com.example.EduLearn.model;

import com.fasterxml.jackson.annotation.*;
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

public class Enrolment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String enroledDate;


//    @JsonBackReference(value ="course_enrolment" )
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Course courses;

//    @JsonBackReference(value ="user_enrolment" )
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
