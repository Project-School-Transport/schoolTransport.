package com.example.demo.School;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepo schoolRepo;
    @Autowired
    public SchoolService(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    public School getSchool(School school) {
        System.out.println(school.toString());

        return schoolRepo.save(school);
    }

    public void deletStudent(String id) {
        Long Student_id = Long.parseLong(id);

        schoolRepo.deleteById(Student_id);
    }

    public List<School> getSchools(){

        return schoolRepo.findAll();
    }
}
