package com.example.demo.student;

import com.example.demo.Drive.Drive;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "student")
@CrossOrigin("*")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok().body(studentService.getStudents());
    }
    @GetMapping("/{id}")
    public Collection<Drive> getDrive(@PathVariable String id ){
        return studentService.getDrive(id);
    }
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.getStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deletStudent(id);
    }
    @PutMapping ("/{id}")
    public Student updateStudent( @PathVariable String id ,@RequestBody Student student){
        return studentService.updateStudent(id , student);
    }
}
