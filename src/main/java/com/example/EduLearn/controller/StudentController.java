package com.example.EduLearn.controller;

import com.example.EduLearn.dto.StudentDTO;
import com.example.EduLearn.repository.UserRepo;
import com.example.EduLearn.service.StudentService;
import com.example.EduLearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/getAllStudentCount")
    public long getStudentCount() {
//        return studentService.getStudentCount();
        return  userRepo.count();
    }

    @GetMapping("/getStudents")
    public List<StudentDTO> getAllStudents(){
        return studentService.getAllStudents();

    }
//    public String getStudent(){
//        return "getStudents Success";
//
//    }

    @PostMapping("/saveStudent")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }
}
