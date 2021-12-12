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

    @PostMapping
    public Drive saveDrive(@RequestBody Drive drive){
        return driveService.getDrive(drive);
    }

    @DeleteMapping("/{id}")
    public void deleteDrive(@PathVariable String id){
        driveService.deletDrive(id);
    }
}
