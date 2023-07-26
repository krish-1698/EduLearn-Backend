package com.example.EduLearn.controller;


import com.example.EduLearn.dto.CourseDTO;
import com.example.EduLearn.dto.DoubtDTO;
import com.example.EduLearn.model.Doubt;
import com.example.EduLearn.service.CourseService;
import com.example.EduLearn.service.DoubtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/doubt")
@CrossOrigin
public class DoubtController {


    @Autowired
    private DoubtService doubtService;


    @GetMapping("/getAllDoubts")
    public List<Doubt> getAllDoubts(){
        return doubtService.getAllDoubts();
    }



    @PostMapping("/saveDoubt")
    public DoubtDTO saveDoubt(@RequestBody DoubtDTO doubtDTO){
        System.out.println("nknkx");
        return doubtService.saveDoubt(doubtDTO);
    }
}
