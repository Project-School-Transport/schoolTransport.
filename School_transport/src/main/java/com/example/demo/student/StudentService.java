package com.example.demo.student;

import com.example.demo.User.User;
import com.example.demo.User.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;
    private final UserRepo userRepo;
    @Autowired
    public StudentService(StudentRepo studentRepo, UserRepo userRepo) {
        this.studentRepo = studentRepo;
        this.userRepo = userRepo;
    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }


    public Student getStudent(String id) {
        Long user_id = Long.parseLong(id);
        return studentRepo.findById(user_id).orElse(null);
    }
//    public Collection<Drive> getDrive(String id){
//        Long Student_id = Long.parseLong(id);
//        Student student= studentRepo.findById(Student_id).orElse(null);
//        System.out.println(student.getDrives());
//        return student.getDrives();
//    }

    public Student saveStudent(Student student) {
        User user=userRepo.findById(student.getUser().getId()).orElse(null);
        student.setUser(user);
        return studentRepo.save(student);
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




    public List<Student> getDrivesByAvailableAm() {
        System.out.println(studentRepo.findAllByisActiveAm(true));
        return studentRepo.findAllByisActiveAm(true);
    }

    public List<Student> getDrivesByAvailablePm() {

        return studentRepo.findAllByisActivePm(true);
    }
}
