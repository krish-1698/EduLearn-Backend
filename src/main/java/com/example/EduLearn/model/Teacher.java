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


public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nic;
    private String city;
    private int mobileNo;
    private String Qualification;
    private String status;

//    @JsonBackReference(value = "user_teacher")
    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User userTeacher;

//    @JsonManagedReference(value ="teacher_course" )
    @JsonIgnore
    @OneToMany(mappedBy = "teacher")
    private List<Course> course;
}
