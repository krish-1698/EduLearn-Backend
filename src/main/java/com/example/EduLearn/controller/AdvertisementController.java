package com.example.EduLearn.controller;


import com.example.EduLearn.model.Advertisement;
import com.example.EduLearn.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/advertisement")
@CrossOrigin
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @PostMapping("/saveAd")
    public Advertisement saveAdvertisement(@RequestBody  Advertisement advertisement){
        return advertisementService.saveAdvertisement(advertisement);
    }
}
