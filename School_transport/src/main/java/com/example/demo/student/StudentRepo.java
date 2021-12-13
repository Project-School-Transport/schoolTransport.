package com.example.demo.student;

import com.example.demo.Drive.Drive;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
    public List<Student> findAllByisActiveAm(boolean isActiveAm);
    public List<Student> findAllByisActivePm(boolean isActiveAm);
}
