package com.example.EduLearn.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String password;
    private String name;
    private String email;
    private String username;
    private String role;

    @JsonIgnore
    @OneToOne(mappedBy = "userStudent")
    private Student student;

//    @JsonManagedReference(value ="user_teacher" )
    @JsonIgnore
    @OneToOne(mappedBy = "userTeacher")
    private Teacher teacher;

//    @JsonManagedReference(value ="user_enrolment" )
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Enrolment> enrolment;

    @OneToOne(mappedBy = "ratingUser")
    private Rating rating;

    @OneToMany(mappedBy = "doubtUser")
    private Set<Doubt> doubt;

    @OneToMany(mappedBy = "answerUser")
    private Set<Answer> answer;

    @OneToMany(mappedBy = "wishUser")
    private Set<Wishlist> wishlist;

    private String state;
}
