package com.example.demo.Drive;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriveRepo extends JpaRepository<Drive, Long> {

    public List<Drive> findAllByisActiveAm(boolean isActiveAm);
}
