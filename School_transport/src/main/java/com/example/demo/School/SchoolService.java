package com.example.demo.School;

import com.example.demo.User.User;
import com.example.demo.User.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepo schoolRepo;
    private final UserRepo userRepo;
    @Autowired
    public SchoolService(SchoolRepo schoolRepo, UserRepo userRepo) {
        this.schoolRepo = schoolRepo;
        this.userRepo = userRepo;
    }


    public School saveSchool(School school) {
        User user = userRepo.findById(school.getUser().getId()).orElse(null);
        school.setUser(user);
        return schoolRepo.save(school);
    }

    public School getSchool(String id) {
        Long School_id = Long.parseLong(id);

        return schoolRepo.findById(School_id).orElse(null);
    }

    public List<School> getSchools(){

        return schoolRepo.findAll();
    }


}
