package com.example.EduLearn.service;



import com.example.EduLearn.dto.CourseDTO;
import com.example.EduLearn.dto.DoubtDTO;
import com.example.EduLearn.model.Course;
import com.example.EduLearn.model.Doubt;
import com.example.EduLearn.repository.CourseRepo;
import com.example.EduLearn.repository.DoubtRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoubtService {

    @Autowired
    private DoubtRepo doubtRepo;

    @Autowired
    private ModelMapper modelMapper;
    public List<Doubt> getAllDoubts(){
//        return doubtRepo.findAll();
        List<Doubt> doubtList = doubtRepo.findAll();
        return doubtList;
    }

    public DoubtDTO saveDoubt(DoubtDTO doubtDTO){
//         doubtRepo.save(doubt);
        doubtRepo.save(modelMapper.map(doubtDTO,    Doubt.class));
        System.out.println("here htge");
        return doubtDTO;
    }

}
