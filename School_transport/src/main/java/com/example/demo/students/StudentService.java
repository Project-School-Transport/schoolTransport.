package com.example.demo.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;
    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    public Student getStudent(Student Student){
        System.out.println(Student.getisActiveAm() + "  "+Student.getisActivePm() );
        return studentRepo.save(Student);
    }

    public void deletStudent(String id){
        Long Student_id = Long.parseLong(id);
        studentRepo.deleteById(Student_id);
    }


}
