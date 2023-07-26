package com.example.EduLearn.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString



public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String subject;
    private String ImgPath;
    private String description;
    private String name;
    private String language;
    private String city;
    private String type;
    private String email;
    private String mobile;
}
