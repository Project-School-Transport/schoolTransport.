package com.example.demo.School;

import com.example.demo.Drive.Drive;
import com.example.demo.student.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school")
        private List<Drive> drive = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school")
    private List<Student> student = new ArrayList<>();

    public School() {

    }

    public School(long id, String name, Long latitude, Long longitude, Long password) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.password = password;
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
}
