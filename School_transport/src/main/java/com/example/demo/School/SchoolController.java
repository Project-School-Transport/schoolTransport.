package com.example.demo.School;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
//    @GetMapping
//    public ResponseEntity<List<School>> getSchools(){
//        return ResponseEntity.ok().body(schoolService.getSchools());
//    }

    @PostMapping
    public School saveSchool(@RequestBody School School){
        return schoolService.getSchool(School);
    }

}
