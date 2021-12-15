package com.example.demo.Drive;

import com.example.demo.student.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/drive")
@CrossOrigin("*")
public class DriveController {
    private final DriveService driveService;

    public DriveController(com.example.demo.Drive.DriveService driveService) {
        this.driveService = driveService;
    }
    @GetMapping
    public ResponseEntity<List<Drive>> getDrives(){
        return ResponseEntity.ok().body(driveService.getDrives());
    }

//    @GetMapping("/availableAm")
//    public List <Drive> getDrivesByAvailable(){
//        return driveService.getDrivesByAvailable();
//    }


    @PostMapping
    public Drive saveDrive(@RequestBody Drive drive){
        System.out.println(drive);
        return driveService.getDrive(drive);
    }

    @PostMapping("/add_student")
    public ResponseEntity<Drive> addStudentsToDrive(@RequestBody Form form){
        driveService.addStudentsToDrive(form.getdrive(),form.getstudentId());
        return ResponseEntity.ok().build();
    }



    @DeleteMapping("/{id}")
    public void deleteDrive(@PathVariable String id){
        driveService.deletDrive(id);
    }

    @PutMapping ("/{id}")
    public Drive updateDrive( @PathVariable String id ,@RequestBody Drive drive){
        return driveService.updateDrive(id , drive);
    }
}

class Form {
    private Drive drive;
    private long studentId;

    public Drive getdrive() {
        return drive;
    }

    public long getstudentId() {
        return studentId;
    }
}