package com.example.EduLearn.controller;

import com.example.EduLearn.dto.TeacherDTO;
import com.example.EduLearn.repository.UserRepo;
import com.example.EduLearn.service.TeacherService;
import com.example.EduLearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/lecturer")
@CrossOrigin
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/saveTeacher")
    public TeacherDTO saveLecturer(@RequestBody TeacherDTO teacherDTO){
        return teacherService.saveTeacher(teacherDTO);
    }

//    @GetMapping("/getAllTeacherCount")
//    public long getLecturerCount(){
//        return teacherService.;
//    }

    @GetMapping("/getAllTeachers")
    public String getLecturer(){
        return  "teacherService.sjjsk()";
    }

    @GetMapping("/getData")
    public  String getData(){
        return  "Data obtained";
    }


}

