package com.example.demo.student;

import com.example.demo.Drive.Drive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
