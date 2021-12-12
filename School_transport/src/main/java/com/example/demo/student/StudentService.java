package com.example.demo.student;

import com.example.demo.Drive.Drive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
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

    public Collection<Drive> getDrive(String id){
        Long Student_id = Long.parseLong(id);
        Student student= studentRepo.findById(Student_id).orElse(null);
        System.out.println(student.getDrives());
        return student.getDrives();
    }

    public Student getStudent(Student Student){

        return studentRepo.save(Student);
    }

    public void deletStudent(String id){
        Long Student_id = Long.parseLong(id);
        studentRepo.deleteById(Student_id);
    }

    public Student updateStudent(String id , Student data){
        Long student_id = Long.parseLong(id);
        Student student= studentRepo.findById(student_id).orElse(null);
        System.out.println(student.toString());
        if(student != null){
            student.setPassWord(data.getPassWord() );
            student.setLongitude(data.getLongitude());
            student.setLatitude( data.getLatitude());
            student.setActiveAm(!student.isActiveAm());
            student.setActivePm(!student.isActivePm());
            studentRepo.save(student);
        }

        return student;
    }


}
