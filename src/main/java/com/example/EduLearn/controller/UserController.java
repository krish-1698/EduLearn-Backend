package com.example.EduLearn.controller;

import com.example.EduLearn.dto.UserDTO;
import com.example.EduLearn.repository.UserRepo;
import com.example.EduLearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/getUser/{email}/{password}")
    public UserDTO getUserByEmailAndPassword(@PathVariable("email") String email, @PathVariable("password") String password){
        return userService.getUserByEmailAndPassword(email,password);
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @GetMapping("/getAllUserCount")
    public long getUserCount(){
        return userRepo.count();
    }

}
