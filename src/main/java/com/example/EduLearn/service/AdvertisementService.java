package com.example.EduLearn.service;


import com.example.EduLearn.dto.CourseDTO;
import com.example.EduLearn.model.Advertisement;
import com.example.EduLearn.model.Course;
import com.example.EduLearn.repository.AdvertisementRepo;
import com.example.EduLearn.repository.CourseRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {
    @Autowired
    private AdvertisementRepo advertisementRepo;

    @Autowired
    private ModelMapper modelMapper;

    public Advertisement saveAdvertisement(Advertisement advertisement) {
        advertisementRepo.save(advertisement);
        System.out.println("here htge");
        return advertisement;
    }
}