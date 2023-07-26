package com.example.EduLearn.service;

import com.example.EduLearn.dto.EnrolmentDTO;
import com.example.EduLearn.model.Enrolment;
import com.example.EduLearn.repository.EnrolmentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrolmentService {
    @Autowired
    private EnrolmentRepo enrolmentRepo;
    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    private UserService userService;

//    public EnrolmentDTO saveEnrolment(EnrolmentDTO enrolmentDTO) {
//
//    }


    public List<EnrolmentDTO> getAllEnrolment() {
        List<Enrolment> enrolmentList = enrolmentRepo.findAll();
        return modelMapper.map(enrolmentList, new TypeToken<List<EnrolmentDTO>>(){}.getType());
    }
}
