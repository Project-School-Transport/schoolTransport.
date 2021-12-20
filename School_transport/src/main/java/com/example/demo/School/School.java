package com.example.demo.School;

import com.example.demo.Drive.Drive;
import com.example.demo.User.User;
import com.example.demo.student.Student;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "School")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float latitude;
    private float longitude;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school")
        private List<Drive> drive = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school")
    private List<Student> student = new ArrayList<>();

//    @JsonManagedReference
//    cascade = CascadeType.ALL ,optional = true
    @OneToOne(fetch = FetchType.EAGER)
    private User user;
    public School() {

    }

    public School(long id, float latitude, float longitude, List<Drive> drive, List<Student> student, User user) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.drive = drive;
        this.student = student;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public List<Drive> getDrive() {
        return drive;
    }

    public void setDrive(List<Drive> drive) {
        this.drive = drive;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
