package com.example.EduLearn.dto;


import com.example.EduLearn.model.Student;
import com.example.EduLearn.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String password;
    private String username;
    private String name;
    private String email;
    private String role;
    private String state;
    private Student student;
    private Teacher teacher;
}

