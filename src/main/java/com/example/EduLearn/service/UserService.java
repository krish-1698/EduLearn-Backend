package com.example.EduLearn.service;

import com.example.EduLearn.dto.StudentDTO;
import com.example.EduLearn.dto.TeacherDTO;
import com.example.EduLearn.dto.UserDTO;
import com.example.EduLearn.model.User;
import com.example.EduLearn.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private ModelMapper modelMapper;


    public UserDTO getUserByEmailAndPassword(String email, String password){
        User user = userRepo.findUserByEmailAndPassword(email,password);
        System.out.println("hdond");
        user.setTeacher(null);
        return modelMapper.map(user,UserDTO.class);
    }
    public UserDTO saveUser(UserDTO userDTO){
        User user = userRepo.save(modelMapper.map(userDTO, User.class));
        System.out.println(user);
        if(user.getRole().equalsIgnoreCase("Student")){
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setUserStudent(user);
            studentService.saveStudent(studentDTO);
        }else{
            TeacherDTO teacherDTO = new TeacherDTO();
            teacherDTO.setUserTeacher(user);
            teacherService.saveTeacher(teacherDTO);
        }

        return userDTO;
    }

    public User getUserById(int userId){
        return userRepo.getUserById(userId);
    }
}
