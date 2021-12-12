package com.example.demo.School;

import com.example.demo.Drive.Drive;
import com.example.demo.student.Student;

import javax.persistence.*;

@Entity
@Table(name = "School")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Long latitude;
    private Long longitude;
    private Long password;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "drive_id")
    private Drive drive;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;
    public School() {
    }

    public School(long id, String name, Long latitude, Long longitude, Long password, Drive drive, Student student) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.password = password;
        this.drive = drive;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
