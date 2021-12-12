package com.example.demo.Drive;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveRepo extends JpaRepository<Drive, Long> {
   
}
