package com.example.demo.School;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School, Long> {

}
