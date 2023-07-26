package com.example.EduLearn.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DoubtDTO {

    private int id;
    private String topic;
    private String description;
    private String imgPath;
    private int userId;

}
