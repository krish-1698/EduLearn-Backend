package com.example.EduLearn.dto;

import com.example.EduLearn.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private int id;
    private User userStudent;
}
