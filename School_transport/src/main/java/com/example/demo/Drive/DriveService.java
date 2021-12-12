package com.example.demo.Drive;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriveService {
    private final DriveRepo driveRepo;
    private final StudentRepo studentRepo;
    @Autowired
    public DriveService(DriveRepo driveRepo, StudentRepo studentRepo) {
        this.driveRepo = driveRepo;
        this.studentRepo = studentRepo;
    }


    public List<Drive> getDrives(){
        return driveRepo.findAll();
    }

    public Drive getDrive(Drive drive){
        return driveRepo.save(drive);
    }
    public void addStudentsToDrive(Drive driveName , Long studentName ){
       Drive drive = driveRepo.findById(driveName.getId()).orElse(null);
        Student student=studentRepo.findById(studentName).orElse(null);
        drive.getStudents().add(student);
        driveRepo.save(drive);
    }

    public void deletDrive(String id){
        Long Drive_id = Long.parseLong(id);
        driveRepo.deleteById(Drive_id);
    }
    public Drive updateDrive(String id , Drive data){
        Long student_id = Long.parseLong(id);
        Drive drive= driveRepo.findById(student_id).orElse(null);
        System.out.println(drive.toString());
        if(drive != null){
            drive.setPassWord(data.getPassWord() );
            drive.setPhoneNumber(data.getPhoneNumber());
            drive.setPlatNumber(data.getPlatNumber());
            driveRepo.save(drive);
        }

        return drive;
    }


}
