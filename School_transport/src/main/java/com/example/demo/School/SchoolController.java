package com.example.demo.School;

import com.example.demo.Drive.Drive;
import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "School")
@CrossOrigin("*")
public class SchoolController {

    private final SchoolService schoolService;
    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @GetMapping
    public ResponseEntity<List<School>> getSchools(){
        return ResponseEntity.ok().body(schoolService.getSchools());
    }

    @PostMapping
    public School saveSchool(@RequestBody School School){
        System.out.println(School.getUser());
        return schoolService. saveSchool(School);
    }



    @GetMapping("/{id}")

    public School getSchool(@PathVariable String id){
        return schoolService.getSchool(id);
    }

}
