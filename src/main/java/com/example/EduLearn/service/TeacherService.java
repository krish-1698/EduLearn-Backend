package com.example.EduLearn.service;


import com.example.EduLearn.dto.TeacherDTO;
import com.example.EduLearn.model.Teacher;
import com.example.EduLearn.repository.TeacherRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private ModelMapper modelMapper;

    public TeacherDTO saveTeacher(TeacherDTO teacherDTO){
        teacherRepo.save(modelMapper.map(teacherDTO, Teacher.class));
        return teacherDTO;
    }

    public List<Teacher>  getTeacher(){
       List<Teacher> teacher =  teacherRepo.findAll();
        return teacher;
    }

    public long getTeacherCount() {
        return teacherRepo.count();
    }
}
