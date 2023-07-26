package com.example.EduLearn.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString



public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="doubt_id", referencedColumnName = "id")
    private  Doubt doubt;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private  User answerUser;


    private String imgPath;
    private String description;
    private String voicePath;
}
