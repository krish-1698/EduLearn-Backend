package com.example.EduLearn.dto;

import com.example.EduLearn.model.Teacher;
import com.example.EduLearn.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDTO {
    private int id;
    private String title;
    private String description;
    private String language;
    private String Amount;
    private int credits;
    private float hours;
    private String imgPath;
    private String subject;
    private String state;
    private String updated_date;
    private int teacherId;
//    private List<User> user;
    private String rating;
    private User user;
    private int studentNumber;
}
