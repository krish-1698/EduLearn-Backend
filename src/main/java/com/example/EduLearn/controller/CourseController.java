package com.example.EduLearn.controller;

import com.example.EduLearn.dto.CourseDTO;
import com.example.EduLearn.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/course")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private FileUpload fileUpload;

    @GetMapping("/getAllCourses")
    public List<CourseDTO> getAllCourse(){
        return courseService.getAllCourses();
    }



    @PostMapping("/saveCourse")
    public CourseDTO saveCourse(@RequestBody CourseDTO courseDTO){
        return courseService.saveCourse(courseDTO);
    }



//    @PostMapping("/uImage")
//    public String uploadFile(@RequestParam("image") MultipartFile multipartFile) throws IOException {
//        String imageURL = fileUpload.uploadFile(multipartFile);
//        return imageURL;
//    }
    @GetMapping("/uImage")
    public String uploadFile(){
//        String imageURL = fileUpload.uploadFile(name);
        return "Kishan";
    }
}

