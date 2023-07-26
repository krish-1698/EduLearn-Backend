package com.example.EduLearn.service;

import com.example.EduLearn.dto.CourseDTO;
import com.example.EduLearn.model.Course;
import com.example.EduLearn.model.Teacher;
import com.example.EduLearn.model.User;
import com.example.EduLearn.repository.CourseRepo;
import com.example.EduLearn.repository.EnrolmentRepo;
import com.example.EduLearn.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private EnrolmentRepo enrolmentRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;

    public CourseDTO saveCourse(CourseDTO courseDTO){
        courseRepo.save(modelMapper.map(courseDTO, Course.class));
        System.out.println("here htge");
        return courseDTO;
    }

    public List<CourseDTO> getAllCourses(){
//        return courseRepo.findAll();
//        List<CourseDTO> courseDTOS = new ArrayList<>();
        List<Course> courseList = courseRepo.findAll();

//
//        for(Course course: courseList){
//
//            Teacher teacher = course.getTeacher();
//            User user =  userService.getUserById(teacher.getUserTeacher().getId());
//            CourseDTO courseDTO = new CourseDTO();
//
//            courseDTO.setId(course.getId());
//            courseDTO.setImgPath(course.getImgPath());
//            courseDTO.setUser(user);
//            courseDTO.setTitle(course.getTitle());
////            courseDTO.setStudentNumber(enrolmentRepo.getTheNumOfUsers(course.getId()));
//            courseDTOS.add(courseDTO);
//        }

//        return courseDTOS;

        return modelMapper.map(courseList, new TypeToken<List<CourseDTO>>(){}.getType());
    }


}
