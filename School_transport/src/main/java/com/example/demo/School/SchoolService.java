package com.example.demo.School;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    private final SchoolRepo schoolRepo;
    @Autowired
    public SchoolService(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    public School getSchool(School school) {
        return schoolRepo.save(school);
    }
}
