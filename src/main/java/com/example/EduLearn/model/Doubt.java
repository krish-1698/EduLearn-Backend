package com.example.EduLearn.model;


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

public class Doubt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User doubtUser;

    @OneToMany(mappedBy = "doubt")
    private Set<Answer> answer;

    private String topic;
    private String imgPath;
    private String description;

}
