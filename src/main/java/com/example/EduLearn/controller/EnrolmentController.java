package com.example.EduLearn.controller;

import com.example.EduLearn.dto.EnrolmentDTO;
import com.example.EduLearn.service.EnrolmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/enrolment")
@CrossOrigin
public class EnrolmentController {

    @Autowired
    private EnrolmentService enrolmentService;

//    @PostMapping("/saveEnrolment")
//    public EnrolmentDTO saveAnnouncement(@RequestBody EnrolmentDTO enrolmentDTO){
//        return enrolmentService.saveEnrolment(enrolmentDTO);
//    }

    @GetMapping("/getAllEnrolments")
    public List<EnrolmentDTO> getAllAnnouncement(){
        return enrolmentService.getAllEnrolment();
    }



}