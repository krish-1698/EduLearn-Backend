package com.example.EduLearn.dto;

import com.example.EduLearn.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TeacherDTO {
    private int id;
    private String nic;
    private String city;
    private int mobileNo;
    private String Qualification;
    private String status;
    private User userTeacher;
}
